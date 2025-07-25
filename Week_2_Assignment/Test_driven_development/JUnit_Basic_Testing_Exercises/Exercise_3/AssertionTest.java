package com.dn4.junitassignment;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AssertionTest {
	
	@Test
	void assertionTest() {
		assertEquals(5, 2+3);
		
		assertTrue(5>3);
		
		assertFalse(3>5);
		
		Object obj1 = null;
		assertNull(obj1);
		
		Object obj2 = new Object();
		assertNotNull(obj2);
		
	}
	
}
