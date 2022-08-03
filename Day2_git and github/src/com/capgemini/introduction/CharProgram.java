package com.capgemini.introduction;

import java.util.Scanner;

class CharProgram {

	public static void main(String[] args) {
		//compile-Time input
		//char x='a';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valur of x :");
		
		//run time Input
		char x=sc.next().charAt(2);
		System.out.println("the character is :"+x);
	}

}
