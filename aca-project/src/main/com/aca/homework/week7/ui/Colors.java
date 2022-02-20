package com.aca.homework.week7.ui;

public class Colors {

    public static String colors(ColorsSelector color) {
        String returnedColor = "";
        switch (color) {
            case BLACK -> returnedColor = "\u001B[30m";
            case RED -> returnedColor = "\u001B[31m";
            case YELLOW -> returnedColor = "\u001B[33m";
            case GREEN -> returnedColor = "\u001B[32m";
            case BLUE -> returnedColor = "\u001B[34m";
            case PURPLE -> returnedColor = "\u001B[35m";
            case CYAN -> returnedColor = "\u001B[36m";
            case WHITE -> returnedColor = "\u001B[37m";
        }
        return returnedColor;
    }
}
