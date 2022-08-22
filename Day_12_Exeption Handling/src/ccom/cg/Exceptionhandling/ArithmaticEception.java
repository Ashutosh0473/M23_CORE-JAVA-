package ccom.cg.Exceptionhandling;

import java.util.Scanner;

public class ArithmaticEception {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int res=0;
		//try block contains exception and non-exception code
		//handling the exception using catch block
		
		try
		{
			int a=15;
			System.out.println("Enter the value of b");
			int b=s.nextInt();
			 res=a/b;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handle"+e);
		}
		s.close();
		
	}

}
