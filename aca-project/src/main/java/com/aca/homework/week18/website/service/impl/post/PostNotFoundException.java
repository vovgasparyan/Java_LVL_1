package com.aca.homework.week18.website.service.impl.post;

import com.aca.homework.week18.website.entity.User;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException (Long id) {
        super(String.format("Post having a id - %s not found", id));
    }
    public PostNotFoundException (User user) {
        super(String.format("Post having an author user - %s not found", user));
    }
}
