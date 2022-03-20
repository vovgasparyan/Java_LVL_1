package com.aca.homework.week8.random.generator;

import java.util.Random;

public class Randomizer {

    public static String randomString() {

        char[] chars = {'a', 'b', '7', '1', '9', '-'};
        StringBuilder stringBuilder = new StringBuilder();
        int index;
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            index = random.nextInt(chars.length);
            char ch = chars[index];
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
