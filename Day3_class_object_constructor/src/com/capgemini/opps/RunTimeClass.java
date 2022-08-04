package com.capgemini.opps;

import java.util.Scanner;

class bike
{
	int a;
	void disp()
	{
		System.out.println("welcome ");
	}
	
}
public class RunTimeClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		bike b=new bike();
		b.disp();
		 System.out.println(a);
		 sc.close();
		 
		
		
		

	}

}
