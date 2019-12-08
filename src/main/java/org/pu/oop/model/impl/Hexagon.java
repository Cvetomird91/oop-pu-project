package org.pu.oop.model.impl;

import org.pu.oop.exceptions.MissingSidesException;
import org.pu.oop.model.api.Polygon;

public class Hexagon implements Polygon {

    private static final int numberOfSides = 6;
    private static final double defaultSideSize = 1;
    private static double side;

    public int getSidesCount() {
        return numberOfSides;
    }

    public Hexagon(int a) {
        side = a;
    }

    public Hexagon() {
        side = defaultSideSize;
    }

    public double getPerimeter() throws MissingSidesException {
        if (side == 0 || side < 0) {
            throw new MissingSidesException("Hexagon side is 0 or less than zero");
        }

        return side * 6;
    }

    public int getFace() {
        return (int) (((3 * (Math.sqrt(3))) / 2) * (side * side));
    }

    public double getArea() {
        return (( 3 * Math.sqrt(3)) / 2) * (side * side);
    }

}
