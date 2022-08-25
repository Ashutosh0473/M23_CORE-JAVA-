package com.cg.practice;

import java.util.Scanner;

class m1{
	
	
	void disp()
	{
		
		System.out.println("i am displya method");
	}
}
class m2 extends m1
{
	void show ()
	{
		System.out.println("i am show method");
	}
}
public class ASD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		int a=sc.nextInt();
		System.out.println("enter second no");
		int b=sc.nextInt();
		System.out.println(a+b);
		m2 m=new m2();
	m.disp();
	m.show();
	sc.close();
	}

}
