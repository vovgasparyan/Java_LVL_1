package com.aca.homework.week18.website;

import com.aca.homework.week18.website.facade.post.PostFacade;
import com.aca.homework.week18.website.facade.post.PostFacadeImpl;
import com.aca.homework.week18.website.facade.request.image.ImageUploadRequestDto;
import com.aca.homework.week18.website.facade.request.post.GetAllUserPostsRequestDto;
import com.aca.homework.week18.website.facade.request.post.PostCreateRequestDto;
import com.aca.homework.week18.website.facade.request.user.UserSignUpRequestDto;
import com.aca.homework.week18.website.facade.user.UserFacade;
import com.aca.homework.week18.website.facade.user.UserFacadeImpl;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.image.ImageService;
import com.aca.homework.week18.website.service.core.post.PostService;
import com.aca.homework.week18.website.service.core.user.UserService;
import com.aca.homework.week18.website.service.impl.image.ImageServiceImpl;
import com.aca.homework.week18.website.service.impl.post.PostServiceImpl;
import com.aca.homework.week18.website.service.impl.user.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);
        PostRepository postRepository = context.getBean(PostRepository.class);
        ImageRepository imageRepository = context.getBean(ImageRepository.class);


        UserService userService = new UserServiceImpl(userRepository);
        PostService postService = new PostServiceImpl(postRepository, userService);
        ImageService imageService = new ImageServiceImpl(imageRepository, postService);
/*
        userService.create(new CreateUserParams(
                        "vladimir_gasparyan",
                        "20031982",
                        "Vladimir",
                        "Gasparyan"
                )
        );

        postService.create(new CreatePostParams("Title 1", "Description 1", 1L));
        postService.create(new CreatePostParams("Title 2", "Description 2", 1L));
        postService.create(new CreatePostParams("Title 3", "Description 3", 1L));
        postService.create(new CreatePostParams("Title 4", "Description 4", 1L));

        imageService.create(new CreateImageParams("BARA01", 1L));
        imageService.create(new CreateImageParams("NORA31", 2L));

        System.err.println(postService.getAllUserPosts());
        System.err.println(postService.getById(1L).getId());
        */
        UserFacade userFacade = new UserFacadeImpl(userService);
        userFacade.signUp(new UserSignUpRequestDto(
                        "vladimir_gasparyan",
                        "20031982",
                        "Vladimir",
                        "Gasparyan"
                )
        );
        userFacade.signUp(new UserSignUpRequestDto(
                        "robert_gasparyan",
                        "06061986",
                        "Robert",
                        "Gasparyan"
                )
        );

        PostFacade postFacade = new PostFacadeImpl(userService, postService, imageService);
        postFacade.create(new PostCreateRequestDto(
                        "Title 1",
                        "Description 1",
                        1L,
                        List.of(
                                new ImageUploadRequestDto("BBA1", 1L),
                                new ImageUploadRequestDto("BBA2", 1L),
                                new ImageUploadRequestDto("AAV1", 1L),
                                new ImageUploadRequestDto("AVA2", 1L),
                                new ImageUploadRequestDto("NNA1", 1L)
                        )
                )
        );
        postFacade.create(new PostCreateRequestDto(
                        "Title 2",
                        "Description 2",
                        2L,
                        List.of(
                                new ImageUploadRequestDto("PPA1", 2L)
                        )
                )
        );

        postFacade.getAllUserPosts(new GetAllUserPostsRequestDto(
                1L
        ));
    }
}
