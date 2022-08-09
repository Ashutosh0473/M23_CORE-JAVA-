package com.cg.finalkeyword;
//if any class is declared as final we cant inherit it
//final class fruit
	class Fruit
	{
		Fruit()
		{
			System.out.println("constructor");
		}
		//if you make any method as final you cant override it
		//final public void accept 
		public void accept ()
		{
			System.out.println("parent class");
		}
	}
	class Apple extends Fruit
	{
		public void accept()
		{
			System.out.println("parent class");
		}
	}
	public class FinallClass
	{
		public static void main(String []args) {
			Apple a=new Apple();
			a.accept();
		}
	}
	
	