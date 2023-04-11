package com.vijay.ifelsestatement;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter any two numbers :");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Enter  your choice : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("sum = "+(a+b));			
			break;
		case 2:
			System.out.println("substraction = "+(a-b));
			break;
		case 3:
			System.out.println("Multi = "+(a*b));
			break;
		case 4:
			System.out.println("Division = "+(a/b));
			break;

		default:
			System.out.println("Invalid choice!!!");
		}
		System.out.println("out of switch block!!!");
	}

}
