package com.homework7.quadrangle;

public class Square extends Quadrangle {
    public Square(double firstWidth, double secondWidth, double firstLength, double secondLength) {
        super(firstWidth, secondWidth, firstLength, secondLength);
    }

    public double square() {
        return Math.pow(getFirstLength(), 2);
    }
}
