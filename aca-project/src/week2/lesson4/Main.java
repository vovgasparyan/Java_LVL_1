package week2.lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] fields = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                fields[i][j] = '0';

            }
        }

        printMatrix(fields);

        addShip(fields, 3, 1);
        System.out.println("After");
        printMatrix(fields);
    }

    public static char[][] addShip(char[][] fields, int i, int j) {
        if (j + 4 > fields[i].length) {
            return fields;
        }
        for (int c = j; c < j + 4; c++) {
            fields[i][c] = '*';
        }
        return fields;
    }

    /**
    Homework
     */
    public static void addShipVertical(char[][] fields, int i, int j) {

    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
