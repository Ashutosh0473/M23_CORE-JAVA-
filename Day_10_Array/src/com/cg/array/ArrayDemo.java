package com.cg.array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		/*int arr[]=new int[3] {11,22,33};
		ddo not delcare the size at the end if you are initilizing the array
		*/

		int arr[]= new int[] {11,22,33};
		System.out.println("the array index value is : "+arr[1]);
		/* array index out of bound exception as index is 3 we accessing and last index is 2
		System.out.println("the array index value is : "+arr[3]);
		*/
		
	}

}
