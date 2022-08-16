package com.cg.array;

import java.util.Scanner;

public class ArrayDemoUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		//array declaration
		int arr1[]=new int[size];
		System.out.println("Enter the values");
		//enter the element in the array
		for (int i=0;i<arr1.length;i++)
		{
			System.out.println("enter the "+i+" index");
			arr1[i]=sc.nextInt();
			
		}
		//to print the element of the array
		/*for (int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}*/
		//enhanced for loop
		for(int i:arr1)
		{
			System.out.println(i);
		}
		
		
	}

}
