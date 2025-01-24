package com.github.hadisabbasi.shape;

public class Shape {
    protected String dimension;
    protected String color;

    public Shape() {
        this("white", "blank");
    }

    public Shape(String color, String dimension) {
        this.color = color;
        this.dimension = dimension;
    }

    public String getColor() {
        return color;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("dimension: " + dimension + "color: " + color);
    }

    public double area() throws Exception {
        throw new Exception("shape doesnt have area!");

    }
}
