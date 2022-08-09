package com.cg.superdemo;

public class Base2 extends Base1{
	Base2()
	{
		super();//call to parent class constructor
		System.out.println("Defult Constructor for Base2");
	}
	Base2(int i)
	{
		super(i);//call to parent class parameterized constructor
		System.out.println("parameterized constructor for base2: "+i);
	}

}

