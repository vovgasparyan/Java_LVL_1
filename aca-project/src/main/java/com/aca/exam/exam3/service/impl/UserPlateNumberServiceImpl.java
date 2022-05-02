package com.aca.exam.exam3.service.impl;

import com.aca.exam.exam3.entity.User;
import com.aca.exam.exam3.entity.UserPlateNumber;
import com.aca.exam.exam3.repository.UserPlateNumberRepository;
import com.aca.exam.exam3.service.core.CreateUserPlateNumberParams;
import com.aca.exam.exam3.service.core.UserPlateNumberService;
import com.aca.exam.exam3.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

public class UserPlateNumberServiceImpl implements UserPlateNumberService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserPlateNumberServiceImpl.class);

    private UserPlateNumberRepository plateNumberRepository;

    private UserService userService;

    public UserPlateNumberServiceImpl(UserPlateNumberRepository plateNumberRepository, UserService userService) {
        this.plateNumberRepository = plateNumberRepository;
        this.userService = userService;
    }

    @Override
    public UserPlateNumber create(CreateUserPlateNumberParams params) {

        Assert.notNull(params, "The create user plate number params should not be null");

        LOGGER.info("Creating a user plate number for the provided params - {}", params);

        final User user = userService.getById(params.getUserId());

        UserPlateNumber userPlateNumber = new UserPlateNumber(
                params.getNumber(),
                "not free",
                user
        );

        return plateNumberRepository.save(userPlateNumber);
    }
}
