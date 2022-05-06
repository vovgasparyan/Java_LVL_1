package com.aca.exam.exam3;

import com.aca.exam.exam3.entity.Plate;
import com.aca.exam.exam3.entity.User;
import com.aca.exam.exam3.entity.UserPlateNumber;
import com.aca.exam.exam3.repository.PlateRepository;
import com.aca.exam.exam3.repository.UserPlateNumberRepository;
import com.aca.exam.exam3.repository.UserRepository;
import com.aca.exam.exam3.service.core.*;
import com.aca.exam.exam3.service.impl.PlateServiceImpl;
import com.aca.exam.exam3.service.impl.UserPlateNumberServiceImpl;
import com.aca.exam.exam3.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class);

        PlateRepository plateRepository = context.getBean(PlateRepository.class);
        PlateService plateService = new PlateServiceImpl(plateRepository);

        Plate plate1 = plateService.create(new CreatePlateParams(new NumberGenerator().generateRandomNumber(), "free"));
        Plate plate2 = plateService.create(new CreatePlateParams(new NumberGenerator().generateRandomNumber(), "free"));
        Plate plate3 = plateService.create(new CreatePlateParams(new NumberGenerator().generateRandomNumber(), "free"));
        Plate plate4 = plateService.create(new CreatePlateParams(new NumberGenerator().generateRandomNumber(), "free"));
        Plate plate5 = plateService.create(new CreatePlateParams(new NumberGenerator().generateRandomNumber(), "free"));
        Plate plate6 = plateService.create(new CreatePlateParams(new NumberGenerator().generateRandomNumber(), "free"));

        UserRepository userRepository = context.getBean(UserRepository.class);
        UserService userService = new UserServiceImpl(userRepository);

        User user1 = userService.create(new CreateUserParams("Vladimir", "Gasparyan", "AC0294789"));
        User user2 = userService.create(new CreateUserParams("Alex", "McMilan", "AE0258899"));
        User user3 = userService.create(new CreateUserParams("Eva", "Mendes", "AR0274530"));
        User user4 = userService.create(new CreateUserParams("Diana", "Johnson", "AF8752698"));



        UserPlateNumberRepository userPlateNumberRepository = context.getBean(UserPlateNumberRepository.class);
        UserPlateNumberService userPlateNumberService = new UserPlateNumberServiceImpl(userPlateNumberRepository, userRepository, plateRepository);
        UserPlateNumber userPlateNumber = userPlateNumberService.create(new CreateUserPlateNumberParams(user2.getId(), plate4.getId()));
    }
}
