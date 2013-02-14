package com.julien.fiveam;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestReverseArrayOfCharacter {

	@Test
	public void testReverseCharacterEmptyArray() {
		String strTest = "";
		char[] array = strTest.toCharArray();
		char[] arrayReverse = new StringBuilder(strTest).reverse().toString()
				.toCharArray();

		ReverseArrayOfCharacter reverseStringArray = new ReverseArrayOfCharacter();
		reverseStringArray.reverseCharacter(array);

		assertArrayEquals(arrayReverse, array);
	}

	@Test
	public void testReverseCharacterCase1() {
		String strTest = "Elephants like cats";
		char[] array = strTest.toCharArray();
		char[] arrayReverse = new StringBuilder(strTest).reverse().toString()
				.toCharArray();

		ReverseArrayOfCharacter reverseStringArray = new ReverseArrayOfCharacter();
		reverseStringArray.reverseCharacter(array);

		assertArrayEquals(arrayReverse, array);
	}

	@Test
	public void testReverseCharacterCase2() {
		String strTest = "  Elephants   like cats ";
		char[] array = strTest.toCharArray();
		char[] arrayReverse = new StringBuilder(strTest).reverse().toString()
				.toCharArray();

		ReverseArrayOfCharacter reverseStringArray = new ReverseArrayOfCharacter();
		reverseStringArray.reverseCharacter(array);

		assertArrayEquals(arrayReverse, array);
	}

	@Test
	public void testReverseWordEmptyArray() {
		String strTest = "";
		char[] array = strTest.toCharArray();
		char[] arrayReverse = new StringBuilder(strTest).reverse().toString()
				.toCharArray();

		ReverseArrayOfCharacter reverseStringArray = new ReverseArrayOfCharacter();
		reverseStringArray.reverseWord(array);

		assertArrayEquals(arrayReverse, array);
	}

	@Test
	public void testReverseWordCase1() {
		String strTest = "Elephants like cats";
		String strReverse = "cats like Elephants";
		char[] array = strTest.toCharArray();
		char[] arrayReverse = strReverse.toCharArray();

		ReverseArrayOfCharacter reverseStringArray = new ReverseArrayOfCharacter();
		reverseStringArray.reverseWord(array);

		assertArrayEquals(arrayReverse, array);
	}

	@Test
	public void testReverseWordCase2() {
		String strTest = "  Elephants   like cats ";
		String strReverse = " cats like   Elephants  ";
		char[] array = strTest.toCharArray();
		char[] arrayReverse = strReverse.toCharArray();

		ReverseArrayOfCharacter reverseStringArray = new ReverseArrayOfCharacter();
		reverseStringArray.reverseWord(array);

		assertArrayEquals(arrayReverse, array);
	}
}
