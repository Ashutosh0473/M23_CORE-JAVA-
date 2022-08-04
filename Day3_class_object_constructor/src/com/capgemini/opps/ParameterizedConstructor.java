package com.capgemini.opps;
class pulsar
{
	//class var
	public int speed;
	public String color;
	//parameterized constructor
	pulsar(int speed,String color)
	{
		this.speed=speed;
		this.color=color;
		
	}
	pulsar()
	{
		System.out.println("wellcome To technoserver india");
	}
	//parameterized constructor
	/*pulsar(int sp,String col)
	{
		speed=sp;
		color=col;
	}*/
	void accept()
	{
		System.out.println("speed is "+speed+"km/hr"+" and color is :"+color);
	}
	
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		pulsar p=new pulsar(50,"black");
		p.accept();

	}

}
