package com.homework12.circle;

import com.homework12.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * getRadius();
    }

    @Override
    public double square() {
        return 3.14 * Math.pow(getRadius(), 2);
    }

    public double getRadius() {
        return radius;
    }
}
