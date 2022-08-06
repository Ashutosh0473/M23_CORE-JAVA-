package com.cg.decisionmaking;

public class CascadedEx {

	public static void main(String[] args) {
		int a=11,b=8,c=25;
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if (b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

}
