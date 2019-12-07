package org.pu.oop.model.impl;

import org.pu.oop.model.api.Polygon;

public class Quadrilateral implements Polygon {

    private final int sideA;
    private final int sideB;
    private static final int numberOfSides = 2;

    //constructor for squares
    public Quadrilateral(int side) {
        sideA = sideB = side;
    }

    public Quadrilateral(int a, int b) {
        sideA = a;
        sideB = b;
    }

    public int getSidesCount() {
        return numberOfSides;
    }

    public boolean isSquare() {
        return sideA == sideB;
    }

}
