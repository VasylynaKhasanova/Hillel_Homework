package com.homework13;

public class QuadraticEquationCalculation {

    public void calculateRoots(double a, double b, double c) {

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            System.out.println("The equation has two roots:");
            System.out.println(calculateTwoRoots(a, b, d));

        } else if (d == 0) {
            System.out.println("The equation has one root:");
            double x = calculateOneRoot(a, b);
            System.out.println("x = " + x);

        } else if (d < 0) {
            System.out.println("The equation hasn't real roots.");
        }

    }

    public String calculateTwoRoots(double a, double b, double d) {
        double x1;
        double x2;

        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);

        return "x1 = " + x1 + " x2 = " + x2;
    }

    public double calculateOneRoot(double a, double b) {
        double x;

        x = -b / (2 * a);

        return x;
    }

}
