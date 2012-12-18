package com.julien.codility;

public class NestedBracket {

	public NestedBracket() {
		// TODO Auto-generated constructor stub
	}

	public int nesting(String S) {

		int testBracket = 0;

		for (int i = 0; i < S.length(); i++) {

			if (S.charAt(i) == '(') {
				testBracket = testBracket + 1;
			} else {
				testBracket = testBracket - 1;
			}

			if (testBracket < 0)
				return 0;
		}

		if (testBracket == 0)
			return 1;
		else
			return 0;

	}

}
