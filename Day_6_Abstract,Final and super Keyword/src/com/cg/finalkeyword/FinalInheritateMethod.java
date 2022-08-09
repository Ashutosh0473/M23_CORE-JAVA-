package com.cg.finalkeyword;
class car
{
	String name;
	//final method is inherited but not the override
	final void print(String name)
	{
		System.out.println("my name is : "+name);
	}
}
class Audi extends car
{
	
}
public class FinalInheritateMethod {

	public static void main(String[] args) {
		Audi a=new Audi();
	
		a.print("audi");

	}

}
