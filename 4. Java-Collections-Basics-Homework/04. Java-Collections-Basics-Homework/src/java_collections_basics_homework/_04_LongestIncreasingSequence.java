// Write a program to find all increasing sequences inside an array of integers.
// The integers are given in a single line, separated by a space. Print the
// sequences in the order of their appearance in the input array, each at a
// single line. Separate the sequence elements by a space. Find also the longest
// increasing sequence and print it at the last line. If several sequences have
// the same longest length, print the leftmost of them.

package java_collections_basics_homework;

import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] arrayStr = input.split(" ");
		
		int[] numbers = new int[arrayStr.length];
		int counter = 1;
		int maxCounter = 1;
		int positionOfInt = 0; // positionOfInt shows the position of largest integer in the longest increasing sequence

		// transform string array on int array
		for (int i = 0; i < arrayStr.length; i++) {
			numbers[i] = Integer.parseInt(arrayStr[i]);
		}

		// printig increasing sequence
		System.out.print(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			
			if (numbers[i] > numbers[i - 1]) {
				System.out.print(" " + numbers[i]);
				counter++;
			} else {
				counter = 1;
				System.out.println();
				System.out.print(numbers[i]);
			}
			
			if (maxCounter < counter) {
				maxCounter = counter;
				positionOfInt = i;
			}
		}

		// printing longest increasing sequence
		System.out.println();
		System.out.print("Longest: ");
		
		for (int i = 0; i < counter - 1; i++) {
			System.out.print(numbers[positionOfInt - counter + 1 + i] + " ");
		}
		System.out.print(numbers[positionOfInt]);
	}
}
