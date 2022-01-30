package com.aca.homework.week2.cars;

public class CarMain {

    public static void main(String[] args) {

        Car[] cars = addPorscheCarManufacture();
        String[] str = carsManufacturedAfter2010(cars);

        for (String strings : str) {
            System.out.println(strings);
        }

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

    public static String[] carsManufacturedAfter2010(Car[] cars) {
        int yearsManufacturedAfter2010 = 2021 - 2010;
        int j = 0;
        String[] strings = new String[yearsManufacturedAfter2010];

        for (Car car : cars) {
            if (car.year >= 2010) {
                strings[j] = car.brand + " " + car.year;
                j++;
            }
        }
        return strings;
    }
}
