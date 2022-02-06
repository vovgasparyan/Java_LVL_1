package com.aca.homework.week2.cars;

public class CarMain {

    public static void main(String[] args) {

        Car[] cars = addPorscheCarManufacture();
        Car[] cars1 = carsManufacturedAfter2010(cars);

        for (Car car : cars1) {
            System.out.println(car.brand + " " + car.year);
        }

    }

    public static Car[] addPorscheCarManufacture() {
        Car[] cars = new Car[41];
        for (int i = 0; i < cars.length; i++) {
            Car porsche = new Car();
            int year = 1980;
            porsche.brand = "Porsche";
            porsche.year = year + i;
            cars[i] = porsche;
        }
        return cars;
    }

    public static Car[] carsManufacturedAfter2010(Car[] cars) {
        int j = 0;
        int yearForQuery = 2010;
        Car[] carsObject = new Car[11];
        for (Car value : cars) {
            Car car = new Car();
            if (value.year >= 2010) {
                car.brand = "Porsche";
                car.year = yearForQuery++;
                carsObject[j] = car;
                j++;
            }
        }
        return carsObject;
    }
}
