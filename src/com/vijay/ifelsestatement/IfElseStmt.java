package com.vijay.ifelsestatement;

import java.util.Scanner;

public class IfElseStmt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of sub1 :");
		int sub1 = sc.nextInt();
		System.out.println("Enter the marks of sub2 :");
		int sub2 = sc.nextInt();
		System.out.println("Enter the marks of sub3 :");
		int sub3 = sc.nextInt();
		System.out.println("Enter the marks of sub4 :");
		int sub4 = sc.nextInt();
		System.out.println("Enter the marks of sub5 :");
		int sub5 = sc.nextInt();
		int totalMarks = sub1+sub2+sub3+sub4+sub5;
		System.out.println("totalMarks : "+totalMarks);
		float percentage = totalMarks/5;
		System.out.println("percentage : "+percentage);
		
	}

	
}
