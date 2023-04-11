package com.vijay.ifelsestatement;

public class Test {
	public static void main(String[] args) {
		int x = 20, y = 50, z = 10;
		if (x == 30) {
			// First inner if statement inside outer if statement.
			if (y < 50) {
				System.out.println("ABC");
			}
			// Second inner if-else statement inside outer if statement.
			if (z > 30)
				System.out.println("DEF");
			else
				System.out.println("PQR");
		} else {
			System.out.println("XYZ");
		}
	}
}