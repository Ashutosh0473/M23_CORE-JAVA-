package com.tns.strings;

import java.util.StringTokenizer;

public class String_Tokenizer_ex {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("hey guys how's you");
		
		while(st.hasMoreTokens()) 
		{
			System.out.println(st.nextToken());

		}

	}

}