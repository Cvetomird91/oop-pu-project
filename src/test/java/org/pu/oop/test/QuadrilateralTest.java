package org.pu.oop.test;

import org.junit.Test;
import org.pu.oop.model.impl.Quadrilateral;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuadrilateralTest {

    @Test
    public void readSidesFromFile() throws IOException {
        System.out.println(System.getProperty("user.dir"));
        BufferedReader csvReader = new BufferedReader(new FileReader("src/main/resources/quadrilateral-sides-list.csv"));

        String row;
        while((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            System.out.println("Line from file: " + row);

            Quadrilateral quadrilateral = new Quadrilateral(Double.parseDouble(data[0]), Double.parseDouble(data[1]));

            System.out.println("The fiqure is a square: " + quadrilateral.isSquare());
            System.out.println("Get perimeter" + quadrilateral.getPerimeter());
            System.out.println("Get area" + quadrilateral.getFace());
        }
    }
}
