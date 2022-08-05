package com.cg.inheritance;
class AndroidVersion
{
	void disp()
	{
		System.out.println("android version ");
	}
}
class kitkat extends AndroidVersion
{
	void print() {
		System.out.println("kitkat");
	}
}
class pie extends AndroidVersion
{
	void print1() {
		System.out.println("pie");
	}
}
public class HierchicalInheritance {

	public static void main(String[] args) {
		
		pie p=new pie();
		kitkat k=new kitkat();
		k.disp();
		k.print();
		p.print1();
		
	}

}
