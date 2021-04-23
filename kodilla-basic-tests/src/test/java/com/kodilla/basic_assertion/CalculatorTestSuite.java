package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int substractResult = calculator.substract(a, b);
        assertEquals(-3, substractResult);
    }
    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = 2;
        int c = 0;
        int resultA = calculator.squared(a);
        int resultB = calculator.squared(b);
        int resultC = calculator.squared(c);
        assertEquals(4, resultA);
        assertEquals(4, resultB);
        assertEquals(0, resultC);
    }
}
