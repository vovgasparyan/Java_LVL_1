package com.aca.classroom.week1.lesson3;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

/*        String s = "1|2|3|4|5|6";
        int length = s.length();
        System.out.println("The length is: " + length);

        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '|') {
                s1 += s.charAt(i);
                System.out.println(s.charAt(i));
            }

        }

        char[] chars = s.toCharArray();

        System.out.println();*/



       final String string = new Scanner(System.in).next();

        System.out.println(indexOfString(string));

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
/*

        for (int i = 0; i < numbers.length; i++) {
            int x = scanner.nextInt();
            numbers[i] = i;
            if(x == 75) {
                System.out.println(numbers[i]);
            }

        }
*/


    }

    public static int indexOfString(String string) {
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e'};
        char firstChar = string.charAt(0);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == firstChar) {
                return i;
            }
        }
        return -1;
    }

/*    public static int indexOfArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
    }*/
}
