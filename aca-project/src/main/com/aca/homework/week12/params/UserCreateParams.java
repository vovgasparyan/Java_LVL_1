package com.aca.homework.week12.params;

public class UserCreateParams {

    private String username;
    private String firstName;
    private int age;

    public UserCreateParams(String username, String firstName, int age) {
        if (username == null || firstName == null) {
            throw new IllegalArgumentException("username and firstname cannot be null");
        }
        if (age <= 0 || age > 100) {
            throw new IllegalArgumentException("age value cannot be less than 0 and more than 100");
        }
        this.username = username;
        this.firstName = firstName;
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
