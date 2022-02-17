package com.aca.homework.week2.random.string;

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(randomString());
        }
    }

    public static String randomString () {
        String str = "";
        char[] chars = new char[]{'a', 'v', '5', 'i', '4', 'e'};
        for (int i = 0; i < 5; i++) {
            int randomInt = new Random().nextInt(6);
            str += chars[randomInt];
        }
        return str;
    }
}
