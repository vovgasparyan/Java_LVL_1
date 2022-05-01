package com.aca.homework.week16.organization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Optional;

public class OrganizationServiceImpl implements OrganizationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationServiceImpl.class);

    private OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization create(OrganizationCreateParams params) {
        Assert.notNull(params, "The organization params should be not null!");

        LOGGER.info("Creating organization for the provided params - {} ", params);

        Organization organization = new Organization(
                params.getOrganizationName(),
                params.getFullAddress()
        );

        Organization saveOrganization = organizationRepository.save(organization);

        LOGGER.info("Successfully created organization for the provided params - {}", params);

        return saveOrganization;
    }

    @Override
    public Organization getByOrganizationName(String name) {
        return null;
    }

    @Override
    public Organization getById(Long id) {
        Assert.notNull(id, "The id should not be null");

        LOGGER.info("Retrieving organization for the provided id - {}", id);

        final Optional<Organization> optionalOrganization = organizationRepository.findById(id);

        if (optionalOrganization.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Organization organization = optionalOrganization.get();
        LOGGER.info("Successfully retrieved the organization for the provided id - {}, result - {}", id, organization);

        return organization;
    }
}
