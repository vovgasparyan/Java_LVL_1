package com.aca.classroom.week6.lesson13;

public class Figure {

    private double width;
    private double height;
    private double radius;
    private FigureType type;

    private Figure(double width, double height) {
        this.type = FigureType.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    private Figure(double radius) {
        this.type = FigureType.CIRCLE;
        this.radius = radius;
    }

    public static Figure ofRectangle(double width, double height) {
        return new Figure(width, height);
    }

    public static Figure ofCircle(double radius) {
        return new Figure(radius);
    }

    public double area() {
        if (this.type == FigureType.CIRCLE) {
            return Math.PI * radius * radius;
        } else {
            return this.width * this.height;
        }
    }

    public double perimeter() {
        if (this.type == FigureType.CIRCLE) {
            return 2 * Math.PI * radius;
        } else {
            return 2 * (this.height + this.width);
        }
    }

    @Override
    public String toString() {
        return "Figure{" +
                "width=" + width +
                ", height=" + height +
                ", radius=" + radius +
                ", type=" + type +
                '}';
    }

    public static void main(String[] args) {

        Figure figure = new Figure(2);
        System.out.println(figure.area());
        System.out.println(figure.perimeter());
    }
}
