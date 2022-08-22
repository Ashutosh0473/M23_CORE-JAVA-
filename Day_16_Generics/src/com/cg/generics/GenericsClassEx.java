package com.cg.generics;
//generics class ex
public class GenericsClassEx<T> {
	T num;
	public void show()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		//instead of collection i have used Generic class name and geric 
		GenericsClassEx<Double>obj=new GenericsClassEx<>();
		obj.num=13.8;
		obj.show();

	}

}
