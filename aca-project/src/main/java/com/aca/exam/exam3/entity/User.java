package com.aca.exam.exam3.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "passport", unique = true, nullable = false)
    private String passport;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "secondname", nullable = false)
    private String secondName;

    public User(String passport, String firstName, String secondName) {
        this.passport = passport;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public String getPassport() {
        return passport;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(passport, user.passport) && Objects.equals(firstName, user.firstName) && Objects.equals(secondName, user.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passport, firstName, secondName);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", passport='" + passport + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
