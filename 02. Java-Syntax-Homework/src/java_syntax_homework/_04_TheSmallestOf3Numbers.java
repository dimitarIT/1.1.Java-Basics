// Write a program that finds the smallest of three numbers.

package java_syntax_homework;

import java.util.Scanner;

public class _04_TheSmallestOf3Numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();

		float resultAandB = Math.min(a, b);
		float resultAandBandC = Math.min(resultAandB, c);

		System.out.print(resultAandBandC);
	}

}
