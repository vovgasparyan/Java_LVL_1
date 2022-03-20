package com.aca.homework.week8.car.repository;

import java.util.Objects;

public class Car {

    private String vin;
    private int year;
    private int ownersCount;

    public Car(String vin, int year, int ownersCount) {
        this.vin = vin;
        this.year = year;
        this.ownersCount = ownersCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (ownersCount != car.ownersCount) return false;
        return !Objects.equals(vin, car.vin);
    }

    public String getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public int getOwnersCount() {
        return ownersCount;
    }
}
