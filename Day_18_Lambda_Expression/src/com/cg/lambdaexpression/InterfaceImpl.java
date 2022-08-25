package com.cg.lambdaexpression;

interface C
{
	
	void disp();
	
}
public class InterfaceImpl {

	public static void main(String[] args) {
		//The target type of this expression must be a functional interface
		C obj=()->
		{
			System.out.println("Functional interface implementation without lambda expression/r"
					+"lambda expression");
		};
		obj.disp();

	}

}
