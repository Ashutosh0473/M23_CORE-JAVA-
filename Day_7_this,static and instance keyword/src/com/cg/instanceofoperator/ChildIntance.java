package com.cg.instanceofoperator;

class A
{
	
}
public class ChildIntance extends A
{

	public static void main(String[] args) {
		ChildIntance c=new ChildIntance();
		
		//here it will print true because main class is inheritated property of class A
		System.out.println(c instanceof A);

	}

}