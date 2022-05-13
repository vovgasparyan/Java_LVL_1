package com.aca.homework.week18.website.facade.post;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.facade.dto.ImageDto;
import com.aca.homework.week18.website.facade.dto.PostDto;
import com.aca.homework.week18.website.facade.dto.UserDto;
import com.aca.homework.week18.website.facade.image.ImageMapper;
import com.aca.homework.week18.website.facade.image.ImageMapperImpl;
import com.aca.homework.week18.website.facade.request.image.ImageUploadRequestDto;
import com.aca.homework.week18.website.facade.request.post.GetAllUserPostsRequestDto;
import com.aca.homework.week18.website.facade.request.post.PostCreateRequestDto;
import com.aca.homework.week18.website.facade.response.image.ImageUploadResponseDto;
import com.aca.homework.week18.website.facade.response.post.GetAllUserPostsResponseDto;
import com.aca.homework.week18.website.facade.response.post.PostCreateResponseDto;
import com.aca.homework.week18.website.facade.user.UserMapper;
import com.aca.homework.week18.website.facade.user.UserMapperImpl;
import com.aca.homework.week18.website.service.core.image.CreateImageParams;
import com.aca.homework.week18.website.service.core.image.ImageService;
import com.aca.homework.week18.website.service.core.post.CreatePostParams;
import com.aca.homework.week18.website.service.core.post.PostService;
import com.aca.homework.week18.website.service.core.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.LinkedList;
import java.util.List;

public class PostFacadeImpl implements PostFacade {

    private static Logger LOGGER = LoggerFactory.getLogger(PostFacadeImpl.class);

    private UserService userService;
    private PostService postService;
    private ImageService imageService;

    private UserMapper userMapper = new UserMapperImpl();
    private PostMapper postMapper = new PostMapperImpl(userMapper);
    private ImageMapper imageMapper = new ImageMapperImpl();

    private int imageUploadMaxSize = 5;

    public PostFacadeImpl(UserService userService, PostService postService, ImageService imageService) {
        this.userService = userService;
        this.postService = postService;
        this.imageService = imageService;
    }

    @Override
    public PostCreateResponseDto create(PostCreateRequestDto dto) {
        Assert.notNull(dto, "The dto post creation object should not be null");
        List<ImageUploadRequestDto> imageUploadRequestDtos = dto.getImageUploadRequestDtos();
        if (imageUploadRequestDtos.size() > imageUploadMaxSize) {
            throw new ImageMaximumSizeException(imageUploadMaxSize);
        }
        LOGGER.info("Creating a new post for the provided params - {}", dto);
        Post post = postService.create(new CreatePostParams(
                        dto.getTitle(), dto.getDescription(), dto.getUserId()
                )
        );
        List<ImageUploadResponseDto> imageUploadResponseDtos = new LinkedList<>();
        for (ImageUploadRequestDto imageUploadRequestDto : imageUploadRequestDtos) {
            imageUploadResponseDtos.add(this.imageUpload(imageUploadRequestDto));
        }
        PostCreateResponseDto postCreateResponseDto = new PostCreateResponseDto(
                imageUploadResponseDtos, post.getTitle(), post.getDescription()
        );
        LOGGER.info("Successfully create a new post - {} for the provided params - {}", post, postCreateResponseDto);
        return postCreateResponseDto;
    }

    @Override
    public ImageUploadResponseDto imageUpload(ImageUploadRequestDto dto) {
        Assert.notNull(dto, "The image request dto should not be null");
        LOGGER.info("Upload image for the provided params - {}", dto);
        Image image = imageService.create(new CreateImageParams(dto.getBlobId(), dto.getPostId()));
        ImageUploadResponseDto imageUploadResponseDto = new ImageUploadResponseDto(
                image.getBlobId(),
                image.getPost().getId()
        );
        LOGGER.info("Successfully upload new image - {} for the provided params - {}", image, imageUploadResponseDto);
        return imageUploadResponseDto;
    }

    @Override
    public GetAllUserPostsResponseDto getAllUserPosts(GetAllUserPostsRequestDto dto) {
        Assert.notNull(dto, "Request dto should not be null");
        LOGGER.info("Getting all posts of user with id - {}", dto.getUserId());
        User user = userService.getById(dto.getUserId());
        UserDto userDto = userMapper.map(user);
        List<Post> postList = postService.getAllUserPosts();
        List<PostDto> postDtoList = new LinkedList<>();

        for(Post post : postList) {
            List<Image> imageList = imageService.getByPostId(post.getId());
            List<ImageDto> imageDtoList = new LinkedList<>();
            imageList.forEach(image -> imageDtoList.add(imageMapper.map(image)));
            postMapper.map(post);
            postDtoList.add(new PostDto(
                    post.getId(),
                    post.getTitle(),
                    post.getDescription(),
                    userDto,
                    imageDtoList
            ));

        }
        GetAllUserPostsResponseDto getAllUserPostsResponseDto = new GetAllUserPostsResponseDto(userDto, postDtoList);
        LOGGER.info("Successfully getting all posts of user with id - {}", dto.getUserId());
        return getAllUserPostsResponseDto;
    }
}
