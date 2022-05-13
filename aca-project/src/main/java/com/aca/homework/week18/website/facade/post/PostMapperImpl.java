package com.aca.homework.week18.website.facade.post;

import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.facade.dto.PostDto;
import com.aca.homework.week18.website.facade.user.UserMapper;

import java.util.Collections;

public class PostMapperImpl implements PostMapper {

    UserMapper userMapper;

    public PostMapperImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public PostDto map(Post post) {
        return new PostDto(post.getId(), post.getTitle(), post.getDescription(), userMapper.map(post.getUser()), Collections.emptyList());
    }
}
