package com.cg.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListex {

	public static void main(String[] args) {
		LinkedList obj=new LinkedList<>();
		
		obj.add(11);
		obj.add("ashutosh");
		obj.add(73.66);
		obj.add(10);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.remove(2));
		System.out.println(obj);

	}

}