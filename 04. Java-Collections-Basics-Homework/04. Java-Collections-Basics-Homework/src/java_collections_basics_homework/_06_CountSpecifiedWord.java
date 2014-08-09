// Write a program to find how many times a word appears in given text. The text
// is given at the first input line. The target word is given at the second
// input line. The output is an integer number. Please ignore the character
// casing. Consider that any non-letter character is a word separator.
package java_collections_basics_homework;

import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String text = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();

		String[] arrayStr = text.split("\\W+");
		int counter = 0;

		for (int i = 0; i < arrayStr.length; i++) {
			if (word.equals(arrayStr[i])) {
				counter++;
			}
		}

		System.out.println(counter);
	}

}
