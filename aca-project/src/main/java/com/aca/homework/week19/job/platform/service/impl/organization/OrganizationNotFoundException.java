package com.aca.homework.week19.job.platform.service.impl.organization;

public class OrganizationNotFoundException extends RuntimeException {
    public OrganizationNotFoundException(Long id) {
        super(String.format("Organization having - %s is not found", id));
    }
    public OrganizationNotFoundException(String organizationName) {
        super(String.format("Organization having - %s name is not found", organizationName));
    }
}
