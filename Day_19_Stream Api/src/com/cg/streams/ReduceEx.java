package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceEx {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(12,13,45,50,63);
		Optional<Integer>result=obj.stream().reduce((i,j)->i>j?i:j);
		if(result.isPresent())
		{
			System.out.println("result is : "+result.get());
		}
	}

}
