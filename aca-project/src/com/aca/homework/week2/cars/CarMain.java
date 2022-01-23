package com.aca.homework.week2.cars;

public class CarMain {

    public static void main(String[] args) {

        Car[] cars = addPorscheCarManufacture();
        String str = carsManufacturedAfter2010(cars);

        System.out.println(str);

    }

    public static Car[] addPorscheCarManufacture() {
        int years = 2021 - 1980;
        Car[] cars = new Car[years];
        for (int i = 0; i < cars.length; i++) {
            Car porsche = new Car();
            int year = 1980;
            porsche.brand = "Porsche";
            porsche.year = year + i;
            cars[i] = porsche;
        }
        return cars;
    }

    public static String carsManufacturedAfter2010(Car[] cars) {
        StringBuilder carsList = new StringBuilder();
        for (Car car : cars) {
            if (car.year >= 2010) {
                carsList.append(car.brand).append(" ").append(car.year).append("\n");
            }
        }
        return carsList.toString();
    }
}
