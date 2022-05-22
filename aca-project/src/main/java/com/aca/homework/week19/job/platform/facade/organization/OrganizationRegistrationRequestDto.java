package com.aca.homework.week19.job.platform.facade.organization;

import java.util.Objects;

public class OrganizationRegistrationRequestDto {

    private final String name;
    private final String organizationDetails;

    public OrganizationRegistrationRequestDto(String name, String organizationDetails) {
        this.name = name;
        this.organizationDetails = organizationDetails;
    }

    public String getName() {
        return name;
    }

    public String getOrganizationDetails() {
        return organizationDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationRegistrationRequestDto that = (OrganizationRegistrationRequestDto) o;
        return Objects.equals(name, that.name) && Objects.equals(organizationDetails, that.organizationDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, organizationDetails);
    }

    @Override
    public String toString() {
        return "OrganizationRegistrationRequestDto{" +
                "name='" + name + '\'' +
                ", organizationDetails='" + organizationDetails + '\'' +
                '}';
    }
}
