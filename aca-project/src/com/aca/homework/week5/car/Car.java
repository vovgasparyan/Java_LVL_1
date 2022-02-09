package com.aca.homework.week5.car;

public class Car {

    private String brand;
    private String color;
    private double width;
    private double weight;

    public Car (String brand, String color, double width, double weight) {
        this.brand = brand;
        this.color = color;
        this.width = width;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }
}
