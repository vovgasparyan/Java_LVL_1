package com.aca.homework.week18.website.facade.user;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.facade.request.user.UserSignUpRequestDto;
import com.aca.homework.week18.website.facade.response.user.UserSignUpResponseDto;
import com.aca.homework.week18.website.service.core.user.CreateUserParams;
import com.aca.homework.week18.website.service.core.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Optional;

public class UserFacadeImpl implements UserFacade {

    private static Logger LOGGER = LoggerFactory.getLogger(UserFacadeImpl.class);
    private UserService userService;

    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserSignUpResponseDto signUp(UserSignUpRequestDto dto) {
        Assert.notNull(dto, "The user sign up params should not be null");
        LOGGER.info("Sign up a user for the provided params - {}", dto);
        Optional<User> optionalUser = userService.findByUsername(dto.getUsername());
        if (optionalUser.isPresent()) {
            throw new UserIsAlreadyExistsException(dto.getUsername());
        }
        User user = userService.create(new CreateUserParams(
                        dto.getUsername(),
                        dto.getPassword(),
                        dto.getFirstName(),
                        dto.getSecondName()
                )
        );
        return new UserSignUpResponseDto(
                user.getUsername(),
                user.getPassword(),
                user.getFirstName(),
                user.getSecondName()
        );
    }
}
