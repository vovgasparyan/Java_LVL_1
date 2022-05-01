package com.aca.homework.week16.organization;

public interface OrganizationService {

    Organization create(OrganizationCreateParams params);

    Organization getByOrganizationName(String name);

    Organization getById(Long id);
}
