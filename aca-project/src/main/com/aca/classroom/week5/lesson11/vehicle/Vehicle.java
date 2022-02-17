package com.aca.classroom.week5.lesson11.vehicle;

public class Vehicle {

    // MOTORCYCLE, CAR, BUS
    private String type;

    // SUZUKI, OPEL, MAN
    private String brand;

    private int year;

    public Vehicle(String type, String brand, int year) {
        if (type.equals("MOTORCYCLE") || type.equals("CAR") || type.equals("BUS")) {
            this.type = type;
            this.brand = brand;
            this.year = year;
        } else {
            throw new RuntimeException();
        }

    }

    public static void main(String[] args) {
        new Vehicle("ssdfsdf", "BMW", 444);
        System.out.println("THE END!");
    }
}
