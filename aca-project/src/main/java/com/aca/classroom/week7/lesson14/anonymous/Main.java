package com.aca.classroom.week7.lesson14.anonymous;

public class Main {

    public static void main(String[] args) {

        User user1 = new UserImpl("Name", 17);
        User user2 = User.ofImpl("Name", 17);
        User user3 = new User() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };
    }


}
