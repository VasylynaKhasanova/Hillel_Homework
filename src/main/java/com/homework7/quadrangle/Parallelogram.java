package com.homework7.quadrangle;

public class Parallelogram extends Quadrangle {
    double angleBetweenDiagonals;

    public Parallelogram(double firstWidth, double secondWidth, double firstLength, double secondLength) {
        super(firstWidth, secondWidth, firstLength, secondLength);
    }

    public double square() {
        return 0.5 * getFirstDiagonal() * getSecondDiagonal() * Math.sin(this.angleBetweenDiagonals);
    }

}
