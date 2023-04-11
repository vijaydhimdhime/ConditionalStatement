package com.vijay.ifelsestatement;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of voter:");
		int age = sc.nextInt();
		if(age>=18){
			System.out.println("Voter is eligible for voting...");
		}
		System.out.println("Thank you!!!!");
	}

}
