package org.pu.oop.test;

import org.junit.Test;
import org.pu.oop.exceptions.MissingSidesException;
import org.pu.oop.model.impl.Hexagon;

public class HexagonTest {

    @Test
    public void hexagonExample() throws MissingSidesException  {
        Hexagon hexagon = new Hexagon(100);
        System.out.println("get hexagon perimeter: " + hexagon.getPerimeter());
        System.out.println("get hexagon area: " + hexagon.getArea());
    }
}
