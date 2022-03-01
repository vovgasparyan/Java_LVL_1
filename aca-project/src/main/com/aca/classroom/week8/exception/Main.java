package com.aca.classroom.week8.exception;

public class Main {

    public static void main(String[] args) {

//        RuntimeException exception = new RuntimeException();
//        throw exception;


        System.out.println(createUser().getFirstName());
    }

    public static User createUser() {
        User user = null;
        try {
            user = new User("pi", "first name");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        if(user == null) {
            user = new User("ignore", "ignore");
        }

        return user;
    }
}
