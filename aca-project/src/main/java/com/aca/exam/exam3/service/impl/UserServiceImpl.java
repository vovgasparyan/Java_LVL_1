package com.aca.exam.exam3.service.impl;

import com.aca.exam.exam3.entity.User;
import com.aca.exam.exam3.repository.UserRepository;
import com.aca.exam.exam3.service.core.CreateUserParams;
import com.aca.exam.exam3.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(CreateUserParams params) {

        Assert.notNull(params, "The create user params should not be null");

        LOGGER.info("Creating a user for the provided params - {}", params);

        User user = new User(
                params.getPassport(),
                params.getFirstName(),
                params.getSecondName()
        );

        User savedUser = userRepository.save(user);

        LOGGER.info("Successfully created a user for the provided params - {}", params);
        return savedUser;
    }

    @Override
    public User getById(Long id) {
        Assert.notNull(id, "The id should not be null");

        LOGGER.info("Call user for id provided - {}", id);

        final Optional<User> userOptional = userRepository.findById(id);

        if(userOptional.isEmpty()) {
            throw new IllegalArgumentException();
        }

        final User user = userOptional.get();
        LOGGER.info("Successfully retrieved the user for the provided id - {}, result - {}", id, user);
        return user;
    }

}
