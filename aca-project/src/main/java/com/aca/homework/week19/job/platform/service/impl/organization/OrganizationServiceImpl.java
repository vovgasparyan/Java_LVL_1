package com.aca.homework.week19.job.platform.service.impl.organization;

import com.aca.homework.week19.job.platform.entity.organization.Organization;
import com.aca.homework.week19.job.platform.repository.organization.OrganizationRepository;
import com.aca.homework.week19.job.platform.service.core.organization.CreateOrganizationParams;
import com.aca.homework.week19.job.platform.service.core.organization.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private static Logger LOGGER = LoggerFactory.getLogger(OrganizationServiceImpl.class);

    private OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization create(CreateOrganizationParams params) {
        Assert.notNull(params, "Organization params should not be null");
        LOGGER.info("Creating a organization for the provided params - {}", params);
        Organization organization = new Organization(
                params.getOrganizationName(), params.getOrganizationDetails()
        );
        Organization savedOrganization = organizationRepository.save(organization);
        LOGGER.info("Successfully create organization for provided params - {}", organization);
        return savedOrganization;
    }

    @Override
    public Organization getById(Long id) {
        Assert.notNull(id, "The id should not be null");
        LOGGER.info("Finding organization with id - {}", id);
        Organization organization = organizationRepository.findById(id).orElseThrow(()-> new OrganizationNotFoundException(id));
        LOGGER.info("Successfully retrieved the organization for the provided id - {}", organization);
        return organization;
    }

    @Override
    public Optional<Organization> findByName(String name) {
        Assert.notNull(name, "Organization name should be not null");
        LOGGER.info("Finding organization with name - {}", name);
        Optional<Organization> optionalOrganization = organizationRepository.findByName(name);
        if (optionalOrganization.isEmpty()) {
            throw new OrganizationNotFoundException(name);
        }
        LOGGER.info("Successfully find organization for the provided name - {}", name);
        return optionalOrganization;
    }
}
