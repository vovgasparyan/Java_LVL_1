package com.aca.homework.week19.job.platform.facade.user;

import com.aca.homework.week19.job.platform.entity.user.JobStatus;
import com.aca.homework.week19.job.platform.entity.user.UserType;

import java.util.List;
import java.util.Objects;

public class UserDetailsDto {

    private String email;
    private String firstName;
    private String lastName;
    private String details;
    private JobStatus jobStatus;
    private UserType userType;
    private List<String> errors;

    public UserDetailsDto(String email, String firstName, String lastName, String details, JobStatus jobStatus, UserType userType) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.details = details;
        this.jobStatus = jobStatus;
        this.userType = userType;
    }

    public UserDetailsDto(List<String> errors) {
        this.errors = errors;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDetails() {
        return details;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetailsDto that = (UserDetailsDto) o;
        return Objects.equals(email, that.email) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(details, that.details) && jobStatus == that.jobStatus && userType == that.userType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, firstName, lastName, details, jobStatus, userType);
    }

    @Override
    public String toString() {
        return "UserDetailsDto{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", details='" + details + '\'' +
                ", jobStatus=" + jobStatus +
                ", userType=" + userType +
                '}';
    }
}
