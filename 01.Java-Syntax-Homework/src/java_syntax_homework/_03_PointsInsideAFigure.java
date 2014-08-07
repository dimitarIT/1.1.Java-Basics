// Write a program to check whether a point is inside or outside of the figure
// below. The point is given as a pair of floating-point numbers, separated by a
// space. Your program should print "Inside" or "Outside"

package java_syntax_homework;

import java.util.Scanner;

public class _03_PointsInsideAFigure {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x = input.nextDouble();
		double y = input.nextDouble();

		boolean firstReactangle, secondReactangle, thirdReactangle;

		firstReactangle = (x >= 12.5 && x <= 22.5) && (y >= 6 && y <= 8.5);

		secondReactangle = (x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5);

		thirdReactangle = ((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5));

		if (firstReactangle || secondReactangle || thirdReactangle) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");

		}
	}
}
