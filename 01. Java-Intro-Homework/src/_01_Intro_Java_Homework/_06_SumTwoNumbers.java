//Write a program _06_SumTwoNumbers.java that enters two integers from the console, calculates and prints their sum. Search in Internet to learn how to read numbers from the console. Examples:
package _01_Intro_Java_Homework;

import java.util.Scanner;

public class _06_SumTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		input.close();

		int result = firstNum + secondNum;

		System.out.println(result);
	}
}