package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

import com.app.Calculator;

public class CalculatorTest {

    @Test
    public void testAddMethod() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
        assertEquals(10, calc.add(5,5));
    }
    @Test
    public void testSubtractMethod() {
        Calculator calc = new Calculator();

        assertEquals(3, calc.subtract(6,3));
        assertEquals(7, calc.subtract(10, 3) );
    }

    @Test
    public void testDivideByZeroThrowsException() {
        Calculator calc = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
    
}
