package com.tns.strings;

import java.util.Scanner;

public class MatchWordString {

	public static void main(String[] args) {
		String str1="Dhoni";
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		if(str1.equals(st))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.println("not matching");
		}
		s.close();

	}

}
