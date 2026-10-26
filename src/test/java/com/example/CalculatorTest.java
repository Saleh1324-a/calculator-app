package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void testAddPositiveNumbers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testAddWithZero() {
        Calculator calc = new Calculator();
        assertEquals(7, calc.add(7, 0));
    }

    @Test
    void testAddNegativeNumbers() {
        Calculator calc = new Calculator();
        assertEquals(-8, calc.add(-3, -5));
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
