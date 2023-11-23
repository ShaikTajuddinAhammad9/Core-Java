package com.marolix;

public class PatternsExamples_1 {

	public static void main(String[] args) {
		// patterns by using for loop
		int rows = 3; // Number of rows in the pattern
		int cols = 4; // Number of columns in the pattern
		int count = 1; // Initial value for the pattern

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		// patterns by using two-dimensional array

		int rows1 = 3; // Number of rows in the pattern
		int cols1 = 4; // Number of columns in the pattern
		int[][] pattern = new int[rows1][cols1]; // Create a 2D array to store the pattern
		int count1 = 1; // Initial value for the pattern

		// Generate the pattern and store it in the 2D array
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols1; j++) {
				// count1 to keep track of the values in the pattern, starting from 1
				pattern[i][j] = count1;
				count1++;
				System.out.print(pattern[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		// patterns by using two-dimensional array
		int[][] pattern1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		for (int i = 0; i < pattern1.length; i++) {
			for (int j = 0; j < pattern1[i].length; j++) {
				System.out.print(pattern1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}

}
 