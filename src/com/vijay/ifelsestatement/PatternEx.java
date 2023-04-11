package com.vijay.ifelsestatement;

public class PatternEx {
	public static void main(String[] args) 
	{
	System.out.println("Displaying right triangle of *: ");	
	// Outer for loop.
	  for(int i = 1; i <= 5; i++)
	  {
	 // Inner for loop.
		for(int j = 1; j <= i; j++){
	     System.out.print(j+ " ");
	    }
	   System.out.println(" ");
	  }
	 }
	}