package com.tns.strings;

public class SameString {

	public static void main(String[] args) {
		//String str=("hello");
		//String str1=("hello");
		String str1=new String("hello");
		String str2=new String("hello");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

	}

}
