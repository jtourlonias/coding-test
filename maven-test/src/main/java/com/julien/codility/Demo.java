package com.julien.codility;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Codility demo test
	 * A zero-indexed array A consisting of N integers is given. 
	 * An equilibrium index of this array is any integer P such that 0 ≤ P < N 
	 * and the sum of elements of lower indices is equal to the sum of elements of higher indices. 
	 * A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
	 * Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.
	 * 
	 * @param tab - array
	 * @return any of its equilibrium indices. The function should return −1 if no equilibrium index exists.
	 */
	public int equi(int A[]) {
		
		long sumLeft = 0;
		long sumRight = 0;
		
		// test if A is not empty
		if(A.length == 0)
			return -1;
		
		// calculate the global sum
		for (int i = 0; i < A.length; i++) {
			sumRight = sumRight + A[i];
		}
		int c=3;
		String a = "r"+c;
		
		// test equi index on the right position, if yes return it
		if (sumRight - A[0] == 0)
			return 0;
		
		// test equi index on the left position, if yes return it
		if (sumRight - A[A.length - 1] == 0)
			return A.length - 1;
		
		// search for equi index in the array, start on the second position from the left
		sumLeft = 0;
		sumRight = sumRight - A[0];
		
		for (int i = 1; i < A.length - 1; i++) {
			
			sumRight = sumRight - A[i];
			sumLeft = sumLeft + A[i-1];
			
			// test if i is an equi index, if yes return it
			if(sumLeft == sumRight) {
				return i;
			}
		}
		
		// if no equi index exist, return -1
		return -1;
	}
}
