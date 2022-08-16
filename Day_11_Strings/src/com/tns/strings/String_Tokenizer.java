package com.tns.strings;

import java.util.StringTokenizer;
public class String_Tokenizer {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("go on the way");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
	}

}