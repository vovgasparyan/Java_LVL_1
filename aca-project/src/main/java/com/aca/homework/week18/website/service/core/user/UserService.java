package com.aca.homework.week18.website.service.core.user;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.service.core.user.CreateUserParams;

import java.util.Optional;

public interface UserService {

    User create(CreateUserParams params);

    Optional<User> findByUsername(String username);

    User getById(Long id);
}
