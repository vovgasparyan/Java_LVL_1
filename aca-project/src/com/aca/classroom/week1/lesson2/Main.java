package com.aca.classroom.week1.lesson2;

public class Main {

    public static void main(String[] args) {
        int i1 = 564;
        int i2 = 654;
        int i3 = 6584;
        int i4 = 6554;
        int i5 = 6888554;

//        long result = max(i1, max(i2, max(i3, max(i4, i5))));
//        System.out.println(result);

        long result1 = min(i1, min(i2, min(i3, min(i4, i5))));
        //System.out.println(result1);

        //returnMaxAndMin(i1, i4);

        int i = 974;

        //System.out.println(i / 10);
        //System.out.println(i - (i / 10) * 10);



        System.out.println(firstDigit(i) + " " + secondDigit(i) + " " + thirdDigit(i));


//976
        //976/100=9.76
        //976-9*100=76
        //976-


    }

//    public static long max(long a, long b) {
//        System.out.println("a = " + a + ", b = " + b);
//        return a > b ? a : b;
//
//    }


    public static long min(long a, long b) {
        return a < b ? a : b;
    }

    public static void returnMaxAndMin(long a, long b) {
        if (a > b) {
            System.out.println("Maximum value is: " + a);
            System.out.println("Minimum value is: " + b);
        } else {
            System.out.println("Maximum value is: " + b);
            System.out.println("Minimum value is: " + a);
        }
    }

    public static int firstDigit(int a) {
        return a / 100;
    }

    public static int secondDigit(int a) {
        //974-9*100 = 74 / 10
        return (a - 100 * firstDigit(a))/10;
    }

    public static int thirdDigit(int a) {
        //974
        //974 - first()*100 - second()*
        return a - 100 * firstDigit(a) - 10 * secondDigit(a);

    }
}
