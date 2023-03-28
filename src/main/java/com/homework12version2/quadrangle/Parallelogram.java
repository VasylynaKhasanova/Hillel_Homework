package com.homework12version2.quadrangle;

public class Parallelogram extends Quadrangle {
    double angleBetweenDiagonals;
    public Parallelogram(double firstWidth, double secondWidth, double firstLength, double secondLength, double firstDiagonal,
                         double secondDiagonal, double angleBetweenDiagonals) {
        super(firstWidth, secondWidth, firstLength, secondLength, firstDiagonal, secondDiagonal);
      this.angleBetweenDiagonals = angleBetweenDiagonals;
    }

    @Override
    public double square() {
        return 0.5 * getFirstDiagonal() * getSecondDiagonal() * Math.sin(this.angleBetweenDiagonals);
    }

}
