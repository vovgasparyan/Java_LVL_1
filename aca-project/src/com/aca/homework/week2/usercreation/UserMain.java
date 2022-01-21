package com.aca.homework.week2.usercreation;

public class UserMain {

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.name = "Marry";
        user1.height = 170;

        user2.name = "Grace";
        user2.height = 169;

        user3.name = "Nicolas";
        user3.height = 175;

        user1.printUser(user1);
        user2.printUser(user2);
        user3.printUser(user3);
    }
}
