package com.vijay.ifelsestatement;

import java.util.Scanner;

public class ElseIfElseStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the students marks :");
		int marks = sc.nextInt();
		if(marks>=85){
			System.out.println("Grade A+");
		}
		else if(marks>=70 && marks<85){
			System.out.println("Grade A");
		}
		else if(marks>=65 && marks<70){
			System.out.println("Grade B+");
		}
		else if(marks>=60 && marks<65){
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<60){
			System.out.println("Grade C");
		}
		else if(marks>=35 && marks<50){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail....");
		}
	}

}
