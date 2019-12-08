package org.pu.oop.model.impl;

import org.pu.oop.model.api.Figure;

public class Circle implements Figure {

    private double radius;
    private double perimeter;
    private static final double PI = Math.PI;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        if (isPerimeterSet()) {
            calculatePerimeter();
        }
        return this.perimeter;
    }

    private void calculatePerimeter() {
        this.perimeter = (double) 2 * PI * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setRadius(int diameter) {
        this.radius = (double) (diameter / 2 );
    }

    public double getCircleArea() {
        if (!isRadiusSet()) {
            throw new IllegalStateException("Circle radious is not set!");
        }
        return PI * (radius * radius);
    }

    private boolean isPerimeterSet() {
        //the default value of a double is 0.0
        return !(this.perimeter == 0.0);
    }

    private boolean isRadiusSet() {
        return !(this.radius == 0.0);
    }
}