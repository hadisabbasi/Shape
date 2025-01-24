package com.github.hadisabbasi.shape;

public class Circle extends Shape {
    private int radius;
    private int diameter;
    private static double pi = 3.14;

    public Circle() {
        this(0, 0, "white", "blank");
    }

    public Circle(int radius, int diameter, String color, String dimension) {
        super(color, dimension);
        this.radius = radius;
        this.diameter = diameter;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public double area() {
        return radius * pi * 2;
    }


    @Override
    public void printInfo() {
        System.out.println("area is " + area());
        System.out.println("circle with radius: " + radius + " dimension: " + dimension + " color: " + color + " area: " + area());

    }
}
