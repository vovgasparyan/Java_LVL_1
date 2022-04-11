package com.aca.classroom.week10.lesson20.map;

import java.util.Objects;

public class User {

    private String userName;
    private int age;

    public User(String name, int age) {
        this.userName = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
//        int result = getUserName() != null ? getUserName().hashCode() : 0;
//        result = 31 * result + getAge();
//        return result;

        return Objects.hash(userName, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getAge() != user.getAge()) return false;
        return getUserName() != null ? getUserName().equals(user.getUserName()) : user.getUserName() == null;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
