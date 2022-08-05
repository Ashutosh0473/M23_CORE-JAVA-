package com.cg.inheritance;
//program on multilevel inheritance

//parent class
class Bike
{
	protected int speed;
	
		void disp()
		{
			System.out.println("i like to drive a bike");
		}
	
}
//parent class for pulser125 and child class of bike 
class pulser extends Bike 
{
	protected String color;
	void print()
	{
		System.out.println("speed is "+speed);
	}
}
class pulser125 extends pulser
{
	void accept()
	{
		System.out.println("color is "+color);
		
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		pulser125 p=new pulser125();
		p.color="black";
		p.speed=60;
		p.accept();
		p.disp();
		p.print();
	}

}
