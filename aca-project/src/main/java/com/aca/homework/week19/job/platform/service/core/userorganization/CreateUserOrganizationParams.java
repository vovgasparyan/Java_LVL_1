package com.aca.homework.week19.job.platform.service.core.userorganization;

import java.util.Objects;

public class CreateUserOrganizationParams {

    private Long userId;
    private Long organizationId;

    public CreateUserOrganizationParams(Long userId, Long organizationId) {
        this.userId = userId;
        this.organizationId = organizationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateUserOrganizationParams that = (CreateUserOrganizationParams) o;
        return Objects.equals(userId, that.userId) && Objects.equals(organizationId, that.organizationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, organizationId);
    }

    @Override
    public String toString() {
        return "CreateUserOrganizationParams{" +
                "userId=" + userId +
                ", organizationId=" + organizationId +
                '}';
    }
}
