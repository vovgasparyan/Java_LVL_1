package com.aca.homework.week8.car.repository;

public class CarRepository {

    private int size = 1000;
    private Car[] cars = new Car[size];
    private int index;

    public Car save(Car car) {
        if(isOutOfBounds()) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        } else {
            Car carByVin = findByVin(car.getVin());
            if (carByVin != null) {
                return carByVin;
            }
            cars[index++] = car;
        }
        return cars[index - 1];
    }

    public Car findByVin(String vin) {
        for (int i = 0; i < index; i++) {
            if (vin.equals(cars[i].getVin())) {
                return cars[i];
            }
        }
        return null;
    }

    public int getTotalCount() {
        return index;
    }

    public boolean isOutOfBounds() {
        return cars.length <= 999;
    }

    public void getCars() {
        for (int i = 0; i < index; i++) {
            System.out.println(cars[i].getVin());
        }
    }

    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        Car car1 = new Car("DBX2003", 2018, 1);
        Car car2 = new Car("DBX2003", 2021, 1);
        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.getCars();

        System.out.println(carRepository.getTotalCount());
    }

}
