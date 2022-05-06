package com.aca.exam.exam3.service.impl;

import com.aca.exam.exam3.entity.Plate;
import com.aca.exam.exam3.entity.User;
import com.aca.exam.exam3.entity.UserPlateNumber;
import com.aca.exam.exam3.repository.PlateRepository;
import com.aca.exam.exam3.repository.UserPlateNumberRepository;
import com.aca.exam.exam3.repository.UserRepository;
import com.aca.exam.exam3.service.core.CreateUserPlateNumberParams;
import com.aca.exam.exam3.service.core.UserPlateNumberService;
import com.aca.exam.exam3.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Optional;

public class UserPlateNumberServiceImpl implements UserPlateNumberService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserPlateNumberServiceImpl.class);

    private UserRepository userRepository;
    private PlateRepository plateRepository;
    private UserPlateNumberRepository plateNumberRepository;

    private UserService userService;


    public UserPlateNumberServiceImpl(UserPlateNumberRepository plateNumberRepository, UserRepository userRepository, PlateRepository plateRepository) {
        this.plateNumberRepository = plateNumberRepository;
        this.userRepository = userRepository;
        this.plateRepository = plateRepository;
    }

    @Override
    public UserPlateNumber create(CreateUserPlateNumberParams params) {

        Assert.notNull(params, "The create user plate number params should not be null");

        LOGGER.info("Creating a user plate number for the provided params - {}", params);

        final Optional<User> user = userRepository.findById(params.getUserId());
        final Optional<Plate> plate = plateRepository.findById(params.getPlateId());

        if (user.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (plate.isEmpty()) {
            throw new IllegalArgumentException();
        }

        UserPlateNumber userPlateNumber = new UserPlateNumber(user.get(), plate.get());

        return plateNumberRepository.save(userPlateNumber);
    }
}
