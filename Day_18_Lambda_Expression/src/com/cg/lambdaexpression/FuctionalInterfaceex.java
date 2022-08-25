package com.cg.lambdaexpression;
interface E
{
	int add(int a,int b);//abstract method
}
public class FuctionalInterfaceex {

	public static void main(String[] args) {
		/* Lambda exprn with return statement 
		  E obj=(int a,int b)->
		{
			return a+b;
		};
		System.out.println(obj.add(19, 20));
	*/
		// Lambda exprn without return statement 
		E obj=(int a,int b)->(a+b);
		System.out.println("addditon of a nd b is: "+obj.add(12, 56));
	}

}
