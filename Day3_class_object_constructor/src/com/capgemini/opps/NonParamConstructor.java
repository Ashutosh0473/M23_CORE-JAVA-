package com.capgemini.opps;

class animal
{
	int x;
	//non parameterized constructor
	animal()
	{
		x=15;
	}
	void display()
	{
		System.out.println("lion"+x);
	}
}
public class NonParamConstructor {

	public static void main(String[] args) {
		animal a=new animal();
		pulsar a1=new pulsar(45,"black");
		a.display();
	}

}
