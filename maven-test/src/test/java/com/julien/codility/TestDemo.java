package com.julien.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

	public TestDemo() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testEmptyArray() {

		int tab[] = {};
		Demo demo = new Demo();

		// test empty Array
		assertEquals(-1, demo.equi(tab));
	}

	@Test
	public void testArrayWithoutIndexEqui() {

		int tab[] = { -1, 0, 1 };
		Demo demo = new Demo();

		// test Array without index equi
		assertEquals(-1, demo.equi(tab));
	}

	@Test
	public void testArrayWithIndexEquiBeforeLastPosition() {

		int tab[] = { 1, 1, 1, 1, 1, 1, 5 };
		Demo demo = new Demo();

		// test Array with index equi before the last position
		assertEquals(5, demo.equi(tab));
	}

	@Test
	public void testArrayWithIndexEquiSecondPosition() {

		int tab[] = { 5, 1, 1, 1, 1, 1, 1 };
		Demo demo = new Demo();

		// test Array with index equi on second position
		assertEquals(1, demo.equi(tab));
	}

	@Test
	public void testArrayWithIndexEquiFirstPosition() {

		int tab[] = { 0, 1, 5, 2, -4, 3, -7 };
		Demo demo = new Demo();

		// test Array with index equi on first position
		assertEquals(0, demo.equi(tab));
	}

	@Test
	public void testArrayWithIndexEquiLastPosition() {

		int tab[] = { -7, 1, 5, 2, -4, 3, 0 };
		Demo demo = new Demo();

		// test Array with index equi on last position
		assertEquals(6, demo.equi(tab));
	}

	@Test
	public void testArrayWithIndexEquiPositionThree() {

		int tab[] = { -7, 1, 5, 8, -4, 3, 0 };
		Demo demo = new Demo();

		// test Array with index equi on position three
		assertEquals(3, demo.equi(tab));
	}
}
