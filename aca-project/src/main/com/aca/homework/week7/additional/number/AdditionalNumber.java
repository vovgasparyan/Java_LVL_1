package com.aca.homework.week7.additional.number;

public class AdditionalNumber {


    public int elementSum(int[] array) {
        int elemSum = 0;

        for (int i : array) {
            elemSum += i;
        }

        return elemSum;
    }

    public int differenceArrayElements(int[] array1, int[] array2) {
        return elementSum(array1) - elementSum(array2);
    }

    public static void main(String[] args) {

        AdditionalNumber additionalNumber = new AdditionalNumber();
        int[] array1 = {24, 4, 6, 8, 15};
        int[] array2 = {4, 6, 8, 24};

        System.out.println(additionalNumber.differenceArrayElements(array1, array2));
    }


}
