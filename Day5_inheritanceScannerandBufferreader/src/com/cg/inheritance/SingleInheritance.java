package com.cg.inheritance;
//program on single inheritance
class parent
{
	protected int rollno ;
	void print()
	{
		System.out.println("hey guys whats going on ?");
	}
}
class child extends parent
{
	void disp()
	{
		System.out.println("Rollno is"+rollno);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		child c=new child ();
		c.rollno=12;
		c.disp();
		c.print();

	}

}
