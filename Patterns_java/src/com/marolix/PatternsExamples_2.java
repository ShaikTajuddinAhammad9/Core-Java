package com.marolix;

public class PatternsExamples_2 {

	public static void main(String[] args) {
		// without specify the number of rows in the pattern.
		int count2 = 1; // Initial value for the pattern
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count2 + " ");
				count2++;
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		// specify the number of rows in the pattern.
		int rows = 3; // Number of rows in the pattern
		int count = 1; // Initial value for the pattern

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		// patterns by using array

		int rows1 = 3; // Number of rows in the pattern
		int[] pattern = new int[rows1]; // Create an array to store each row of the pattern
		int count1 = 1; // Initial value for the pattern

		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j <= i; j++) {
				pattern[j] = count1; // Assign the current value of count to the current row
				count1++; // Increment the count value
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(pattern[j] + " "); // Print the numbers in the current row
			}
			System.out.println();
		}
		System.out.println("--------------------------");

	}
}
