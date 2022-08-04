package com.capgemini.opps;
//demo on how to use class and object
class car
{
	int a=15;
	//user-define method
	void show()
	{
		System.out.println("wellcome to m23 batch");
	}
	
}
public class ProgramOnlClassAndObject {

	public static void main(String[] args) {
		//object creation
		car obj=new car();
		//accessing the car class method
		obj.show();
		//obj.a=55;
		//accessing the car class variable
		System.out.println(obj.a);

	}

}
