package com.tns.Recursion;

import java.util.Scanner;

public class Fibonacci_Series {

	
	int fib(int n)
			{
				if(n==0)
					return 0;
				else if(n==1)
					return 1;
				else
					return fib(n-1)+fib(n-2);
			
			}
	public static void main(String[] args) {
		Fibonacci_Series sd=new Fibonacci_Series();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the no");
		int x=s.nextInt();
		System.out.println(sd.fib(x));

	}

}
