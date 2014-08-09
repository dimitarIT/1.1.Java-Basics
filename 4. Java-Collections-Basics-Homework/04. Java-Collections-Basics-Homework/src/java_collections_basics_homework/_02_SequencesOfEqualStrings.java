// Write a program that enters an array of strings and finds in it all sequences
// of equal elements. The input strings are given as a single line, separated by
// a space.

package java_collections_basics_homework;

import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		String[] arrayString = input.split(" ");

		System.out.print(arrayString[0]);

		for (int i = 1; i < arrayString.length; i++) {
			if (arrayString[i].equals(arrayString[i - 1])) {
				System.out.print(" " + arrayString[i]);
			} else {
				System.out.println();
				System.out.print(arrayString[i]);
			}
		}
	}

}
