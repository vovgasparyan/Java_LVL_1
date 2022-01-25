package com.aca.classroom.week1.lesson2;

public class ArrayTest {

    public static void main(String[] args) {

        int i = 5;
        int j = 10;
        int[] ints = minAndMax(i, j);
        System.out.println(ints[0] + " " + ints[1]);

        int[] arr1 = minAndMax2(i, j);
        System.out.println(arr1[0] + " " + arr1[1]);

        int[] arr2 = {10, 15, 30};
        System.out.println(max(arr2[2], max(arr2[1], arr2[0])));

        int[] arr3 = {1, 2};
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);

        int[] arr4 = new int[1000];
        for (int k = 0; k < arr4.length; k++) {
            arr4[k] = k;
            System.out.println(arr4[k]);
        }
        System.out.println(sum(arr4));

        int[] arr5 = new int[100];
        for (int k = 0; k < arr5.length; k++) {
            arr5[k] = k / 10;
        }
        printArray(arr5);


    }

    public static int[] minAndMax(int i, int j) {
        int[] array = new int[10];
        if (i < j) {
            array[0] = i;
            array[1] = j;
        } else {
            array[0] = j;
            array[1] = i;
        }
        return array;
    }

    public static int[] minAndMax2(int i, int j) {
        return i < j ? new int[]{i, j} : new int[]{j, i};
    }

    public static int max(int i, int j) {
        return i < j ? j : i;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
