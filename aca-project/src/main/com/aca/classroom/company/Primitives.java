package com.aca.classroom.company;

public class Primitives {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        byte by1 = 0b00000011;
        byte by2 = 0b00000111;
        byte by3 = 5;
        System.out.println(by1);
        System.out.println(by2);

        char c1 = 'a';
        char c2 = 'b';
        char c3 = Character.MAX_VALUE;
        char c4 = 96;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        boolean b1 = true;
        boolean b2 = false;

        short s1 = Short.MIN_VALUE;
        short s2 = Short.MAX_VALUE;
        short s3 = 32767;


        int a1 = Integer.MIN_VALUE;
        int a2 = Integer.MAX_VALUE;
        int a3 = 45;

        int color1 = 0b11111111_11111111_00000000_00000000; // 2-akan hamakargum
        int color2 = 0xFF_FF_00_00; // 16-akan hamakargum

        System.out.println("color: " + color1);
        System.out.println("color: " + color2);

        long l1 = Long.MIN_VALUE;
        long l2 = Long.MAX_VALUE;

        float f1 = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = 1.5646f;

        double d1 = Double.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        double d3 = 6546846.654564;
    }
}
