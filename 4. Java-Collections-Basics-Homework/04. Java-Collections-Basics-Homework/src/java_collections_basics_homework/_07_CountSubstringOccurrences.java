// Write a program to find how many times given string appears in given text as
// substring. The text is given at the first input line. The search string is
// given at the second input line. The output is an integer number. Please
// ignore the character casing.

package java_collections_basics_homework;

import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String text = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();
		int coumter = 0;
		
		for (int i = 0; i <= text.length() - word.length(); i++) {
			
			if (text.substring(i, word.length() + i).contains(word)) {
				coumter++;
			}
		}
		
		System.out.println(coumter);
	}

}
