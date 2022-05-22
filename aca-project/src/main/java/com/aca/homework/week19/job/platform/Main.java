package com.aca.homework.week19.job.platform;

import com.aca.homework.week19.job.platform.entity.user.JobStatus;
import com.aca.homework.week19.job.platform.entity.user.UserType;
import com.aca.homework.week19.job.platform.facade.organization.OrganizationFacade;
import com.aca.homework.week19.job.platform.facade.organization.OrganizationRegistrationRequestDto;
import com.aca.homework.week19.job.platform.facade.user.UserFacade;
import com.aca.homework.week19.job.platform.facade.user.UserSignUpRequestDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        UserFacade userFacade = context.getBean(UserFacade.class);
        userFacade.signUp(new UserSignUpRequestDto(
                        "vovgasparyan@gmail.com",
                        "Vladimir",
                        "Gasparyan",
                        "Web-developer",
                        JobStatus.CLOSED,
                        UserType.USER
                )
        );
        userFacade.openToWork(1L);

        OrganizationFacade organizationFacade = context.getBean(OrganizationFacade.class);
        organizationFacade.register(new OrganizationRegistrationRequestDto(
                "MTS Armenia",
                "Communication provider")
        );

    }
}
