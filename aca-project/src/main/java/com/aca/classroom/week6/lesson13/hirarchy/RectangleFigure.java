package com.aca.classroom.week6.lesson13.hirarchy;

public class RectangleFigure implements Figure {

    private double width;
    private double height;

    public RectangleFigure(double width, double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
