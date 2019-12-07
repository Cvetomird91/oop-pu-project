package org.pu.oop.model.impl;

import org.pu.oop.model.api.Figure;

public class Circle implements Figure {

    private int radius;
    private double perimeter;
    private static final double PI = Math.PI;

    public Circle() {
        this.radius = 0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        if (this.perimeter == 0.0) {
            calculatePerimeter();
        }
        return this.perimeter;
    }

    private void calculatePerimeter() {
        this.perimeter = (double) 2 * PI * this.radius;
    }

    public double getRadius() {
        return (double) this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}