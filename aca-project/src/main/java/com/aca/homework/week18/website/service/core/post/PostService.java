package com.aca.homework.week18.website.service.core.post;

import com.aca.homework.week18.website.entity.Post;

import java.util.List;

public interface PostService {

    Post create(CreatePostParams params);

    Post getById(Long id);

    List<Post> getAllByUserId(Long id);

    List<Post> getAllUserPosts();
}
