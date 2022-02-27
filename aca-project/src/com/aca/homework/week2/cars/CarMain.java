package com.aca.homework.week2.cars;

public class CarMain {

    public static void main(String[] args) {

        Car[] cars = addPorscheCarManufacture();
        Car[] cars1 = carsManufactured(cars, 2010, 2020);

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

    public static Car[] carsManufactured(Car[] cars, int afterYear, int beforeYear) {
        int index = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year > afterYear && cars[i].year <= beforeYear) {
                index++;
            }
        }
        Car[] newCars = new Car[index];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year > afterYear && cars[i].year <= beforeYear) {
                Car porsche = new Car();
                porsche.brand = "Porsche";
                porsche.year = ++afterYear;
                newCars[j] = porsche;
                j++;
            }
        }
        return newCars;
    }
}
