package org.pu.oop.model.impl;

import org.pu.oop.exceptions.MissingSidesException;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IsoscelesTryangle extends Tryangle {

    private double height;
    private double base;
    private double leg;

    public IsoscelesTryangle(double a, double b, double c) throws MissingSidesException {
        super(a, b, c);
        setBase();
        setLeg();
    }

    @Override
    public boolean isIsosceles() throws MissingSidesException  {
        if (!super.isIsosceles()) {
            throw new IllegalStateException("Two of the Tryangle sides need to be equal for it to be isosceles");
        }
        return true;
    }

    private void setBase() throws MissingSidesException {
        //first check if tryangle is isosceles
        isIsosceles();
        base = sides.stream()
                .distinct().collect(Collectors.toList()).get(0);
    }

    private void setLeg() {
        Set<Double> allItems = new HashSet<>();
        Set<Double> duplicates = sides.stream()
                                    .filter(n -> !allItems.add(n))
                                    .collect(Collectors.toSet());
        duplicates.remove(base);
        this.leg = duplicates.iterator().next();
    }

    private void setHeight() {
        double expr = (leg * leg) - (base/2);
        this.height = Math.sqrt(expr);
    }

    @Override
    public double getTryangleArea() throws MissingSidesException {
        return (base /2) * height;
    }

}
