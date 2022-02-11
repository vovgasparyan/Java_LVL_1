package com.aca.homework.week5.car;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String brand;
        String color;
        double width;
        double weight;

        Car[] cars = new Car[5];

        int index = 0;

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter the number " + (i + 1) + " car's brand");
            brand = scanner.next();

            if ((Objects.equals(brand, "hyundai")) || (Objects.equals(brand, "bmw"))) {
                System.out.println("Enter the number " + (i + 1) + " car's color");
                color = scanner.next();

                System.out.println("Enter the number " + (i + 1) + " car's width");
                width = scanner.nextDouble();

                System.out.println("Enter the number " + (i + 1) + " car's weight");
                weight = scanner.nextDouble();

                Car car = new Car(brand, color, width, weight);
                cars[index] = car;
            } else {
                System.out.println(brand + " is not found in this class.");
                index--;
            }
            index++;
        }

        System.out.println("Calling method getCarsInfo:");
        getCarsInfo(cars);

    }

    public static void getCarsInfo(Car[] cars) {
        for (Car car : cars) {
            if (car != null) {
                System.out.println(car);
            }
        }
    }
}
