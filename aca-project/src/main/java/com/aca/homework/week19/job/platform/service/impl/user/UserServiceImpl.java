package com.aca.homework.week19.job.platform.service.impl.user;

import com.aca.homework.week19.job.platform.entity.user.User;
import com.aca.homework.week19.job.platform.entity.userorganization.UserOrganization;
import com.aca.homework.week19.job.platform.repository.user.UserRepository;
import com.aca.homework.week19.job.platform.repository.userorganization.UserOrganizationRepository;
import com.aca.homework.week19.job.platform.service.core.user.CreateUserParams;
import com.aca.homework.week19.job.platform.service.core.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserRepository userRepository;
    private UserOrganizationRepository userOrganizationRepository;

    public UserServiceImpl(UserRepository userRepository, UserOrganizationRepository userOrganizationRepository) {
        this.userRepository = userRepository;
        this.userOrganizationRepository = userOrganizationRepository;
    }

    @Override
    public User create(CreateUserParams params) {
        Assert.notNull(params, "The create user params should not be null");
        LOGGER.info("Creating a user for the provided params - {}", params);
        User user = new User(
                params.getEmail(),
                params.getFirstName(),
                params.getLastName(),
                params.getDetails(),
                params.getJobStatus(),
                params.getUserType()
        );
        User savedUser = userRepository.save(user);
        LOGGER.info("Successfully created a user for the provided params - {}", user);
        return savedUser;
    }

    @Override
    public User getById(Long id) {
        Assert.notNull(id, "The id should not be null");
        LOGGER.info("Finding a username for the provided id - {}", id);
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        LOGGER.info("Successfully retrieved the user for the provided id - {}", id);
        return user;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        Assert.notNull(email, "The email should not be null");
        LOGGER.info("Finding email address for the provided email - {}", email);
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            throw new UserEmailExistsException(email);
        }
        LOGGER.info("Successfully find email address for the provided email - {}", email);
        return optionalUser;
    }

    @Override
    public List<User> getUsersByOrganization(Long organizationId) {
        Assert.notNull(organizationId, "Organization id should not be null");
        LOGGER.info("Getting users from organization having id - {}", organizationId);
        List<UserOrganization> userOrganizations = userOrganizationRepository.findByOrganizationId(organizationId);
        List<User> users = new LinkedList<>();
        for (UserOrganization userOrganization : userOrganizations) {
            users.add(userRepository.findByEmail(userOrganization.getUser().getEmail())
                    .orElseThrow(() -> new UserNotFoundException(userOrganization.getUser().getId())));
        }
        LOGGER.info("Get a list of users working in organization having id - {}", organizationId);
        return Collections.unmodifiableList(users);
    }
}
