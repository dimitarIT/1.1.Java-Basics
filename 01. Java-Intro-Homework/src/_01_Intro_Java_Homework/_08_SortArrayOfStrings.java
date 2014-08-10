//Write a program that enters from the console number n and n strings, then sorts them alphabetically and prints them. Note: you might need to learn how to use loops and arrays in Java (search in Internet).
package _01_Intro_Java_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class _08_SortArrayOfStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		String[] words = new String[number];

		for (int i = 0; i < number; i++) {
			words[i] = input.next();
		}
		input.close();

		Arrays.sort(words);

		for (int i = 0; i < number; i++) {
			System.out.println(words[i]);
		}
	}
}
