// Write a program that enters an array of strings and finds in it the largest
// sequence of equal elements. If several sequences have the same longest
// length, print the leftmost of them. The input strings are given as a single
// line, separated by a space.

package java_collections_basics_homework;

import java.util.Scanner;

public class _03_Largest_SequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] elements = input.split(" ");

		int repeat = 1;
		int counter = 1;
		int positionOfWord = 0;

		for (int i = 1; i < elements.length; i++) {

			if (elements[i].equals(elements[i - 1])) {
				counter++;
			} else {

				counter = 1;
			}

			if (counter > repeat) {
				repeat = counter;
				positionOfWord = i;
			}

		}

		for (int i = 0; i < repeat - 1; i++) {
			System.out.print(elements[positionOfWord] + " ");
		}
		System.out.println(elements[positionOfWord]);
	}

}
