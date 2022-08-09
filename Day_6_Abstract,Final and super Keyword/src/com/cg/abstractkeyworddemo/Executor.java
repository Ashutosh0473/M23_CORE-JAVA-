package com.cg.abstractkeyworddemo;

public class Executor {

	public static void main(String[] args) {
		//cretation of child class object as Rashmalai is abstract we cant instantiate
		Sweet s=new Sweet();
		s.print();
		s.test();
		s.disp();
	}

}
