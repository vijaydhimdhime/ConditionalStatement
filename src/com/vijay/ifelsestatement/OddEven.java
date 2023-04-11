package com.vijay.ifelsestatement;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the any number : ");
	int number = sc.nextInt();
	if(number%2 == 0)
		System.out.println("number"+" "+number+" "+"is even");
	else
		System.out.println("number"+" "+number+" "+"is odd");
		
}
}
