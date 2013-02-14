package com.julien.codility;

import java.util.HashSet;
import java.util.Set;

public class NbUniqueValueInAnArray {

	public NbUniqueValueInAnArray() {
		// TODO Auto-generated constructor stub
	}

	public int test(int[] A) {

		Set<Integer> ndAbsDistinct = new HashSet<Integer>();

		if (A.length == 0)
			return -1;

		for (int i = 0; i < A.length; i++) {

			ndAbsDistinct.add(Math.abs(A[i]));
		}
		return ndAbsDistinct.size();
	}

}
