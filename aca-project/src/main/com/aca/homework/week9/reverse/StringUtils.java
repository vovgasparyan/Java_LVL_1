package com.aca.homework.week9.reverse;

public class StringUtils {

    public static String reverse(String string) {
        String reversedString = "";
        if (string == null) {
            throw new IllegalArgumentException("Your string is null");
        }
        if (string.length() == 1) {
            return string;
        }
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }

        return reversedString;
    }
}
