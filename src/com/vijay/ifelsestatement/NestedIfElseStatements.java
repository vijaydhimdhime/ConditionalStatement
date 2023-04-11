package com.vijay.ifelsestatement;

import java.util.Scanner;

public class NestedIfElseStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b)//if largest if(a>b)
		{
			if(a>c)//if(a>c)
			{
				System.out.println(a +"is Bigger than other");//sop(a)
			}
			else
			{
				System.out.println(b+" is middle others");//sop(c)
			}
			
		}
		else
		{
			if(a<b)//if(b>c)
			{
				System.err.println(a+" is smaller than other numbers");//sop(b)
			}
			else
			{
				System.out.println(b+" is middle others");//sop(c)
			}
			
		}
	}

}
