package com.aca.homework.week16.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        OrganizationRepository repository = context.getBean(OrganizationRepository.class);
        OrganizationService service = new OrganizationServiceImpl(repository);

        Organization organization = service.create(new OrganizationCreateParams("Aeroflot", "Amiryan 12"));
    }
}
