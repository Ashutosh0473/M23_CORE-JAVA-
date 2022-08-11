package com.cg.Statickeyword;

public class StaticBlock {

	 static int num;
	 static String str;
	
	static 
	{
		num =14;
		str="bcs";
	}
	public static void main(String[] args) {
		//if u want initialized value without using constructor  and obj creation then use static block
		//and make variable of class as static
		System.out.println(num);
		System.out.println(str);

	}

}

