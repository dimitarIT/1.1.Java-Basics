// Write a program that enters the sides of a rectangle (two
// integers a and b) and calculates and prints the
// rectangle's area.

package java_syntax_homework;

import java.util.Scanner;

public class _01_RectangleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int sideA = input.nextInt();
		int sideB = input.nextInt();

		System.out.format("The rentagle's area is: %d", (sideA * sideB));
	}

}
