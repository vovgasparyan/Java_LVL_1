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

        Car[] cars = new Car[2];
        for (int i = 0; i < 2; i++) {
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
                cars[i] = car;
            } else {
                break;
            }

        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand() + " " + cars[i].getColor() + " " + cars[i].getWidth() +
                    " " + cars[i].getWeight());
        }
    }
}
