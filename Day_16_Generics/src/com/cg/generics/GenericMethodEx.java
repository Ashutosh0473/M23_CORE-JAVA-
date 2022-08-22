package com.cg.generics;

public class GenericMethodEx {
	//when we use generic method we can pass any type of agru in the method
	public static <E>void printArray(E[]elem)
	{
		for (E itr:elem)
		{
			System.out.println(itr.getClass().getName());//to check the className
			System.out.println(itr);
		}
	}
	public static void main(String[] args) {
		Integer[] arr1= {10,20,40};
		Character [] arr2={'x','f','s'};
		System.out.println("printing array for integer");
		printArray(arr1);
		System.out.println("printing array for character");
		printArray(arr2);
		}

	}


