package com.aca.classroom.week7.lesson14;

public class Main {

    public static void main(String[] args) {
        System.out.println(ColorsType.RED.getColorStringRepresentation());

    }

    public static String getColor(ColorsType color) {
        if (color == ColorsType.RED) {
            return "red color";
        }
        if (color == ColorsType.BLUE) {
            return "blue color";
        }
        return "default value";
    }
}
