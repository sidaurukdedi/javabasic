package com.sidauruk.dedi.JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Run All test by selecting class
@RunWith(Suite.class)
@Suite.SuiteClasses({
		// Provide all the best that you wanted to run
		JUnitTest.class, JUnitTestBeforeAfterClass.class }) // select class

public class JUnitTestSuite {

}

//Output
//Running before test
//Running addition test
//Running after test
//Running before test
//Running test_add_positive_numbers test
//Running after test
//Running before test
//Running test_add_negative_numbers test
//Running after test
//Running before test
//Running addition test
//Running test_add_positive_numbers test
//Running test_add_negative_numbers test
//Running after test
