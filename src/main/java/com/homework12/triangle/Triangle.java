package com.homework12.triangle;

import com.homework12.Figure;

public abstract class Triangle extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double perimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }

    @Override
    public double square() {
        double pp = (this.firstSide + this.secondSide + this.thirdSide);
        return Math.sqrt(pp * (pp - this.firstSide) * (pp - this.secondSide) * (pp - this.thirdSide));
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

}
