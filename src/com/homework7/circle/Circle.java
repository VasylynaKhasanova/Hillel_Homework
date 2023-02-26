package com.homework7.circle;

import com.homework7.Figure;

public class Circle extends Figure {
    private final double radius;

    @Override
    public double perimeter() {
        return 2 * 3.14 * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
