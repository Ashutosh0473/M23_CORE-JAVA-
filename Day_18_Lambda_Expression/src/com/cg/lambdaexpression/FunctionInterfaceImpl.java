package com.cg.lambdaexpression;
//functional interface=>contains exactly one abstract method
interface A
{
	void print();//abstract method
	

}

/*class B implements A
{
	@Override
	public void print()
	{
		System.out.println("Functional interface implementation without lambda expression/r"
				+"lambda expression");
	}
}*/
public class FunctionInterfaceImpl {

	public static void main(String[] args) {
		/*B obj=new B();
		obj.print();*/
		//1.lambda expr implements the functional interface
		//2.length of the code is decreased using lambda expren
		A obj=()->
		{
			System.out.println("Functional interface implementation without lambda expression/r"
				+"lambda expression");
		};
		obj.print();
		

	}

}
