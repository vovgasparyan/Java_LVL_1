package com.aca.exam.exam3.service.core;

public class CreateUserPlateNumberParams {

    private String number;

    private String status;

    private Long userId;

    public CreateUserPlateNumberParams(String number, String status, Long userId) {
        this.number = number;
        this.status = status;
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public String getNumberStatus() {
        return new NumberGenerator().generateRandomNumber();
    }

    public Long getUserId() {
        return userId;
    }
}
