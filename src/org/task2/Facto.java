package org.task2;
//QUESTION 6:
//-----------
//Description: Write a program to find the factorial of a number.

//Example:
//--------
//Input  = 5
//Output = 120


public class Facto {
	public static void main(String[] args) {
		int  fact=1,i;
		for(i=1;i<=5;i++) {
			fact=fact  *i;
			
		}
		System.out.println(fact);
		
	}

}
