package com.cg.decisionmaking;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		//switch
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("Ashutosh");
		    break;
		case 2:
			System.out.println("hello");
		    break;
		case 3:
			System.out.println("malegaon");
		    break;
		    default:
		    	System.out.println("invalid input");
		}
	}

}
