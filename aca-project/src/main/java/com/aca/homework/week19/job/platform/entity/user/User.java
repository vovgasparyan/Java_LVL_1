package com.aca.homework.week19.job.platform.entity.user;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ID_SEQUENCE")
    @SequenceGenerator(name = "USER_ID_SEQUENCE")
    private Long id;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "details", nullable = false)
    private String details;

    @Column(name = "open_to_work", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private JobStatus jobStatus;

    @Column(name = "user_type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private UserType userType;

    public User(String email, String firstName, String lastName, String details, JobStatus jobStatus, UserType userType) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.details = details;
        this.jobStatus = jobStatus;
        this.userType = userType;
    }
    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(details, user.details) && jobStatus == user.jobStatus && userType == user.userType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, lastName, details, jobStatus, userType);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", details='" + details + '\'' +
                ", jobStatus=" + jobStatus +
                ", userType=" + userType +
                '}';
    }
}
