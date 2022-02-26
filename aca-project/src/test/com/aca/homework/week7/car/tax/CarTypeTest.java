package com.aca.homework.week7.car.tax;

class CarTypeTest {

    public static void main(String[] args) {

        System.out.println("The annual tax of HYBRID car is: " + CarType.HYBRID.annualTex(12) + " USD");
        System.out.println("The annual tax of ELECTRIC car is: " + CarType.ELECTRIC.annualTex(7) + " USD");
    }
}