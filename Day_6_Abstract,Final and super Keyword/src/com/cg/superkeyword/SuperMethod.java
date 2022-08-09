package com.cg.superkeyword;
class A
{
	public int pin;
	public void disp(int pin)
	{
		System.out.println("pin is :"+pin);
	}
}
class B extends A
{
	protected int pin;
	public void disp(int pin)
	{
		System.out.println("pin is :"+pin);
	}
	public void print()
	{
		disp(1111);//child class disp method 
		super.disp(2222);//parent class method
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		B b=new B();
		b.print();

	}

}
