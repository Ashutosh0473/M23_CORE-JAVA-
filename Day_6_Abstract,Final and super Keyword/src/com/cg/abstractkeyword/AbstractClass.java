package com.cg.abstractkeyword;
abstract class Flower
{
	//abstract method
	abstract void print();
	//non abstract method
	void accept()
	{
		System.out.println("demo on abstract keyword");
	}
	
}
class rose extends Flower
{
	void print()
	{
		System.out.println("I like this flower");
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		//we cant create the object for abstract class
		//flower fw=new flower 
		rose rs=new rose();
		rs.accept();
		rs.print();

	}

}
