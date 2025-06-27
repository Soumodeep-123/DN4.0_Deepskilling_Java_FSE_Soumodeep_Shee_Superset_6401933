package com.dn4.junitassignment;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class BasicMathTest {
	
	BasicMath math = new BasicMath();
	
	@Test
    void testAdd() {
        assertEquals(7, math.add(3, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(1, math.subtract(5, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(20, math.multiply(5, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2, math.divide(10, 5));
    }

}
