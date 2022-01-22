package com.aca.homework.week2.maxmin;

import java.util.Scanner;

public class MaxMinMain {

    public static void main(String[] args) {
        MaxMin maxMin;
        maxMin = longNumbers(4000, 2500);

        System.out.println("Printing the object maxMin: \n" + maxMin + "\n");
        System.out.println("The maximum value from method longNumbers is: " + maxMin.max);
        System.out.println("The minimum value from method longNumbers is: " + maxMin.min);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the maximum value:");
        maxMin.max = scanner.nextLong();

        System.out.println("Enter the minimum value:");
        maxMin.min = scanner.nextLong();

        System.out.println("The maximum value is: " + maxMin.max);
        System.out.println("The minimum value is: " + maxMin.min);

    }

    public static MaxMin longNumbers(long i, long j) {
        MaxMin maxMin = new MaxMin();
        maxMin.max = i;
        maxMin.min = j;
        return maxMin;
    }
}
