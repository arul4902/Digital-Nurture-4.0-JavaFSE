package com.example.junitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();

        assertEquals(8, calculator.add(5, 3));
    }
}