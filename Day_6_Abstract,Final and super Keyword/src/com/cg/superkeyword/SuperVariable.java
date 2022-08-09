package com.cg.superkeyword;
class color
{
	protected String name="orange";
	
}
class Blue extends color
{
	public String name="Blue";
	public void display(){
	System.out.println(name);
	//super keyword is used to refer the parent class variable
	System.out.println(super.name);
	}
	
}
public class SuperVariable {

	public static void main(String[] args) {
		Blue b=new Blue();
		b.display();

	}

}
