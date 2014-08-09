// Write a program to find the most frequent word in a text and print it, as
// well as how many times it appears in format "word -> count". Consider any
// non-letter character as a word separator. Ignore the character casing. If
// several words have the same maximal frequency, print all of them in
// alphabetical order.

package java_collections_basics_homework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		try {
			String[] text = in.nextLine().toLowerCase().split("\\W+");

			TreeMap<String, Integer> wordOccurrences = new TreeMap<>();

			int maxCountWord = 0;

			for (String word : text) {
				
				Integer wordCount = wordOccurrences.get(word);

				if (wordCount == null) {
					wordCount = 0;
				}

				if (wordCount + 1 > maxCountWord){ // ASK SOMEBODY
					maxCountWord = wordCount + 1;
				}
				wordOccurrences.put(word, wordCount + 1);

			}

			for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
				if (entry.getValue() == maxCountWord) {
					System.out.println(entry.getKey() + " -> " + maxCountWord
							+ " times");
				}

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
