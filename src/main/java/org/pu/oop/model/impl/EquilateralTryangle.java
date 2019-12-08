package org.pu.oop.model.impl;

import org.pu.oop.exceptions.MissingSidesException;

public class EquilateralTryangle extends Tryangle {

    public EquilateralTryangle(double a) {
        super(a);
    }

    @Override
    protected boolean isEquilateral() throws MissingSidesException {
        //check if some of the sides is of different length
        if (sides.isEmpty() || sides.size() != 3 || sides.stream()
                .distinct()
                .count() != 1) {
            throw new IllegalStateException("Some of the sides is not of equal length!");
        }
        return true;
    }

    @Override
    public double getTryangleArea() throws MissingSidesException {
        double side = sides.get(0);
        if (side == 0.0 || sides.size() != 3) {
            throw new IllegalStateException("Some of the sides is not of equal length!");
        }
        return (Math.sqrt(3) / 4) * (side * side);
    }
}
