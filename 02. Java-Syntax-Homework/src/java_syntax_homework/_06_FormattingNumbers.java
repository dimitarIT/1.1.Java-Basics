// Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a
// floating-point b and a floating-point c and prints them in 4 virtual
// columns on the console. Each column should have a width of 10 characters. The
// number a should be printed in hexadecimal, left aligned; then the number a
// should be printed in binary form, padded with zeroes, then the number b
// should be printed with 2 digits after the decimal point, right aligned; the
// number c should be printed with 3 digits after the decimal point, left
// aligned. Examples:

package java_syntax_homework;

import java.util.Locale;
import java.util.Scanner;

public class _06_FormattingNumbers {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);

		int a =  input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();

		String intToHex = Integer.toHexString(a);
		String intToStr = Integer.toBinaryString(a);
		//String binary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

		System.out.printf("|%-10S|%010d|%10.2f|%-10.3f|", intToHex,
				Integer.parseInt(intToStr), b, c);
	}

}
