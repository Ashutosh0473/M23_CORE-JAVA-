package com.cg.thiskeyword;
class Main
{
	int x,y;
	Main ()
	{
		x=10;
		y=20;
	}
	Main get1()
	{
		//this keyword is used to return current class instance variable 
		return this;
	}
	public void display()
	{
		System.out.println("multiplication of X and Y is: "+(x*y));
	}
}

public class CurrentClassInstance {

	public static void main(String[] args) {
		Main m=new Main();
		m.get1().display();

	}

}
