package org.pu.oop.model.impl;

import org.pu.oop.model.api.Polygon;

public class Quadrilateral implements Polygon {

    private final double sideA;
    private final double sideB;
    private static final int numberOfSides = 2;

    //constructor for squares
    public Quadrilateral(double side) {
        sideA = sideB = side;
    }

    public Quadrilateral(double a, double b) {
        sideA = a;
        sideB = b;
    }

    public int getSidesCount() {
        return numberOfSides;
    }

    public boolean isSquare() {
        return sideA == sideB;
    }

    public int getFace() {
        return (int) (sideA * sideB);
    }

    public double getPerimeter() {
        return (sideA * 2) + (sideB * 2);
    }

}
