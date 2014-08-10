// Write a program to calculate the difference between two dates in number of
// days. The dates are entered at two consecutive lines in format
// day-month-year. Days are in range [1…31]. Months are in range [1…12]. Years
// are in range [1900…2100].
package java_loops_methods_classes_homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _07_DaysBetween_TwoDates {

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);

		String firstInput = input.next();
		String secondInput = input.next();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date firstDate = dateFormat.parse(firstInput);
		Date secondDate = dateFormat.parse(secondInput);

		System.out.println((int) differenceBetweenDates(firstDate, secondDate));

	}

	public static double differenceBetweenDates(Date first, Date second) {
		double diff;
		diff = second.getTime() - first.getTime();
		return diff / (86400.0 * 1000.0);
	}

}
