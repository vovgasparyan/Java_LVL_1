package com.aca.homework.week18.website.service.impl.user;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.user.CreateUserParams;
import com.aca.homework.week18.website.service.core.user.UserService;
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
                params.getUsername(),
                params.getPassword(),
                params.getFirstName(),
                params.getSecondName()
        );
        User saveUser = userRepository.save(user);
        LOGGER.info("Successfully created a user for the provided params - {}", params);
        return saveUser;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        Assert.notNull(username, "The username should not be null");
        LOGGER.info("Finding a username for the provided param - {}", username);
        final Optional<User> optionalUser = userRepository.findByUsername(username);
        LOGGER.info("Successfully retrieved the user for the provided username - {}", username);
        return optionalUser;
    }

    @Override
    public User getById(Long id) {
        Assert.notNull(id, "The id should not be null");
        LOGGER.info("Finding a username for the provided id - {}", id);
        User user = userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
        LOGGER.info("Successfully retrieved the user for the provided id - {}", id);
        return user;
    }
}
