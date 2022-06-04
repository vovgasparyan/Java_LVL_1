package com.aca.homework.week18.website.service.impl.post;

import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.service.core.post.CreatePostParams;
import com.aca.homework.week18.website.service.core.post.PostService;
import com.aca.homework.week18.website.service.core.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;

public class PostServiceImpl implements PostService {

    private static Logger LOGGER = LoggerFactory.getLogger(PostServiceImpl.class);

    private PostRepository postRepository;
    private UserService userService;

    public PostServiceImpl(PostRepository postRepository, UserService userService) {
        this.postRepository = postRepository;
        this.userService = userService;
    }


    @Override
    public Post create(CreatePostParams params) {
        Assert.notNull(params, "The post params should not be null");
        LOGGER.info("Creating a post for the provided params - {}", params);
        Post post = postRepository.save(new Post(
                        params.getTitle(),
                        params.getDescription(),
                        userService.getById(params.getUserId())
                )
        );
        LOGGER.info("Successfully created a post for the provided params - {}", params);
        return post;
    }

    @Override
    public Post getById(Long id) {
        Assert.notNull(id, "The id should not be null");
        LOGGER.info("Finding a username for the provided id - {}", id);
        Post post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
        LOGGER.info("Successfully retrieved the post for the provided id - {}", id);
        return post;
    }

    @Override
    public List<Post> getAllByUserId(Long id) {
        Assert.notNull(id, "id should not be null");
        LOGGER.info("getting all posts of user with id {}", id);
        List<Post> postList = postRepository.findAllByUserId(id);
        LOGGER.info("successfully retrieved all users - {}", postList);
        return null;
    }

    @Override
    public List<Post> getAllUserPosts() {
        return Collections.unmodifiableList(postRepository.findAll());
    }
}
