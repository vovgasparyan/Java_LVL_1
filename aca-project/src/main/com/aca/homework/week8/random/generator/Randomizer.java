package com.aca.homework.week8.random.generator;

import java.util.Random;

public class Randomizer {

    public static String randomString() {

        char[] chars = {'a', 'b', '7', '1', '9', '-'};
        StringBuilder stringBuilder = new StringBuilder();
        int j;
        for (int i = 0; i < 3; i++) {
            j = new Random().nextInt(chars.length);
            char ch = chars[j];
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
