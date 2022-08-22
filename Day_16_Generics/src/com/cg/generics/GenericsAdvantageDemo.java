package com.cg.generics;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
//Demo on advantages of generics
public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		List<Integer> obj=new LinkedList<>();
		obj.add(12);
		//1.Type safety
		//obj.add("Ashutosh");
		
		System.out.println(obj);
		//typer casting is not required
		List <Integer>obj2=new ArrayList<>();
		obj2.add(15);
		//compile time checking 
		//obj2.add(15);
		Integer d=obj2.get(0);
		System.out.println(obj2);

	}

}
