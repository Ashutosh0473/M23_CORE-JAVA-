package com.cg.opearator;

public class LogicalOperator {
//logical operator program
	public static void main(String[] args) {
		int a=3,b=4;
		boolean res=(a<b && b<8);
		boolean res1=(a<b || b>8);
		boolean res2=!(a<b);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

}
