package com.aca.classroom.week8.scanner;

import java.util.InputMismatchException;

public class IntScanner {

    private IntSupplier intSupplier;

    public IntScanner(IntSupplier intSupplier) {
        this.intSupplier = intSupplier;
    }

    public int[] get5SizedArray() {
        int[] array = new int[5];
/*        for (int i = 0; i < 5; i++) {
            try {
                Scanner scanner = new Scanner(System.in);
                int numbers = scanner.nextInt();
                array[i] = numbers;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                i--;
            }

        }*/
        int i = 0;
        while(i < 5) {
            try {
                array[i] = intSupplier.get();
                i++;
            }
            catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
        return array;
    }

    public int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
//        int[] arr = get5SizedArray();
//        System.out.println(getMax(arr));
        //System.out.println(Arrays.toString(new IntScanner(new IntSupplier()).get5SizedArray()));
    }
}
