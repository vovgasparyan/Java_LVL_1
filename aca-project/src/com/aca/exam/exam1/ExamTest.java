package com.aca.exam.exam1;

import java.util.Scanner;

public class ExamTest {

    public static void main(String[] args) {

        Exam exam = new Exam();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        exam.setNumberOfArrays(array);
        System.out.println("Enter the function number between 1 to 8");

        boolean point = false;
        int checkFunctionNumber3 = 0;
        while (!point) {
            int functionNumber = scanner.nextInt();

            switch (functionNumber) {
                case 1:
                    if (checkFunctionNumber3 == 3) {
                        System.out.println(exam.maxValue() * 2);
                    } else {
                        System.out.println(exam.maxValue());
                    }
                    break;
                case 2:
                    System.out.println(exam.minValue());
                    break;
                case 3:
                    checkFunctionNumber3 = 3;
                    System.out.println(exam.multiplyNumbers());
                    break;
                case 4:
                    System.out.println(exam.numbersAverage());
                    break;
                case 5:
                    System.out.println("Enter element number");
                    int elem = scanner.nextInt();
                    exam.printNElement(elem);
                    break;
                case 6:
                    System.out.println(exam.differenceMaxAndMinValues());
                    break;
                case 7:
                    System.out.println(exam.zeroValueCount());
                    break;
                case 8:
                    point = true;
                    break;
                default:
                    System.out.println("Input number from 1 to 8");

            }

        }
    }

}
