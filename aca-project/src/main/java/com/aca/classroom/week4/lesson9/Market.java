package com.aca.classroom.week4.lesson9;

public class Market {

    private static int soldCars;

    public static Car carOption1() {
        Car car = new Car();
        car.setAudioPlayer(new AudioPlayer());
        return car;
    }

    public static Car carOption2() {
        return new Car();
    }

    public static int soldCars(Car car) {
        return soldCars++;
    }

    public static void main(String[] args) {
        Car car = carOption2();
        Car car1 = carOption1();
        Car car2 = carOption1();
        soldCars(car);
        soldCars(car1);
        soldCars(car2);
        System.out.println(soldCars);

    }


}
