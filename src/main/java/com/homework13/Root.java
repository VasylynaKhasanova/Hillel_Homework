package com.homework13;

public class Root {

    private double x1;
    private double x2;
    private final int numberOfRoots;

    public Root() {
        numberOfRoots = 0;
    }

    public Root(double x) {
        this.x1 = x;
        numberOfRoots = 1;
    }

    public Root(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        numberOfRoots = 2;
    }

    public double getRoot1() {
        return x1;
    }

    public double getRoot2() {
        return x2;
    }

    public int getNumberOfRoots() {
        return numberOfRoots;
    }
}

