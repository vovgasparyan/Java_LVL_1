package lesson1.com.company;

import java.util.Arrays;

public class PatternTest {

    public static void main(String[] args) {
        char[][] matrix = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = '0';
            }
        }

        System.out.println("This is our matrix before using any methods");
        printMatrix(matrix);
        System.out.println("\nOur matrix after using addPattern3Right method");
        addPattern3Right(matrix, 0, 1);
        printMatrix(matrix);
        System.out.println("\nThis is the method to reset matrix elements");
        resetMatrix(matrix);
        printMatrix(matrix);
        System.out.println("\nOur matrix after using addPattern3Right method");
        addPattern2Right2Top(matrix, 2, 2);
        printMatrix(matrix);
    }

    /***
     * function for print matrix
     * @param matrix created by us, our matrix
     */
    public static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }

    /***
     * function for add 3 right elements value
     * @param matrix created by us, our matrix
     * @param i this is horizon position of elements
     * @param j this is vertical position of elements
     * @return changed matrix
     */
    public static char[][] addPattern3Right(char[][] matrix, int i, int j) {
        if ((j + 3) > matrix[i].length) {
            return matrix;
        }
        for (int k = j; k < j + 3; k++) {
            matrix[i][k] = '*';
        }
        return matrix;
    }

    /***
     * function for reset matrix element
     * @param matrix created by us, our matrix
     * @return new matrix with default elements
     */
    public static char[][] resetMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            Arrays.fill(chars, '0');
        }
        return matrix;
    }

    /***
     * function for add 2 element right and 2 element top
     * @param matrix created by us, out matrix
     * @param i horizon elements
     * @param j vertical elements
     * @return new matrix
     */
    public static char[][] addPattern2Right2Top(char[][] matrix, int i, int j) {
        if (i > 4) {
            return matrix;
        }
        if (((j + 2) > matrix[i].length) || ((i - 2) < 0)) {
            return matrix;
        }
        for (int k = j; k < j + 2; k++) {
            matrix[i][k] = '*';
        }
        for (int k = i - 2; k < i ; k++) {
            matrix[k][j + 1] = '*';
        }
        return matrix;
    }
}
