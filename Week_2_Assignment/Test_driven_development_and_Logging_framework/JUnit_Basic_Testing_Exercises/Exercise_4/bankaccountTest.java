package com.dn4.junitassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class bankaccountTest {

	bankaccount acc;
	
	@BeforeEach
	void setUp() {
		System.out.println("setting up for test");
		acc = new bankaccount(1000);
	}
	
	@BeforeEach
	void tearDown() {
		System.out.println("Tearing down for test");
		acc = null;
	}
	
	@Test
	void testdeposit() {
		acc.deposit(100);
		
		assertEquals(1100,acc.getbalance());
	}
	
	@Test
	void testwithdraw() {
		acc.withdraw(100);
		
		assertEquals(1000,acc.getbalance());
	}
	
}
