package com.aca.classroom.week7.lesson14.clone;

public class PredatorAnimal extends Animal {

    public PredatorAnimal (String name) {
        super(AnimalType.PREDATOR, name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tigar = new PredatorAnimal("tigar");
        Animal clonePredator = tigar.clone();
        System.out.println(clonePredator.getClass());
    }
}
