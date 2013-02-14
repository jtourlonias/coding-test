package com.julien.codility;

/**
 * Implementation of how to find the depth of a binary tree.
 * @author Julien Tourlonias
 */
public class BinaryTreeDepth {

	private int depthOfTheTree = 0;

	public BinaryTreeDepth() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Determine the depth of the tree T
	 * @param T
	 *            - Tree to analyze
	 * @return int - the tree's depth
	 */
	public int treeDepth(Tree T) {

		this.depthOfTheTree = 0;

		this.readTree(T, 0);

		return this.depthOfTheTree;
	}

	/**
	 * Recursive search to find the depth of the binary tree,
	 * @param T
	 *            - Tree to analyze
	 * @param depth
	 *            - depth of the tree
	 */
	private void readTree(Tree T, int depth) {
		if (this.depthOfTheTree < depth) {
			this.depthOfTheTree = depth;
		}

		if (T.l != null) {
			this.readTree(T.l, depth + 1);
		}
		if (T.r != null) {
			this.readTree(T.r, depth + 1);
		}
	}
}
