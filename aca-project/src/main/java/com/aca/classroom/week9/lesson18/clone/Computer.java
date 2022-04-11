package com.aca.classroom.week9.lesson18.clone;

public class Computer implements ConstructorClonable<Computer> {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public Computer(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer " + brand;
    }

    @Override
    public Computer doClone() {
        return new Computer(this.brand);
    }
}
