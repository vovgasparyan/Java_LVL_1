package com.aca.homework.week18.website.service.impl.image;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.service.core.image.CreateImageParams;
import com.aca.homework.week18.website.service.core.image.ImageService;
import com.aca.homework.week18.website.service.core.post.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ImageServiceImpl implements ImageService {

    private static Logger LOGGER = LoggerFactory.getLogger(ImageServiceImpl.class);

    private ImageRepository imageRepository;
    private PostService postService;

    public ImageServiceImpl(ImageRepository imageRepository, PostService postService) {
        this.imageRepository = imageRepository;
        this.postService = postService;
    }

    @Override
    public Image create(CreateImageParams params) {
        Assert.notNull(params, "The image params should not be null");
        LOGGER.info("Creating a image for the provided params - {}", params);
        Image image = imageRepository.save(new Image(
                        params.getBlobId(),
                        postService.getById(params.getPostId())
                )
        );
        LOGGER.info("Successfully created a image for the provided params - {}", params);
        return image;
    }

    @Override
    public List<Image> getByUserId(Long id) {
        Assert.notNull(id, "User id should not be null");
        LOGGER.info("Getting all the images from user - {}", id);
        List<Post> postList = postService.getAllByUserId(id);
        List<Image> imageList = new LinkedList<>();
        for(Post post : postList) {
            List<Image> images = getByPostId(post.getId());
            imageList.addAll(images);
        }
        LOGGER.info("Successfully get all images - {} of the user with id - {}", imageList, id);
        return imageList;
    }

    @Override
    public List<Image> getByPostId(Long id) {
        Assert.notNull(id, "The post should not be null");
        LOGGER.info("Getting all images of post with id - {}", id);
        List<Image> imageList = imageRepository.findAllByPostId(id);
        LOGGER.info("Successfully get all images - {} of post with id - {}", imageList, id);
        return Collections.unmodifiableList(imageList);
    }
}
