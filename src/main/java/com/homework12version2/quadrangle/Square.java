package com.homework12version2.quadrangle;

public class Square extends Quadrangle {
    public Square(double firstWidth, double secondWidth, double firstLength, double secondLength) {
        super(firstWidth, secondWidth, firstLength, secondLength);
    }

    @Override
    public double square() {
        return Math.pow(getFirstLength(), 2);
    }
}
