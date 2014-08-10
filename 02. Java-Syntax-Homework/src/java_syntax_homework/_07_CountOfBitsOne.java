// Write a program to calculate the count of bits 1 in the binary representation
// of given integer number n.

package java_syntax_homework;

// import java.util.Locale;
import java.util.Scanner;

public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int bits = Integer.bitCount(num);

		System.out.print(bits);

		// int i = 255;
		// System.out.println("Number = " + i);
		//
		// /* returns the string representation of the unsigned integer value
		// represented by the argument in binary (base 2) */
		// System.out.println("Binary = " + Integer.toBinaryString(i));
		//
		// // returns the number of one-bits
		// System.out.println("Number of one bits = " + Integer.bitCount(i));
	}

}
