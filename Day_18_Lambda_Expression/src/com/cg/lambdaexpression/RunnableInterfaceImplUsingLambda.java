package com.cg.lambdaexpression;
//to implement the runnable interface method 
public class RunnableInterfaceImplUsingLambda {

	public static void main(String[] args) {
		/*Runnable r1=new Runnable()
		{
			public void run()
			{
				System.out.println("Runnable interface implemention");
				
			}
		};
		*/
		Runnable R1=()->
		{
			System.out.println("Runnable interface implementation");
		};
		Thread t=new Thread(R1);
		t.start();/*when we call start it will come into method as 
		discussed in lifecycle of thread*/
	}

}
