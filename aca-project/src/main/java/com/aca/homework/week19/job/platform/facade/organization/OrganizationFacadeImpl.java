package com.aca.homework.week19.job.platform.facade.organization;

import com.aca.homework.week19.job.platform.entity.organization.Organization;
import com.aca.homework.week19.job.platform.entity.user.User;
import com.aca.homework.week19.job.platform.facade.user.UserDetailsDto;
import com.aca.homework.week19.job.platform.service.core.organization.CreateOrganizationParams;
import com.aca.homework.week19.job.platform.service.core.organization.OrganizationService;
import com.aca.homework.week19.job.platform.service.core.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Component
public class OrganizationFacadeImpl implements OrganizationFacade {

    private static Logger LOGGER = LoggerFactory.getLogger(OrganizationFacadeImpl.class);

    private UserService userService;
    private OrganizationService organizationService;

    public OrganizationFacadeImpl(UserService userService, OrganizationService organizationService) {
        this.userService = userService;
        this.organizationService = organizationService;
    }


    @Override
    public OrganizationDetailsDto register(OrganizationRegistrationRequestDto dto) {
        Assert.notNull(dto, "Organization registration dto should not be null");
        LOGGER.info("Registering organization for provided request data - {}", dto);
        Organization organization = organizationService.create(new CreateOrganizationParams(
                        dto.getName(),
                        dto.getOrganizationDetails()
                )
        );
        OrganizationDetailsDto organizationDetailsDto = new OrganizationDetailsDto(
                organization.getName(),
                Collections.emptyList()
        );
        LOGGER.info("Successfully registered an organization with dto - {}", organizationDetailsDto);
        return organizationDetailsDto;
    }

    @Override
    public OrganizationDetailsDto getOrganizationDetails(Long organizationId) {
        Assert.notNull(organizationId, "Organization id should not be null");
        LOGGER.info("Getting organization info having id - {} ", organizationId);
        List<User> users = userService.getUsersByOrganization(organizationId);
        List<UserDetailsDto> userDetailsDtos = new LinkedList<>();
        for (User user : users) {
            userDetailsDtos.add(new UserDetailsDto(
                    user.getEmail(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getDetails(),
                    user.getJobStatus(),
                    user.getUserType()
            ));
        }
        OrganizationDetailsDto organizationDetailsDto = new OrganizationDetailsDto(
                organizationService.getById(organizationId).getName(),
                userDetailsDtos
        );
        LOGGER.info("Successfully get organization details - {}", organizationDetailsDto);
        return organizationDetailsDto;
    }
}
