package com.homework13;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class QuadraticEquationCalculationTest {

    @Test
    public void calculateTwoRootsTest() {
        String expected = "x1 = -2.76393202250021 x2 = -7.23606797749979";
        QuadraticEquationCalculation calculation = new QuadraticEquationCalculation();

        String actual = calculation.calculateTwoRoots(2, 20, 80);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateOneRootTest() {
        double expected = -2;
        QuadraticEquationCalculation calculation = new QuadraticEquationCalculation();

        double actual = calculation.calculateOneRoot(10, 40);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeDiscriminant() {
        String expectedOutput = "The equation hasn't real roots.";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        QuadraticEquationCalculation calculation = new QuadraticEquationCalculation();
        calculation.calculateRoots(1, 2, 3);

        Assertions.assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    public void testPositiveDiscriminant() {
        String expectedOutput = "The equation has two roots:\r\nx1 = -2.76393202250021 x2 = -7.23606797749979";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        QuadraticEquationCalculation calculation = new QuadraticEquationCalculation();
        calculation.calculateRoots(2, 20, 40);

        Assertions.assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    public void testZeroDiscriminant() {
        String expectedOutput = "The equation has one root:\r\nx = -5.0";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        QuadraticEquationCalculation calculation = new QuadraticEquationCalculation();
        calculation.calculateRoots(1, 10, 25);

        Assertions.assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }
}
