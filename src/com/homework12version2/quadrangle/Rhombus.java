package com.homework12version2.quadrangle;

public class Rhombus extends Quadrangle {
    public Rhombus(double firstWidth, double secondWidth, double firstLength, double secondLength, double firstDiagonal,
                   double secondDiagonal) {
        super(firstWidth, secondWidth, firstLength, secondLength, firstDiagonal, secondDiagonal);
    }

    @Override
    public double square() {
        return 0.5 * getFirstDiagonal() * getSecondDiagonal();
    }
}
