// Write a program that reads two lists of letters l1 and l2 and combines them:
// appends all letters c from l2 to the end of l1, but only when c does not
// appear in l1. Print the obtained combined list. All lists are given as
// sequence of letters separated by a single space, each at a separate line. Use
// ArrayList<Character> of chars to keep the input and output lists.

package java_collections_basics_homework;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//First Way
		try {

			ArrayList<Character> l1 = new ArrayList<>();
			ArrayList<Character> l2 = new ArrayList<>();
			// read chars from first list;
			// with "replaceAll" method remove all whitespace

			for (char chars : input.nextLine().replaceAll("\\s+", "")
					.toCharArray()) {
				l1.add(chars);
			}

			l2.addAll(l1);

			// add chars from second list to combined one,
			// but only those chars, which do not exist in first list
			for (char chars : input.nextLine().replaceAll("\\s+", "")
					.toCharArray()) {

				if (!l1.contains(chars)) {
					l2.add(chars);
				}
				// there's no need to save these chars
			}

			for (char chars : l2) {
				System.out.print(chars + " ");
			}
			System.out.println();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
		// SECOND WAY
		ArrayList<Character> firstList = new ArrayList<>();
		ArrayList<Character> secondList = new ArrayList<>();
		ArrayList<Character> resultList = new ArrayList<>();

		for (char chars : input.nextLine().toCharArray()) {
			firstList.add(chars);
		}
		for (char chars : input.nextLine().toCharArray()) {
			secondList.add(chars);
		}
		resultList.addAll(firstList);

		for (int i = 0; i < secondList.size(); i++) {

			if (firstList.contains(secondList.get(i))) {
				continue;
			} else {
				resultList.add(' ');
				resultList.add(secondList.get(i));
			}
		}

		for (int i = 0; i < resultList.size(); i++) {
			System.out.print(resultList.get(i));
		}
		
	}
}
