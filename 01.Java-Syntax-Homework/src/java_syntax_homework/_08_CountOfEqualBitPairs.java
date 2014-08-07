// Write a program to count how many sequences of two equal bits ("00" or "11")
// can be found in the binary representation of given integer number n (with
// overlapping).

package java_syntax_homework;

import java.math.BigInteger;
import java.util.Scanner;

public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		BigInteger bigNum = new BigInteger(String.valueOf(number));

		// first way
		int counter = 0;

		for (int i = 0; i < bigNum.bitLength(); i++) {

			if (bigNum.testBit(i) == bigNum.testBit(i + 1)) {
				counter++;
			}
		}
		System.out.println(counter);

		// second way
		counter = 0;

		char[] numToBin = Integer.toBinaryString(number).toCharArray();

		for (int i = 1; i < numToBin.length ; i++) {

			if (numToBin[i] == numToBin[i - 1]) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
