package com.cg.superkeyword;
class Android
{
	
	Android()
	{
	System.out.println("lava is android mobile");
	}
	
}
class Lava extends Android 
{

	Lava()
	{
		//Android class constructor
		super();
		System.out.println("Hello everyone ");
	}
	}
public class SuperConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Lava l=new Lava();
	}

}
