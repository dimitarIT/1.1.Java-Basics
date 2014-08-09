// We are given a sequence of N playing cards from a standard deck. The input
// consists of several cards (face + suit), separated by a space. Write a
// program to calculate and print at the console the frequency of each card face
// in format "card_face -> frequency". The frequency is calculated by the
// formula appearances / N and is expressed in percentages with exactly 2 digits
// after the decimal point. The card faces with their frequency should be
// printed in the order of the card face's first appearance in the input. The
// same card can appear multiple times in the input, but it's face should be
// listed only once in the output.

package java_collections_basics_homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequencies {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// FIRST WAY
		try {
			String[] cards = in.nextLine().split("[♥♣♦♠ ]+");
			int lenght = cards.length;

			// use linked hash map to preserve initial order of elements
			Map<String, Integer> cardOccurrences = new LinkedHashMap<>();

			for (String card : cards) {
				Integer count = cardOccurrences.get(card);

				if (count == null) {
					count = 0;
				}
				cardOccurrences.put(card, count + 1);
			}

			// print
			for (Map.Entry<String, Integer> entry : cardOccurrences.entrySet()) {
				System.out.printf("%s -> %.2f%%\n", entry.getKey(),
						(double) entry.getValue() * 100 / lenght);
				;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// SECOND WAY
		String[] cards = in.nextLine().split("[ ♥♣♦♠]+");

		Map<String, Integer> cardsMap = new LinkedHashMap<>();

		for (String card : cards) {
			Integer count = cardsMap.get(card);
			if (count == null) {
				count = 0;
			}
			cardsMap.put(card, count + 1);
		}

		for (Map.Entry<String, Integer> entry : cardsMap.entrySet()) {
			double percentage = (double) entry.getValue() * 100 / cards.length;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), percentage);
		}
	}

}