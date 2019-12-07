package org.pu.oop.model.impl;

import org.pu.oop.model.api.Polygon;

public class Hexagon implements Polygon {

    private static final int numberOfSides = 6;

    public int getSidesCount() {
        return numberOfSides;
    }
}
