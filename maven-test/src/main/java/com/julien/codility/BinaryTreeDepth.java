package com.julien.codility;

public class BinaryTreeDepth {

	private int longuestPath = 0;

	public BinaryTreeDepth() {
		// TODO Auto-generated constructor stub
	}

	public int treeHeight(Tree T) {

		this.longuestPath = 0;

		// search end tree with recursive function
		readTree(T, 0);

		return this.longuestPath;
	}

	private void readTree(Tree T, int niveau) {

		if (this.longuestPath < niveau)
			this.longuestPath = niveau;

		if (T.l != null)
			readTree(T.l, niveau + 1);
		if (T.r != null)
			readTree(T.r, niveau + 1);
	}
}
