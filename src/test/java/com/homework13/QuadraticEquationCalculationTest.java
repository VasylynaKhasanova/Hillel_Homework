package com.homework13;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QuadraticEquationCalculationTest {
    @Test
    public void testTwoRootsCalculation() {
        QuadraticEquationCalculation calculator = new QuadraticEquationCalculation();
        Root result = calculator.calculateRoots(20, 40, 0);
        Assertions.assertEquals(2, result.getNumberOfRoots());
        Assertions.assertEquals(-2.0, result.getRoot1());
        Assertions.assertEquals(0.0, result.getRoot2());
    }

    @Test
    public void testOneRootCalculation() {
        QuadraticEquationCalculation calculator = new QuadraticEquationCalculation();
        Root result = calculator.calculateRoots(20, 40, 20);
        Assertions.assertEquals(1, result.getNumberOfRoots());
        Assertions.assertEquals(-1.0, result.getRoot1());
    }

    @Test
    public void testNoRealRootsCalculation() {
        QuadraticEquationCalculation calculator = new QuadraticEquationCalculation();
        Root result = calculator.calculateRoots(1, 1, 1);
        Assertions.assertEquals(0, result.getNumberOfRoots());
    }

}