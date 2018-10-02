package com.sidauruk.dedi.JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestBeforeAfterClass {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Running before test");
	}

	@Test
	public void test_add() {
		Addition app1 = new Addition();
		assertEquals(10, app1.add(5, 5)); // Success
		// assertEquals(15, app1.add(5, 5)); // Failure
		assertNotEquals(100, app1.add(20, 60)); // Success
		System.out.println("Running addition test");
	}

	@Test
	public void test_add_positive_numbers() {
		Addition app1 = new Addition();
		assertEquals(10, app1.add(5, 5)); // Success
		assertEquals(50, app1.add(45, 5)); // Success
		assertNotEquals(500, app1.add(250, 249)); // Success
		System.out.println("Running test_add_positive_numbers test");
	}

	@Test
	public void test_add_negative_numbers() {
		Addition app1 = new Addition();
		assertEquals(-10, app1.add(-5, -5)); // Success
		assertEquals(-50, app1.add(-45, -5)); // Success
		assertNotEquals(-500, app1.add(250, -39)); // Success
		System.out.println("Running test_add_negative_numbers test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Running after test");
	}
	
// 	Output
//	Running before test
//	Running addition test
//	Running test_add_positive_numbers test
//	Running test_add_negative_numbers test
//	Running after test

}
