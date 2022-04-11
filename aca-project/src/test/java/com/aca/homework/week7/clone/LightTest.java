package com.aca.homework.week7.clone;

class LightTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Light light1 = new Light(true);
        Light light2 = Light.ofLightOn();
        Light light3 = Light.ofLightOff();

        Light clone1 = light1.clone();
        Light clone2 = light2.clone();
        Light clone3 = light3.clone();

        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
    }
}