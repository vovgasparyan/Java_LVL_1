package com.aca.classroom.week3.lesson7.human;

public class Human {

    private String name;
    private double height;

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new RuntimeException("height is negative");
        }
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStringRepresentation() {
        return name + " " + height;
    }
}
