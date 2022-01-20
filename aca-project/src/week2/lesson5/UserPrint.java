package week2.lesson5;

import java.util.Objects;
import java.util.Scanner;

public class UserPrint {

    public static void main(String[] args) {

        String[] usersName = new String[3];
        String[] usersLastName = new String[3];
        int[] usersAge = new int[3];

        inputUsers(usersName, usersLastName, usersAge);

        for (int i = 0; i < 3; i++) {
            printUsersData(usersName, usersLastName, usersAge, i);
            wait1Second();
        }

        searchName(usersName, usersLastName, usersAge);

    }

    public static void inputUsers(String[] usersName, String[] usersLastName, int[] usersAge) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the user name");
            usersName[i] = new Scanner(System.in).nextLine();
            System.out.println("Please enter the user lastname");
            usersLastName[i] = new Scanner(System.in).nextLine();
            System.out.println("Please enter the user age");
            usersAge[i] = new Scanner(System.in).nextInt();
        }
    }

    public static void printUsersData(String[] usersName, String[] usersLastName, int[] usersAge, int i) {
        System.out.println(System.currentTimeMillis() + " User name: " + usersName[i]
                + ", user last name: " + usersLastName[i] + ", user age: " + usersAge[i]);

    }

    public static void wait1Second() {
        long start = System.currentTimeMillis();
        while ((System.currentTimeMillis() - start) < 1000) {}
    }

    public static void searchName(String[] usersName, String[] usersLastName, int[] usersAge) {
        System.out.println("Enter exists user name");
        String userName = new Scanner(System.in).next();
        for (int i = 0; i < usersName.length; i++) {
            if (Objects.equals(userName, usersName[i])) {
                System.out.println("User lastname: " + usersLastName[i] + ", user age " + usersAge[i]);
            }
        }
    }
}
