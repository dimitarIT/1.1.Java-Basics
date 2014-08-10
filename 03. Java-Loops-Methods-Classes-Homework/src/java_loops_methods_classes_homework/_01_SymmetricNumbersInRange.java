// Write a program to generate and print all symmetric numbers in given range
// [start…end]. A number is symmetric if its digits are symmetric toward its
// middle. For example, the numbers 101, 33, 989 and 5 are symmetric, but 102,
// 34 and 997 are not symmetric. Examples:

package java_loops_methods_classes_homework;

import java.util.Locale;
import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);

		int start = input.nextInt();
		int end = input.nextInt();

		for (int i = start; i <= end; i++) {
			if (checkNumbers(i) == true) {
				System.out.print(i);
			} else if (i != end) {
				System.out.print(" ");

			}
		}
	}

	public static boolean checkNumbers(int number) {
		if (Integer.toString(number).equals(
				new StringBuilder(Integer.toString(number)).reverse()
						.toString())) {
			return true;
		} else {
			return false;
		}

	}
}
