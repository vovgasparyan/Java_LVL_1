package com.aca.homework.week5.equals;

public class Main {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Mark", "Yorgantz");
        Owner owner2 = new Owner("Mark", "Tavares");

        if (owner1.equals(owner2))
            System.out.println("It's the same person");
        else
            System.out.println("They are different persons");


        Motorcycle motorcycle1 = new Motorcycle(MotoType.YAMAHA, owner1);
        Motorcycle motorcycle2 = new Motorcycle(MotoType.YAMAHA, owner2);

        System.out.println(motorcycle1);
        System.out.println(motorcycle2);

        if (motorcycle1.equals(motorcycle2))
            System.out.println("The type of motorcycles is the same.");
        else
            System.out.println("The type of motorcycles is different");

    }
}
