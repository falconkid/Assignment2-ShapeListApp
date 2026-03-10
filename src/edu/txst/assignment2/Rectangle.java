package edu.txst.assignment2;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getClassName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle (W: " + width + ", H: " + height + ")";
    }
}