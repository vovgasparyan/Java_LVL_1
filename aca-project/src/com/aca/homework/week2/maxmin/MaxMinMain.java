package com.aca.homework.week2.maxmin;

import java.util.Scanner;

public class MaxMinMain {

    public static void main(String[] args) {
        MaxMin maxMin = longNumbers(4000, 2500);

        System.out.println("Printing the object maxMin: \n" + maxMin + "\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first value:");
        long i = scanner.nextLong();

        System.out.println("Enter the second value:");
        long j = scanner.nextLong();

        maxMin = longNumbers(i, j);

        System.out.println("The maximum value is: " + maxMin.max);
        System.out.println("The minimum value is: " + maxMin.min);

    }

    public static MaxMin longNumbers(long i, long j) {
        MaxMin maxMin = new MaxMin();
        if (i > j) {
            maxMin.max = i;
            maxMin.min = j;
        } else {
            maxMin.max = j;
            maxMin.min = i;
        }
        return maxMin;
    }
}
