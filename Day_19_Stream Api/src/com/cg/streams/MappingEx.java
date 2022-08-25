package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingEx {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(new Integer[] {22,4,8,9,8});
		obj.stream().map((i->i*i)).forEach((i)->System.out.print(i+" "));
		List<Integer>obj1=obj.stream().map(i->i*i).collect(Collectors.toList());
		System.out.print(obj1+" ");
	}

}
