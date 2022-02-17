package com.aca.classroom.week1.lesson2;

public class StringTest {

    public static void main(String[] args) {
        char c = '5';
        System.out.println(c);


        int i = 5;
        int j = 10;

        String s = i + " " + j;
        final char c1 = s.charAt(0);

        System.out.println(c1);
        System.out.println(s);

        System.out.println(minAndMax(i, j));
    }

    public static String minAndMax(long i1, long i2) {
        return i1 < i2 ? i1 + "|" + i2 : i2 + "|" + i1;

    }
}
