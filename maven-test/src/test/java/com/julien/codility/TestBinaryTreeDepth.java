package com.julien.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinaryTreeDepth {

	public TestBinaryTreeDepth() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testBinaryTreeDepth() {

		Tree t = new Tree();
		Tree t11 = new Tree();
		Tree t12 = new Tree();
		Tree t111 = new Tree();
		Tree t112 = new Tree();
		Tree t121 = new Tree();
		Tree t122 = new Tree();
		Tree t1121 = new Tree();

		t.l = t11;
		t.r = t12;
		t.x = 1;

		t11.l = t111;
		t11.r = t112;
		t11.x = 11;

		t12.l = t121;
		t12.r = t122;
		t12.x = 12;

		t112.l = t1121;
		t112.x = 112;

		t111.x = 111;
		t121.x = 121;
		t122.x = 122;

		t1121.x = 1121;

		BinaryTreeDepth binaryTreeDepth = new BinaryTreeDepth();

		assertEquals(3, binaryTreeDepth.treeHeight(t));

	}
}
