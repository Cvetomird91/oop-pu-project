package org.pu.oop.model.impl;

import org.pu.oop.exceptions.MissingSidesException;
import org.pu.oop.model.api.Polygon;

import java.util.ArrayList;
import java.util.List;

public class Tryangle implements Polygon {

    private static List<Integer> sides;

    static {
        sides = new ArrayList<>();
    }

    public int getSidesCount() {
        return sides.size();
    }

    //constructor for equal sided tryangle
    public Tryangle(int a) {
        int b = a;
        int c = a;
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    public Tryangle(int a, int b, int c) {
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    public boolean isEquilateral() throws MissingSidesException {
        if (sides.isEmpty() || sides.size() != 3) {
            throw new MissingSidesException();
        }
        int a = sides.get(0);
        return sides.stream()
                .allMatch(side -> side == a);
    }

    public boolean isIsosceles() throws MissingSidesException {
        if (sides.isEmpty() || sides.size() != 3) {
            throw new MissingSidesException();
        }
        if (isEquilateral()) return false;
        return sides.stream()
                .distinct()
                .count() == 2;
    }

    public double getPerimeter() throws MissingSidesException {
        if (sides.isEmpty() || sides.size() != 3) {
            throw new MissingSidesException();
        }

        int total = 0;
        for (int i = 0; i < sides.size(); i++) {
            total += sides.get(i);
        }

        return (double) total;
    }

    //get a triangle's area using Heron's formula
    public double getTriangleArea() throws MissingSidesException {
        double perimeter = getPerimeter();
        double a = sides.get(0);
        double b = sides.get(1);
        double c = sides.get(2);

        double expr = perimeter * (perimeter - a) *
                (perimeter - b) * (perimeter - c);

        return Math.sqrt(expr);
    }

}
