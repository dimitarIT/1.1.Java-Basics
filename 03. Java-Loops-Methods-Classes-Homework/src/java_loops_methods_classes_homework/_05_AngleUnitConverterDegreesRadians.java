// Write a method to convert from degrees to radians. Write a method to convert
// from radians to degrees. You are given a number n and n queries for
// conversion. Each conversion query will consist of a number + space + measure.
// Measures are "deg" and "rad". Convert all radians to degrees and all degrees
// to radians. Print the results as n lines, each holding a number + space +
// measure. Format all numbers with 6 digit after the decimal point.

package java_loops_methods_classes_homework;

import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverterDegreesRadians {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);

		double queries = input.nextDouble();
		String value = "";
		String measure = "";

		for (int i = 0; i <= queries; i++) {
			value = input.nextLine();
			value = value.replaceAll("\\s+", "");
			measure = value.replaceAll("\\d+", "");
			measure = measure.replace(".", "");
			value = value.replaceAll("[^0-9.,]+", "");

			if (measure.equals("deg")) {
				System.out.printf("%.6f rad%n",
						degreesToRadians(Double.parseDouble(value)));
			} else if (measure.equals("rad")) {
				System.out.printf("%.6f deg%n",
						radiansToDegrees(Double.parseDouble(value)));
			}
		}
	}

	public static double degreesToRadians(double degrees) {
		double value = degrees * 0.0174532925;
		return value;
	}

	public static double radiansToDegrees(double degrees) {
		double value = degrees / 0.0174532925;
		return value;
	}

}