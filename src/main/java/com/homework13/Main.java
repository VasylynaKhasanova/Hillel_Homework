package com.homework13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter coefficients of the quadratic equation:");

        System.out.println("a = ");
        Scanner scanA = new Scanner(System.in);
        double a = scanA.nextDouble();
        while (a == 0) {
            System.out.println("Coefficient a cannot be zero, please enter another value:");
            a = scanA.nextDouble();
        }

        System.out.println("b = ");
        Scanner scanB = new Scanner(System.in);
        double b = scanB.nextDouble();

        System.out.println("c = ");
        Scanner scanC = new Scanner(System.in);
        double c = scanC.nextDouble();

        QuadraticEquationCalculation calculator = new QuadraticEquationCalculation();

        Root roots = calculator.calculateRoots(a, b, c);

        if (roots.getNumberOfRoots() == 0) {
            System.out.println("The equation hasn't real roots.");
        } else if (roots.getNumberOfRoots() == 1) {
            System.out.println("The equation has one root:");
            System.out.println("x = " + roots.getRoot1());
        } else if (roots.getNumberOfRoots() == 2) {
            System.out.println("The equation has two roots:");
            System.out.println("x1 = " + roots.getRoot1());
            System.out.println("x2 = " + roots.getRoot2());
        }

    }
}
