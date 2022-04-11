package com.aca.classroom.week2.lesson4;

public class ReferenceTest {

    public static void main(String[] args) {

        int a = 7;
        int b = 8;
        swap(a, b);
        System.out.println("From main method" + a + " " + b);

    }

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("From swap method " + a + " " + b);
    }

    public static void testSwapArray() {
        int[] array1 = {1, 2, 3, 0};
        int[] array2 = {72, 333, 0, 77};

        swapArray(array1, array2);
        System.out.println(array1[0]);
        System.out.println(array2[0]);
    }

    public static void swapArray(int[] i, int[] j) {
        int[] c = i;
        i = j;
        j = c;
    }

    public static void assignArrayToNull() {
        int[] array = new int[4];
        int[] array0;
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 0;

        deleteReference(array);
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
    }

    public static void deleteReference(int[] i) {
        i = null;
    }

    public static void testArray() {
        int[] array = new int[4];
        int[] array0;
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 0;

        changeArray(array);
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
    }

    public static void changeArray(int[] i) {
        i[1] = 897897897;
    }

    public static int increment(int i) {
        i = i + 5;
        return i;
    }

    public static void testInt() {
        int i = 5;
        int j = increment(i);

        System.out.println(i);
    }
}
