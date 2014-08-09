// Write a program to count the number of words in given sentence. Use any
// non-letter character as word separator.

package java_collections_basics_homework;

import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] words = input.split("\\W+");
		System.out.println(words.length);
	}

}
