package com.aca.homework.week4.color.pixel;

public class Main {

    public static void main(String[] args) {

        ColorPixel pixel1 = new ColorPixel();
        ColorPixel pixel2 = new ColorPixel();
        ColorPixel pixel3 = new ColorPixel();

        pixel1.setX(2);
        pixel1.setY(4.5);
        pixel1.setColor("red");

        pixel2.setX(4.2);
        pixel2.setY(8);
        pixel2.setColor("red");

        pixel3.setX(6.5);
        pixel3.setY(-3.5);
        pixel3.setColor("blue");

        System.out.println("The first pixel coordinates is - x: " + pixel1.getX() +
                " , y: " + pixel1.getY() + ", color is: " + pixel1.getColor());
        System.out.println("The second pixel coordinates is - x: " + pixel2.getX() +
                " , y: " + pixel2.getY() + ", color is: " + pixel2.getColor());
        System.out.println("The third pixel coordinates is - x: " + pixel3.getX() +
                " , y: " + pixel3.getY() + ", color is: " + pixel3.getColor());
    }
}
