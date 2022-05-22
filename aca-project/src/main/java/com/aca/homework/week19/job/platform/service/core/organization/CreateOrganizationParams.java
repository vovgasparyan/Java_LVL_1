package com.aca.homework.week19.job.platform.service.core.organization;

import org.springframework.util.Assert;

import java.util.Objects;

public class CreateOrganizationParams {

    private String organizationName;
    private String organizationDetails;

    public CreateOrganizationParams(String organizationName, String organizationDetails) {
        Assert.hasText(organizationName, "Organization name should not be null");
        Assert.hasText(organizationDetails, "Organization must have information about company");
        this.organizationName = organizationName;
        this.organizationDetails = organizationDetails;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationDetails() {
        return organizationDetails;
    }

    public void setOrganizationDetails(String organizationDetails) {
        this.organizationDetails = organizationDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateOrganizationParams that = (CreateOrganizationParams) o;
        return Objects.equals(organizationName, that.organizationName) && Objects.equals(organizationDetails, that.organizationDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationName, organizationDetails);
    }

    @Override
    public String toString() {
        return "CreateOrganizationParams{" +
                "organizationName='" + organizationName + '\'' +
                ", organizationDetails='" + organizationDetails + '\'' +
                '}';
    }
}
