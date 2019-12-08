package org.pu.oop.test;

import org.junit.Test;
import org.pu.oop.exceptions.MissingSidesException;
import org.pu.oop.model.impl.EquilateralTryangle;
import org.pu.oop.model.impl.IsoscelesTryangle;
import org.pu.oop.model.impl.Tryangle;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TryangleTest {

    @Test
    public void getTryanglePerimeter() {
        try {
            Tryangle tryangle = new Tryangle(3);
            System.out.println(tryangle.getPerimeter());
        } catch (MissingSidesException e) {
            System.out.println(e);
        }
    }

    @Test
    public void getTryangleFace() {
        int area;

        try {
            Tryangle tryangle = new Tryangle(3);
            System.out.println(tryangle.getTryangleArea());
            area = (int) tryangle.getTryangleArea();
            System.out.println("This is the area casted to integer value: " + area);
        } catch (MissingSidesException e) {
            System.out.println(e);
        }
    }

    @Test
    public void tryangleIsIsosceles() {
        Tryangle tryangle = new Tryangle(3.5d, 3.5d, 5d);

        try {
            if (tryangle.isIsosceles()) {
                System.out.println("The tryangle has two equal sides");
            } else {
                System.out.println("The tryangle doesn't have two equal sides");
            }
        } catch (MissingSidesException e) {
            System.out.println(e);
        }
    }

    @Test
    public void sidesCount() throws MissingSidesException {
        //this is an example of polymorphism. We assign a subtype of Tryangle to the
        //tryangle variable depending on the count of equal sides
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        Tryangle tryangle;

        List<Double> sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);

        long distinct = sides.stream()
                .distinct()
                .count();

        switch ((int)distinct) {
            case 1:
                double side = sides.get(0);
                tryangle = new EquilateralTryangle(side);
                break;
            case 2:
                double sideA = sides.get(0);
                double sideB = sides.get(1);
                double sideC = sides.get(2);
                tryangle = new IsoscelesTryangle(sideA, sideB, sideC);
                break;
            case 3: default:
                tryangle = new Tryangle(a, b, c);
                break;
        }

        System.out.println(tryangle.getPerimeter());
        System.out.println(tryangle.getTryangleArea());

    }

}
