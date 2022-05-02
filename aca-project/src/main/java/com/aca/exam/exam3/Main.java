package com.aca.exam.exam3;

import com.aca.exam.exam3.entity.User;
import com.aca.exam.exam3.entity.UserPlateNumber;
import com.aca.exam.exam3.repository.UserPlateNumberRepository;
import com.aca.exam.exam3.repository.UserRepository;
import com.aca.exam.exam3.service.core.*;
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
        UserRepository userRepository = context.getBean(UserRepository.class);
        UserService userService = new UserServiceImpl(userRepository);

        User user = userService.create(new CreateUserParams(
                "Vladimir", "Gasparyan", "AC0294789")
        );
        User user1 = userService.create(new CreateUserParams(
                "Ani", "Petrosyan", "AC0258899")
        );

        UserPlateNumberRepository userPlateNumberRepository = context.getBean(UserPlateNumberRepository.class);
        UserPlateNumberService userPlateNumberService = new UserPlateNumberServiceImpl(userPlateNumberRepository, userService);
        UserPlateNumber userPlateNumber = userPlateNumberService.create(new CreateUserPlateNumberParams(
           new NumberGenerator().generateRandomNumber(),
                "not free",
                user.getId()
        ));
    }
}
