package com.tns.Recursion;

import java.util.Scanner;

public class Factorial1 
{
	static int fact(int n)
	{
		//function definition
		if(n==1)
	
			return 1;
		
	else 
		return n*fact(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fact(n));//fun  call
		s.close();
	}
	}