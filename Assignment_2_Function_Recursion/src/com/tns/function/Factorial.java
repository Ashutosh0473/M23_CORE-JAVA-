package com.tns.function;

import java.util.Scanner;

public class Factorial 
{
	static int fact(int n)
	{
		//function definition
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fact(n));//fun  call
		s.close();
	}

}
