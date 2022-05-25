package com.aca.homework.week19.job.platform.facade.organization;

import com.aca.homework.week19.job.platform.facade.user.UserDetailsDto;

import java.util.List;
import java.util.Objects;

public class OrganizationDetailsDto {

    private String name;
    private List<UserDetailsDto> usersList;
    private List<String> errors;

    public OrganizationDetailsDto(String name, List<UserDetailsDto> usersList) {
        this.name = name;
        this.usersList = usersList;
    }

    public OrganizationDetailsDto(List<String> errors) {
        this.errors = errors;
    }

    public String getName() {
        return name;
    }

    public List<UserDetailsDto> getUsersList() {
        return usersList;
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationDetailsDto that = (OrganizationDetailsDto) o;
        return Objects.equals(name, that.name) && Objects.equals(usersList, that.usersList) && Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, usersList, errors);
    }

    @Override
    public String toString() {
        return "OrganizationDetailsDto{" +
                "name='" + name + '\'' +
                ", usersList=" + usersList +
                ", errors=" + errors +
                '}';
    }
}
