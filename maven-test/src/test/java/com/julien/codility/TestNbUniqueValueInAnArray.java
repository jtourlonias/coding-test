package com.julien.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestNbUniqueValueInAnArray {

	public TestNbUniqueValueInAnArray() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testEmptyArray() {

		int tab[] = {};
		NbUniqueValueInAnArray nbUniqueValueInAnArray = new NbUniqueValueInAnArray();

		// test empty Array
		assertEquals(-1, nbUniqueValueInAnArray.test(tab));
	}

	@Test
	public void testArrayWithoutDuplicateValue() {

		int tab[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		NbUniqueValueInAnArray nbUniqueValueInAnArray = new NbUniqueValueInAnArray();

		// test Array without duplicate value 
		assertEquals(10, nbUniqueValueInAnArray.test(tab));
	}

	@Test
	public void testArrayWithDuplicateValue() {

		int tab[] = { 0, 1, 2, 2, 4, 5, 6, 6, 2, 3, 0 };
		NbUniqueValueInAnArray nbUniqueValueInAnArray = new NbUniqueValueInAnArray();

		// test Array with duplicate value
		assertEquals(7, nbUniqueValueInAnArray.test(tab));
	}
}
