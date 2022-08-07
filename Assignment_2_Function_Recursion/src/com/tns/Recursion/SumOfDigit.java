package com.tns.Recursion;

import java.util.Scanner;

public class SumOfDigit {
	
	 static int digit(int n)
	{
		if (n==0)
			return 0;
		else
			return(n%10+digit(n/10));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("sum of digit is "+digit(n));

	}

}
