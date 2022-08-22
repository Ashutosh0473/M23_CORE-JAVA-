package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List obj=new ArrayList<>();
		obj.add(11);
		obj.add("Ashutosh");
		obj.add(76.90);
		obj.add(152);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(2);
		System.out.println(obj.lastIndexOf(11));
		System.out.println(obj);
		
	}

}
