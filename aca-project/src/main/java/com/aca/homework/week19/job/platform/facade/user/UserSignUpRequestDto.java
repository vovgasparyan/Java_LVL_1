package com.aca.homework.week19.job.platform.facade.user;

import com.aca.homework.week19.job.platform.entity.user.JobStatus;
import com.aca.homework.week19.job.platform.entity.user.UserType;

public class UserSignUpRequestDto {

    private final String email;
    private final String firstName;
    private final String lastName;
    private final String details;
    private final JobStatus jobStatus;
    private final UserType userType;

    public UserSignUpRequestDto(String email, String firstName, String lastName, String details, JobStatus jobStatus, UserType userType) {
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
}
