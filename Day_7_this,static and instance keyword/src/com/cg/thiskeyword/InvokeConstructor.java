package com.cg.thiskeyword;
//this (); to invoke current class constructor
class Z
{
	public int x;
	//Default constructor
	Z()
	{
		this(25);//invoking the parameterized constructor
		System.out.println("defult constructor");
	}
	//parameterized constructor
	Z(int x)
	{
		System.out.println("i am parameterized constructor :"+x);
	}
}
public class InvokeConstructor {

	public static void main(String[] args) {
		Z z=new Z();
		

	}

}
