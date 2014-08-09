// At the first line at the console you are given a piece of text. Extract all
// words from it and print them in alphabetical order. Consider each non-letter
// character as word separator. Take the repeating words only once. Ignore the
// character casing. Print the result words in a single line, separated by
// spaces.
package java_collections_basics_homework;

import java.util.Scanner;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		try {
			String[] words = in.nextLine().toLowerCase().split("\\W+");
			TreeSet<String> orederedWords = new TreeSet<>();

			for (int i = 0; i < words.length; i++) {
				orederedWords.add(words[i]);
			}
			
			//Print
			for (String word : orederedWords) {
				System.out.print(word + " ");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}


















