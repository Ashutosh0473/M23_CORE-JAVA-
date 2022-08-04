package com.cg.package4;
class car 
{
		//if any var and method is protected we can access inside the child classs
	protected void print()
	{
		System.out.println("i am using print method");
	}
}
class mercedes extends car
{
	//mercedes class is accessing the properties of car class
}
public class ProtectedEx {

	public static void main(String[] args) {
		
		mercedes m=new mercedes();
		m.print();
	}

}
