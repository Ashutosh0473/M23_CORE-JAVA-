package com.cg.polymorphism;
//program on constructor overloading
class Xuv
{
	int  speed;
	String engine;
	//zero parameter 
	Xuv()
	{
		System.out.println("Mahindra-XUV");
	}
	//two parameter
	Xuv(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("speed is "+ speed+" and the engine is on "+engine);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Xuv x=new Xuv();
		@SuppressWarnings("unused")
		Xuv x1=new Xuv(45,"petrol");
		

	}

}
