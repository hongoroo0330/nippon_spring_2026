package com.app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
            void testFactorial() {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(1, MathUtils.factorial(1));
        assertEquals(6, MathUtils.factorial(3));
        assertEquals(120, MathUtils.factorial(5));
    }
    @Test
    void testIsPrime() {
        assertFalse(MathUtils.isPrime(0));
        assertFalse(MathUtils.isPrime(1));
        assertTrue(MathUtils.isPrime(2));
        assertTrue(MathUtils.isPrime(7));
        assertFalse(MathUtils.isPrime(9));
        assertTrue(MathUtils.isPrime(13));
    }

    @Test
    void testGcd() {
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(1, MathUtils.gcd(7, 13));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(4, MathUtils.gcd(8, 4));
    }

    @Test
    void testAverage() {
        assertEquals(3.0, MathUtils.average(new int[]{1, 2, 3, 4, 5}), 0.001);
        assertEquals(5.0, MathUtils.average(new int[]{5}), 0.001);
    }

    @Test
    void testAverageEmptyArray() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.average(new int[]{}));
    }
}




