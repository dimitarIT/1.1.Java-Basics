// Write a program to generate and print all 3-letter words consisting of given
// set of characters. For example if we have the characters 'a' and 'b', all
// possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and
// "bbb". The input characters are given as string at the first line of the
// input. Input characters are unique (there are no repeating characters)

package java_loops_methods_classes_homework;

import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char[] latters = input.next().toCharArray();

		for (int i = 0; i < latters.length; i++) {
			for (int j = 0; j < latters.length; j++) {
				for (int k = 0; k < latters.length; k++) {
					System.out.printf("%s%s%s ", latters[i], latters[j],
							latters[k]);
				}
			}
		}
	}

}
