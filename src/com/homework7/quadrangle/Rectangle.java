package com.homework7.quadrangle;

public class Rectangle extends Quadrangle {
    public Rectangle(double firstWidth, double secondWidth, double firstLength, double secondLength) {
        super(firstWidth, secondWidth, firstLength, secondLength);
    }

    public double square() {
        return this.getFirstLength() * this.getFirstWidth();
    }

}
