package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(12,13,45,50,63);
		//filter 
		obj.stream().filter(i->i>25).forEach((i)->System.out.println(i+" "));
		System.out.println();
		
		System.out.println("the distinct veriable is: ");
		obj.stream().distinct().forEach((i)->System.out.println(i+" "));
		System.out.println("the limit is");
		obj.stream().limit(3).forEach((i)->System.out.println(i+" "));
		System.out.println("the discarded element is :");
		obj.stream().skip(3).forEach((i)->System.out.println(i+" "));
	}

}
