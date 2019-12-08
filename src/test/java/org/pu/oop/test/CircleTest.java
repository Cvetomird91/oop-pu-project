package org.pu.oop.test;

import org.junit.Before;
import org.junit.Test;
import org.pu.oop.model.impl.Circle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CircleTest {

    List<Double> radiuses;

    @Before
    public void setUp() {
        radiuses = new ArrayList<>();
        radiuses.add(3.0);
        radiuses.add(4.0);
        radiuses.add(5.6);
        radiuses.add(6.78);
        radiuses.add(9.365);
    }

    @Test
    public void writeCircleMetricsToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/circle-form-metrics.txt"));

        writer.write("");
        writer.flush();

        for (Double radius: radiuses) {
            Circle circle = new Circle(radius);

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("circle area: " + circle.getCircleArea() + ", radius: " + circle.getRadius());

            writer.write(stringBuffer.toString());
            writer.write("\n");
        }
        writer.close();
    }

    @Test
    public void circleMetricsWithLimit (){
        for (Double radius :radiuses) {
            //if the radius is longer than 6.0 continue
            if (radius > 6.0) {
                continue;
            }

            Circle circle = new Circle(radius);

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("circle area: " + circle.getCircleArea() + ", radius: " + circle.getRadius());

            System.out.println(stringBuffer.toString());
        }
    }
}
