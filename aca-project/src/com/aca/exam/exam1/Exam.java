package com.aca.exam.exam1;

public class Exam {

    private int[] numberOfArrays;

    public int maxValue() {
        int maxNumber = this.numberOfArrays[0];
        for (int numberOfArray : this.numberOfArrays) {
            if (maxNumber < numberOfArray) {
                maxNumber = numberOfArray;
            }
        }
        return maxNumber;
    }

    public int minValue() {
        int minNumber = this.numberOfArrays[0];
        for (int numberOfArray : this.numberOfArrays) {
            if (minNumber > numberOfArray) {
                minNumber = numberOfArray;
            }
        }
        return minNumber;
    }

    public int multiplyNumbers() {
        int multiplyFirstValue = 1;
        for (int numberOfArray : this.numberOfArrays) {
            multiplyFirstValue *= numberOfArray;
        }
        return multiplyFirstValue;
    }

    public int numbersAverage() {
        int sumOfNumbers = 0;
        for (int numberOfArray : this.numberOfArrays) {
            sumOfNumbers += numberOfArray;
        }
        return sumOfNumbers / this.numberOfArrays.length;
    }

    public int differenceMaxAndMinValues() {
        return maxValue() - minValue();
    }

    public void printNElement(int element) {
        int numbersCount = this.numberOfArrays.length;
        if (element > numbersCount) {
            System.out.println("Incorrect element number");
        } else {
            System.out.println(this.numberOfArrays[element]);
        }
    }

    public int zeroValueCount() {
        int zeroCount = 0;
        StringBuilder stringForCheck = new StringBuilder();
        for (int i = 0; i < this.numberOfArrays.length; i++) {
            stringForCheck.append(this.numberOfArrays[i]);
            if (stringForCheck.charAt(i) == '0') {
                zeroCount++;
            }
        }
        return zeroCount;
    }

    public void setNumberOfArrays(int[] inputArray) {
        this.numberOfArrays = inputArray;
    }

}
