package com.cg.InterfaceDemo;

interface Father
{
	void property();
}
interface Mother
{
	void love();
}
class Daughter implements Father,Mother{

	@Override
	public void love() {
		System.out.println("Mother loves their child");
		
	}

	@Override
	public void property() {
		System.out.println("Father gives property to child");
		
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d1=new Daughter();
		d1.love();
		d1.property();

	}

}