package com.cg.finalkeyword;
class A
{
	A()
	{
		System.out.println("constructor");
	}
	//if you make any method as final you cant override it
	//final public void accept 
	final public void accept ()
	{
		System.out.println("parent class");
	}
}
class b extends A
{
	/*public void accept()
	{
		System.out.println();
	}*/
}
public class FinalMethod {

	public static void main(String[] args) {
		b B=new b();
		B.accept();
	}

}
