package com.aca.homework.week7.clone;

class LightTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Light light1 = new Light(true);
        Light light2 = Light.turnOn(false);

        Light clone1 = light1.clone();
        Light clone2 = light2.clone();

        System.out.println(clone1);
        System.out.println(clone2);
    }
}