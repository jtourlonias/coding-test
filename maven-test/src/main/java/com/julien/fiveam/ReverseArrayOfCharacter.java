package com.julien.fiveam;

/**
 * Implementation of how to reverse an array without using a temporary array.
 * 
 * @author Julien Tourlonias
 * 
 */
public class ReverseArrayOfCharacter {

	/**
	 * Reverse the order of each characters in the array.
	 * 
	 * @param str
	 *            - the array of char.
	 */
	public void reverseCharacter(char[] str) {
		this.reverseCharacter(str, 0, str.length);
	}

	/**
	 * Reverse the order of the character between the start index and end index.
	 * 
	 * @param str
	 *            - the array of char.
	 * @param startIndex
	 *            - the beginning index inclusive.
	 * @param endIndex
	 *            - the ending index excluive.
	 */
	public void reverseCharacter(char[] str, int startIndex, int endIndex) {
		char c;
		for (int i = startIndex; i < (endIndex + startIndex) / 2; i++) {
			c = str[i];
			str[i] = str[endIndex + startIndex - 1 - i];
			str[endIndex + startIndex - 1 - i] = c;
		}
	}

	/**
	 * Reverse the order of each words in the array.
	 * 
	 * @param str
	 *            - the array of char.
	 */
	public void reverseWord(char[] str) {

		int startIndex = 0;
		int endIndex = 0;

		this.reverseCharacter(str);

		for (int i = 0; i < str.length; i++) {
			if ((str[i] == ' ' || i == str.length - 1)) {
				if (i == str.length - 1) {
					endIndex = str.length;
				} else {
					endIndex = i;
				}
				this.reverseCharacter(str, startIndex, endIndex);
				endIndex = i + 1;
				startIndex = i + 1;
			}
		}
	}
}
