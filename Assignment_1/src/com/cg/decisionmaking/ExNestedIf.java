package com.cg.decisionmaking;
//nested if program
public class ExNestedIf {

	public static void main(String[] args) {
		int age=10,weight=55;
		if (age>=12)
		{
			if (weight>=40)
			{
				if (weight<=110)
				{
					System.out.println("Extra ropes will be added");
				}
				else
				{
					System.out.println("Not eligible for bunjee jumping");
				}
			}
		}
		else
		{
			System.out.println("Not eligible for bunjee jumping");
		}
	}

}
