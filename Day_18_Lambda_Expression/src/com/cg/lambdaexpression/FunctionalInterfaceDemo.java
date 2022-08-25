package com.cg.lambdaexpression;
//Functional interface
interface D
{
	String disp(String str);//abstract method
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//lambda exprn with return statement
		D obj=(String str)->
		{
		 return str;
		 
		};
		System.out.println(obj.disp("welcome to lambda exprn concept"));

	}

}
