package edu.txst.assignment2;

/**
 * Triangle class implementing the Shape interface.
 * CS3354 - Assignment 2
 * Author: Deeason Sitaula
 */
public class Triangle implements Shape {

    private double base;
    private double height;

    /**
     * Constructs a Triangle with the given base and height.
     * 
     * @param base   the base length of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Returns the area of the triangle using the formula: (1/2) * base * height
     * 
     * @return area as a double
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Returns the class name of this shape.
     * 
     * @return "Triangle"
     */
    @Override
    public String getClassName() {
        return "Triangle";
    }

    /**
     * Returns a string representation of the Triangle object.
     * Format: Triangle [base=X.X, height=X.X]
     * 
     * @return formatted string
     */
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}
