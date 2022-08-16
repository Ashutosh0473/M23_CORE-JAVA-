package com.cg.array;

import java.util.Arrays;

public class UsingArray {
	static void display(int...a)
	{
		//Arrays.sort defines Arrays is a class and sort is amethod which 
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		display(15,6,68,9,56,71);
		
	}

}
