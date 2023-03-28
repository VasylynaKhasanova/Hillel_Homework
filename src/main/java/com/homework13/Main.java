package com.homework13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquationCalculation calculation = new QuadraticEquationCalculation();

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

        calculation.calculateRoots(a, b, c);
    }
}
