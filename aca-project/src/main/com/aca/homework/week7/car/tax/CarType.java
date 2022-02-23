package com.aca.homework.week7.car.tax;

import java.time.LocalDate;

public enum CarType {
    ELECTRIC,
    HYBRID;

    private int carProductDate;
    private int carAge;

    private int getCarAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        this.carAge = currentYear - this.carProductDate;
        return this.carAge;
    }

    public int annualTex(int carProductDate) {
        this.carProductDate = carProductDate;
        this.getCarAge();
        int sum = 0;
        int tax = 5;
        if (this == HYBRID) {
            for (int i = 1; i < this.carAge; i++) {
                sum += tax * i;
            }
            return sum;
        }
        return tax * this.carAge;
    }
}
