// Write a program to generate n random hands of 5 different cards form a
// standard suit of 52 cards.

package java_loops_methods_classes_homework;

import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOf5Cards {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] suit = { "♣", "♦", "♥", "♠" };

		Random heands = new Random();
		int randumNum = 0;

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < 5; j++) {
				randumNum = heands.nextInt((12 - 0) + 1) + 0;
				System.out.print(cards[randumNum]);
				randumNum = heands.nextInt((3 - 0) + 1) + 0;
				System.out.print(suit[randumNum] + " ");
			}
			System.out.println();
		}

	}

}
