// Write a program to read a text file "Input.txt" holding a sequence of integer
// numbers, each at a separate line. Print the sum of the numbers at the
// console. Ensure you close correctly the file in case of exception or in case
// of normal execution. In case of exception (e.g. the file is missing), print
// "Error" as a result.

package java_loops_methods_classes_homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _08_SumNumbersFromATextFile {

	public static void main(String[] args) throws IOException {

		try {
			BufferedReader input = new BufferedReader(new FileReader("Input"));
			String line;
			int result = 0;
			while ((line = input.readLine()) != null) {
				result += Integer.parseInt(line);
			}
			System.out.println(result);
		} catch (java.io.FileNotFoundException ex) {
			System.out.println("Error");
		}
	}

}
