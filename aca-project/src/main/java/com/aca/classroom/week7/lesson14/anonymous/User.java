package com.aca.classroom.week7.lesson14.anonymous;

public interface User {

    static User ofImpl(String name, int age) {
        return new UserImpl(name, age);
    }

    static User of(String name, int age) {
        return new User() {

            @Override
            public String getName() {
                return name;
            }

            @Override
            public int getAge() {
                return age;
            }
        };
    }

    String getName();

    int getAge();


}
