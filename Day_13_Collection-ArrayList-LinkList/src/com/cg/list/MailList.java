package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Add
{
	private int plotNo;
	private String street;
	private String Area;
	private String City;
	private String State;
	public Add(int plotNo, String street, String area, String city, String state) {
		super();
		this.plotNo = plotNo;
		this.street = street;
		Area = area;
		City = city;
		State = state;
	}
	@Override
	public String toString() {
		return String.format("Add [plotNo=%s, street=%s, Area=%s, City=%s, State=%s]", plotNo, street, Area, City,
				State);
	}
}
public class MailList {

	public static void main(String[] args) {
		List<Add>obj=new LinkedList<>();
		//add element to the LL
		obj.add(new Add(141,"lane no2","chakan","pune","maharashtra"));
		obj.add(new Add(456,"lane no2","chakan","pune","maharashtra"));
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			Object elem=i.next();
			System.out.println(elem+"\n");
		}
		System.out.println();

	}

}
