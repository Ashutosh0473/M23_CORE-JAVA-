package ccom.cg.Exceptionhandling;

import java.util.Scanner;

public class NullPointerExceptionHandling {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		try {
			str.equals("JAVA");
		}
		catch(Exception e)
		{
			str=new String("JAVA");
			System.out.println(str.equals("JAVA"));
		}
	}

}
