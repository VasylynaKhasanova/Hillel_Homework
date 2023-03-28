package com.homework7.quadrangle;

public class Rhombus extends Quadrangle {
    public Rhombus(double firstWidth, double secondWidth, double firstLength, double secondLength) {
        super(firstWidth, secondWidth, firstLength, secondLength);
    }

    public double square() {
        return 0.5 * getFirstDiagonal() * getSecondDiagonal();
    }
}
