package com.aca.homework.week19.job.platform.service.impl.userorganization;

import com.aca.homework.week19.job.platform.entity.organization.Organization;
import com.aca.homework.week19.job.platform.entity.user.User;
import com.aca.homework.week19.job.platform.entity.userorganization.UserOrganization;
import com.aca.homework.week19.job.platform.repository.userorganization.UserOrganizationRepository;
import com.aca.homework.week19.job.platform.service.core.organization.OrganizationService;
import com.aca.homework.week19.job.platform.service.core.user.UserService;
import com.aca.homework.week19.job.platform.service.core.userorganization.CreateUserOrganizationParams;
import com.aca.homework.week19.job.platform.service.core.userorganization.UserOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;

public class UserOrganizationImpl implements UserOrganizationService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserOrganizationImpl.class);

    private UserOrganizationRepository userOrganizationRepository;
    private UserService userService;
    private OrganizationService organizationService;

    public UserOrganizationImpl(UserOrganizationRepository userOrganizationRepository, UserService userService, OrganizationService organizationService) {
        this.userOrganizationRepository = userOrganizationRepository;
        this.userService = userService;
        this.organizationService = organizationService;
    }

    @Override
    public UserOrganization create(CreateUserOrganizationParams params) {
        Assert.notNull(params, "The params for user in organization create should not be null");
        LOGGER.info("Creating user in organization for provided params - {}", params);
        User user = userService.getById(params.getUserId());
        Organization organization = organizationService.getById(params.getOrganizationId());
        UserOrganization userOrganization = new UserOrganization(
                user,
                organization
        );
        UserOrganization savedUserOrganization = userOrganizationRepository.save(userOrganization);
        LOGGER.info("Successfully creating user in organization with data - {}", savedUserOrganization);
        return savedUserOrganization;
    }

    @Override
    public List<UserOrganization> findByOrganizationId(Long organizationId) {
        Assert.notNull(organizationId, "The organization id should not be null");
        LOGGER.info("Finding organization for provided id - {}", organizationId);
        List<UserOrganization> userOrganization = userOrganizationRepository.findByOrganizationId(organizationId);
        LOGGER.info("Find organization for provided data - {}", organizationId);
        return Collections.unmodifiableList(userOrganization);
    }
}
