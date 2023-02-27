package com.homework7.quadrangle;

import com.homework7.Figure;

public abstract class Quadrangle extends Figure {
    private final double firstWidth;
    private final double secondWidth;
    private final double firstLength;
    private final double secondLength;
    private double firstDiagonal;
    private double secondDiagonal;

    public Quadrangle(double firstWidth, double secondWidth, double firstLength, double secondLength) {
        this.firstWidth = firstWidth;
        this.secondWidth = secondWidth;
        this.firstLength = firstLength;
        this.secondLength = secondLength;
    }

    public Quadrangle(double firstWidth, double secondWidth, double firstLength, double secondLength, double firstDiagonal,
                      double secondDiagonal) {
        this.firstWidth = firstWidth;
        this.secondWidth = secondWidth;
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
    }

    @Override
    public double perimeter() {
        return this.getFirstWidth() + this.getSecondWidth() + this.getFirstLength() + this.getSecondLength();
    }

    public double getFirstWidth() {
        return firstWidth;
    }

    public double getSecondWidth() {
        return secondWidth;
    }

    public double getFirstLength() {
        return firstLength;
    }

    public double getSecondLength() {
        return secondLength;
    }

    public double getFirstDiagonal() {
        return firstDiagonal;
    }

    public void setFirstDiagonal(double firstDiagonal) {
        this.firstDiagonal = firstDiagonal;
    }

    public double getSecondDiagonal() {
        return secondDiagonal;
    }

    public void setSecondDiagonal(double secondDiagonal) {
        this.secondDiagonal = secondDiagonal;
    }

}
