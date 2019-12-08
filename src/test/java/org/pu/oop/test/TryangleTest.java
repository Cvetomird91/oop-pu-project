package org.pu.oop.test;

import org.junit.Test;
import org.pu.oop.exceptions.MissingSidesException;
import org.pu.oop.model.impl.Tryangle;

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
                System.out.println("The triangle has two equal sides");
            } else {
                System.out.println("The tryangle doesn't have two equal sides");
            }
        } catch (MissingSidesException e) {
            System.out.println(e);
        }
    }
}
