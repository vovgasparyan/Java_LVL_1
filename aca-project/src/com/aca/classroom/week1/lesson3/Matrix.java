package com.aca.classroom.week1.lesson3;

public class Matrix {

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        matrix[0][1] = 5;

        System.out.println("123456");
        System.out.print("***");
        System.out.println("1365");

        if (true) {
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }
}
