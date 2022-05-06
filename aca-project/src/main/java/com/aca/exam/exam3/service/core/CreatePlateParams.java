package com.aca.exam.exam3.service.core;

public class CreatePlateParams {

    private String numbers;
    private String numberStatus;

    public CreatePlateParams(String numbers, String numberStatus) {
        this.numbers = numbers;
        this.numberStatus = numberStatus;
    }

    public String getNumbers() {
        return new NumberGenerator().generateRandomNumber();
    }

    public String getNumberStatus() {
        return numberStatus;
    }
}
