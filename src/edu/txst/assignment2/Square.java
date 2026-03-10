package edu.txst.assignment2;

/**
 * Square class implementing the Shape interface.
 * CS3354 - Assignment 2
 * Author: Deeason Sitaula
 */
public class Square implements Shape {

    private double side;

    /**
     * Constructs a Square with the given side length.
     * @param side the length of each side
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Returns the area of the square: side * side
     * @return area as a double
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * Returns the class name of this shape.
     * @return "Square"
     */
    @Override
    public String getClassName() {
        return "Square";
    }

    /**
     * Returns a string representation of the Square object.
     * Format: Square [side=X.X]
     * @return formatted string
     */
    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
}
