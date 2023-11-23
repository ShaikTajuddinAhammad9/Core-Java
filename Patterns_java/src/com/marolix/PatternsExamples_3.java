package com.marolix;

public class PatternsExamples_3 {

	public static void main(String[] args) {
		
		int rows = 3; // Number of rows in the pattern
		int count1 = 1; // Initial value for the pattern

		for (int i = 1; i <= rows; i++) {
			// Print spaces for formatting
			for (int j = rows; j >= i; j--) {
				System.out.print("  ");
			}

			// Print numbers in the pattern
			for (int k = 1; k <= i; k++) {
				System.out.print(count1 + "   ");
				count1++;

			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		// patterns by using array

		int row = 3; // Number of rows in the pattern
		int count = 1; // Initial value for the pattern

		int[][] pattern = new int[row][row]; // Create a 2D array to store the pattern

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				pattern[i][j] = count; // Assign the current value of count to the corresponding element in the array
				count++;
			}
		}

		// Print the pattern
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - i - 1; j++) {
				System.out.print("  "); // Print two spaces for formatting
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(pattern[i][j]);
				if (j != i) {
					System.out.print("   "); // Print three spaces between numbers
				}
			}
			System.out.println();
		}
		

		
	}
}
//       for (int i = 1; i <= rows; i++) {
//           Print spaces for formatting
//			for (int j = 1; j <= rows - i; j++) {
//				System.out.print("  ");
//			}
//
//			// Print numbers in the pattern
//			for (int j = 1; j <= i; j++) {
//				System.out.print(count1 + "   ");
//				count1++;
//			System.out.println();
//		}

