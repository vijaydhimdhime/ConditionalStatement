package com.vijay.ifelsestatement;

import java.util.Scanner;

public class IfElseStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int number = sc.nextInt();
		if(number>=0){
			System.out.println("number "+number+" is +ve");
		}
		else
		{
			System.out.println("number "+number+" is -ve");
		}
	}

}
