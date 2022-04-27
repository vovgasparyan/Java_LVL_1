package com.aca.homework.week15.service.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService {

    private UserRepository userRepository;
    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(UserCreateParams params) {
        LOGGER.debug("Creating a user for the provided creation params - " + params);
        User user = new User(params.getUsername(), params.getName());
        userRepository.save(user);
        LOGGER.debug("Successfully created a user for the provided creation params - " +
                params + ", result - " + user);
        return user;
    }
}
