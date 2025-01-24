package com.github.hadisabbasi.shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        this(0, 0, "white", "blank");
    }

    public Rectangle(double length, double width, String color, String dimension) {
        super(color, dimension);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double environment() {
        return length + width * 2;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void printInfo() {
        System.out.println("dimension: " + dimension + "color: " + color);
    }

}
