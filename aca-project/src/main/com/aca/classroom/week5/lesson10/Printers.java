package com.aca.classroom.week5.lesson10;

public class Printers {

    public static void main(String[] args) {
        //print("sdfsdsdfsd");
        //print(564);
        //print(new Developer("sddfgd"));

        int i = 456;

        Developer eric = new Developer("Eric");

        System.out.println(eric.getClass());

        System.out.println(eric.toString());
        System.out.println(eric);

        // boxed
        //Integer i1 = 465;
    }

    public static void printAll(Developer[] developer) {
        for (int i = 0; i < developer.length; i++) {
            System.out.println(developer[i].toString());
        }
    }

    public static void print(Object o) {
        System.out.println("-----" + o.toString());
    }

}
