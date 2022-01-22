package com.aca.homework.week2.cars;

public class CarMain {

    public static void main(String[] args) {

        Car[] cars = new Car[41];

        addPorscheCarManufacture(cars);
        carsManufacturedAfter2010(cars);

    }

    public static void addPorscheCarManufacture(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car porsche = new Car();
            int year = 1980;
            porsche.brand = "Porsche";
            porsche.year = year + i;
            cars[i] = porsche;
        }
    }

    public static void carsManufacturedAfter2010(Car[] cars) {
        for (Car porsche : cars) {
            if (porsche.year >= 2010) {
                System.out.println(porsche.brand + " " + porsche.year);
            }
        }
    }
}
