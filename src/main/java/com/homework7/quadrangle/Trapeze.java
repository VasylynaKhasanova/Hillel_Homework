package com.homework7.quadrangle;

public class Trapeze extends Quadrangle {
    private double h;

    public Trapeze(double firstWidth, double secondWidth, double firstLength, double secondLength) {
        super(firstWidth, secondWidth, firstLength, secondLength);
    }

    public double square() {
        return (getFirstLength() + getSecondLength()) / 2 * h;
    }

    public double getH() {
        return h;
    }
}
