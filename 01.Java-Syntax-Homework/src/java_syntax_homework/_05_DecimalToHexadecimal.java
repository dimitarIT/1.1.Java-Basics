// Write a program that enters a positive integer number num and converts and
// prints it in hexadecimal form. You may use some built-in method from the
// standard Java libraries.

package java_syntax_homework;

import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int integerNum = input.nextInt();

		String numberHex = Integer.toHexString(integerNum).toUpperCase();

		System.out.println(numberHex);
	}

}
