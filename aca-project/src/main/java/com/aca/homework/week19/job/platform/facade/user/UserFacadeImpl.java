package com.aca.homework.week19.job.platform.facade.user;

import com.aca.homework.week19.job.platform.entity.user.JobStatus;
import com.aca.homework.week19.job.platform.entity.user.User;
import com.aca.homework.week19.job.platform.repository.user.UserRepository;
import com.aca.homework.week19.job.platform.service.core.user.CreateUserParams;
import com.aca.homework.week19.job.platform.service.core.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Component
public class UserFacadeImpl implements UserFacade {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserFacadeImpl.class);
    private final UserService userService;

    private final UserRepository userRepository;

    public UserFacadeImpl(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Override
    public UserDetailsDto signUp(UserSignUpRequestDto dto) {
        Assert.notNull(dto, "The user sign up params should not be null");
        LOGGER.info("Sign up a user for the provided params - {}", dto);
        Optional<User> optionalUser = userService.findByEmail(dto.getEmail());
        if (optionalUser.isPresent()) {
            return new UserDetailsDto(List.of(String.format("User with %s email address is already exists", dto.getEmail())));
        }
        User user = userService.create(new CreateUserParams(
                        dto.getEmail(),
                        dto.getFirstName(),
                        dto.getLastName(),
                        dto.getDetails(),
                        dto.getJobStatus(),
                        dto.getUserType()
                )
        );
        UserDetailsDto userDetailsDto = new UserDetailsDto(
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),
                user.getDetails(),
                user.getJobStatus(),
                user.getUserType()
        );
        LOGGER.info("Successfully sign up new user -{}", userDetailsDto);
        return userDetailsDto;
    }

    @Override
    public UserDetailsDto getUserDetails(Long userId) {
        Assert.notNull(userId, "User id should not be null");
        LOGGER.info("Getting user details for the provided id - {}", userId);
        User user = userService.getById(userId);
        UserDetailsDto userDetailsDto = new UserDetailsDto(
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),
                user.getDetails(),
                user.getJobStatus(),
                user.getUserType()
        );
        LOGGER.info("Successfully getting details of user - {} with provided id - {}", userDetailsDto, userId);
        return userDetailsDto;
    }

    @Override
    public UserDetailsDto openToWork(Long userId) {
        Assert.notNull(userId, "User id should not be null");
        LOGGER.info("Getting user details for the provided id - {}", userId);
        User user = userService.getById(userId);
        if (user.getJobStatus() == JobStatus.CLOSED) {
            user.setJobStatus(JobStatus.OPEN_TO_WORK);
        }
        User savedUser = userRepository.save(user);
        UserDetailsDto userDetailsDto = new UserDetailsDto(
                savedUser.getEmail(),
                savedUser.getFirstName(),
                savedUser.getLastName(),
                savedUser.getDetails(),
                savedUser.getJobStatus(),
                savedUser.getUserType()
        );
        LOGGER.info("Successfully update job status of user - {} with provided id - {}", userDetailsDto, userId);
        return userDetailsDto;
    }
}
