package com.aca.classroom.week7.lesson14;

public enum ColorsType {
    RED("red color", 0xFFFF0000),
    GREEN ("green color", 0xFF00FF00),
    BLUE ("blue color");

    private String colorStringRepresentation;
    private int intValue;

    ColorsType(String colorStringRepresentation, int intValue) {
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = intValue;
        System.out.println("The constructor was invoked " + colorStringRepresentation);
    }

    ColorsType(String colorStringRepresentation) {
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = 0;
        System.out.println("The constructor was invoked " + colorStringRepresentation);
    }

    public static String getColor(ColorsType colorType) {
        if (colorType == ColorsType.RED) {
            return "red color";
        }
        if (colorType == ColorsType.BLUE) {
            return "blue color";
        }
        return "default value";
    }

    @Override
    public String toString() {
        if (this == ColorsType.RED) {
            return "red color";
        }
        if (this == ColorsType.BLUE) {
            return "blue color";
        }
        return super.toString();
    }

    public String getColorStringRepresentation() {
        return colorStringRepresentation;
    }

    public int getIntValue() {
        return intValue;
    }
}
