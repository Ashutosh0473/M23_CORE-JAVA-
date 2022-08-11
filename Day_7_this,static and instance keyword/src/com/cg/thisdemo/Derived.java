package com.cg.thisdemo;

public class Derived extends Base1
{	
	//default constructor
	Derived()
	{
		System.out.println("defult cons for Derived");
	}
	//Parameterized constructor
	Derived(int i)
	{
		this();
		System.out.println("parameterizes cons for Derived"+i);
	}

}
