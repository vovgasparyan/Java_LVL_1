package com.aca.classroom.week6.lesson13.set;

public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

//        if (obj == null || obj.getClass() != User.class) {
//            return false;
//        }

        if (!(obj instanceof User)) {
            return false;
        }

        User user = (User) obj;

        return user.firstName.equals(this.firstName) && user.lastName.equals(this.lastName);
    }

    @Override
    public String toString() {
        return "The user: " +  "firstName: " + firstName + ", lastName: " + lastName;
    }

    public static void main(String[] args) {

        Object user = new User("F", "L");
        Object child = new ChildUser("F", "L");

        System.out.println(user instanceof User);
        System.out.println(child instanceof User);
    }
}
