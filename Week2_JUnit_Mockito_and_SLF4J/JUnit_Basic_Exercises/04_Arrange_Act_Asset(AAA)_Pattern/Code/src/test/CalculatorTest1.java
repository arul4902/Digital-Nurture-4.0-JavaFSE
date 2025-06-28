package com.example.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest1 {

    private Calculator1 calculator;

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting Up Calculator");
        calculator = new Calculator1();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down Calculator");
        calculator = null;
    }

    @Test
    public void add() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void sub() {
        assertEquals(-1, calculator.sub(1, 2));
    }

   
}