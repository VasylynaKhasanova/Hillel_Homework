package com.homework12.quadrangle;

public class Trapeze extends Quadrangle {
    private double h;

    public Trapeze(double firstWidth, double secondWidth, double firstLength, double secondLength, double h) {
        super(firstWidth, secondWidth, firstLength, secondLength);
        this.h = h;
    }

    @Override
    public double square() {
        return (getFirstLength() + getSecondLength()) / 2 * h;
    }

    public double getH() {
        return h;
    }
}
