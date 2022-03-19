package com.aca.homework.week7.car.tax;

public enum CarType {
    ELECTRIC,
    HYBRID;

    public int annualTex(int carAge) {
        int sum = 0;
        int tax = 5;
        if (this == HYBRID) {
            for (int i = 1; i < carAge; i++) {
                sum += tax * i;
            }
            return sum;
        }
        return tax * carAge;
    }
}
