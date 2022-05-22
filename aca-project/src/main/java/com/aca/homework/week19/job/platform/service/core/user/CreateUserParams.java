package com.aca.homework.week19.job.platform.service.core.user;

import com.aca.homework.week19.job.platform.entity.user.JobStatus;
import com.aca.homework.week19.job.platform.entity.user.UserType;
import org.springframework.util.Assert;

import java.util.Objects;

public class CreateUserParams {

    private String email;
    private String firstName;
    private String lastName;
    private String details;
    private JobStatus jobStatus;
    private UserType userType;

    public CreateUserParams(String email, String firstName, String lastName, String details, JobStatus jobStatus, UserType userType) {
        Assert.hasText(email, "The email should not be null");
        Assert.hasText(firstName, "The first name should not be null");
        Assert.hasText(lastName, "The last name should not be null");
        Assert.hasText(details, "The details about user should not be null");
        Assert.notNull(jobStatus, "The job status should not be null");
        Assert.notNull(userType, "The user type should not be null");
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.details = details;
        this.jobStatus = jobStatus;
        this.userType = userType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateUserParams that = (CreateUserParams) o;
        return Objects.equals(email, that.email) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(details, that.details) && jobStatus == that.jobStatus && userType == that.userType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, firstName, lastName, details, jobStatus, userType);
    }

    @Override
    public String toString() {
        return "CreateUserParams{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", details='" + details + '\'' +
                ", jobStatus=" + jobStatus +
                ", userType=" + userType +
                '}';
    }
}
