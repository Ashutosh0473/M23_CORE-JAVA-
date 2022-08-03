package com.capgemini.introduction;

import java.util.Scanner;

public class floatanddouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//compile time input 
		float f=4.55523f;
		double d=7.5556656;
		
		System.out.println("float example ="+f);
		System.out.println("Double example ="+d);
		
		//run time input
		System.out.println("enter numbers in point");
		float a=sc.nextFloat();
		System.out.println("float run time example ="+a);
		
	}

}
