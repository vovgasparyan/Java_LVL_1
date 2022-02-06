package com.aca.exam.exam1;

public class Exam {

    private int[] numberOfArrays;

    public int maxValue() {
        int maxNumber = this.numberOfArrays[0];
        for (int i = 1; i < this.numberOfArrays.length; i++) {
            if (maxNumber < this.numberOfArrays[i]) {
                maxNumber = this.numberOfArrays[i];
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

    public double numbersAverage() {
        double sumOfNumbers = 0;
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
        if ((element > numbersCount) || (element < 0)) {
            System.out.println("Էլեմենտի սխալ համար\nՄուտքագրեք ծրագրի համարը");
        } else {
            System.out.println(this.numberOfArrays[element]);
        }
    }

    public int zeroValueCount() {
        StringBuilder checkString = new StringBuilder();

        for (int numberOfArray : this.numberOfArrays) {
            checkString.append(numberOfArray);
        }
        return checkString.length() - checkString.toString().replaceAll("0", "").length();
    }

    public void setNumberOfArrays(int[] inputArray) {
        this.numberOfArrays = inputArray;
    }

}
