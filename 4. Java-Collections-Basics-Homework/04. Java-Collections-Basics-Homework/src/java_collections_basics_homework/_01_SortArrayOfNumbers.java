// Write a program to enter a number n and n integer numbers and sort and print
// them. Keep the numbers in array of integers: int[].

package java_collections_basics_homework;

import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = input.nextInt();
		}
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.print(nums[n - 1]);
		System.out.println(Arrays.toString(nums));
	}
}