package com.julien.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNestedBracket {

	public TestNestedBracket() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testEmptyString() {

		String S = "";
		NestedBracket nestedBracket = new NestedBracket();

		// test empty String
		assertEquals(1, nestedBracket.nesting(S));
	}
	@Test
	public void testStringWithCorrectNesting() {

		String S = "()()(()())()";
		NestedBracket nestedBracket = new NestedBracket();

		// test empty String
		assertEquals(1, nestedBracket.nesting(S));
	}
	@Test
	public void testStringWithoutCorrectNesting_1() {

		String S = "()((())";
		NestedBracket nestedBracket = new NestedBracket();

		// test empty String
		assertEquals(0, nestedBracket.nesting(S));
	}
	@Test
	public void testStringWithoutCorrectNesting_2() {

		String S = "()())(";
		NestedBracket nestedBracket = new NestedBracket();

		// test empty String
		assertEquals(0, nestedBracket.nesting(S));
	}

}
