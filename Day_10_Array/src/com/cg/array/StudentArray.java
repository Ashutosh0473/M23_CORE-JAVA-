package com.cg.array;
class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	
}
public class StudentArray {

	public static void main(String[] args) {
		Student[]arr=new Student[3];
		arr[0]=new Student(1, "Ashutosh");
		arr[1]=new Student(2, "shubham");
		arr[2]=new Student(3, "salman");
		for(int i=0;i<arr.length;i++) 
		{
		System.out.println("Element at "+i+" index"+arr[i].roll_no+" "+arr[i].name);
		}
	}

}
