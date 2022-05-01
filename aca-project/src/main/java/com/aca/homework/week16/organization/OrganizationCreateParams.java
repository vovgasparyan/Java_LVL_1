package com.aca.homework.week16.organization;

import org.springframework.util.Assert;

import java.util.Objects;

public class OrganizationCreateParams {

    private final String organizationName;

    private final String fullAddress;

    public OrganizationCreateParams(String organizationName, String fullAddress) {
        Assert.notNull(organizationName, "organization name should not be null");
        Assert.notNull(fullAddress, "full address should not be null");
        this.organizationName = organizationName;
        this.fullAddress = fullAddress;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationCreateParams that = (OrganizationCreateParams) o;
        return Objects.equals(organizationName, that.organizationName) && Objects.equals(fullAddress, that.fullAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationName, fullAddress);
    }
}
