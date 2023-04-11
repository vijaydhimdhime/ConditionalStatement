package com.vijay.ifelsestatement;

public class Test1 {
	public static void main(String[] args) {
//		int i=1;
//		while (i<=10) {
//			System.out.print(" "+i);
//			i++;
//			// n never changes.
//		}
		
//		int i=1;
//		do
//		{
//			System.out.print(" "+i);
//			i++;
//		}while(i<=10);
		int row, column;
		  System.out.println("Multiplication Table \n");
		  row = 1; // Initialization.
		  do {
		     column = 1;
		     do{
		       int x = row * column;
		       System.out.printf("%4d", + x);
		       column = column + 1;
		      }while(column <= 3);
		    System.out.println("\n");
		    row = row + 1;
		  } while(row <= 10);
	}

}