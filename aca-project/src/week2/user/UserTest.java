package week2.user;

import java.util.Scanner;

public class UserTest {

    public static void main(String[] args) {

        String[] string = new String[2];

        User[] users = new User[2];

        inputUser(users);


        for (int i = 0; i < users.length; i++) {
            printUsersData(users[i]);
        }

        String[] names = mapUsersToName(users);

        System.out.println(usersName(users));



/*
        user.age = 10;
        user.name = "20";
        user.lastName = "30";

        System.out.println(user.age);
        System.out.println(user.lastName);
        System.out.println(user.name);
        */
    }

    public static void printUsersData(User user) {
        System.out.println(System.currentTimeMillis() + " User name: " + user.name
                + ", user last name: " + user.lastName + ", user age: " + user.age);
    }

    public static void inputUser(User[] users) {
        for (int i = 0; i < 2; i++) {
            User user = new User();

            System.out.println("Please enter the user name");
            user.name = new Scanner(System.in).nextLine();

            System.out.println("Please enter the user lastname");
            user.lastName = new Scanner(System.in).nextLine();

            System.out.println("Please enter the user age");
            user.age = new Scanner(System.in).nextInt();

            users[i] = user;


        }
    }

    public static String[] mapUsersToName(User[] users) {
        String[] userName = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            userName[i] = users[i].name;
        }
        return userName;
    }

    public static String usersName(User[] users) {
        String names = "";
        for (int i = 0; i < users.length; i++) {
            names = names + users[i].name + " ";
        }
        return names;
    }
}
