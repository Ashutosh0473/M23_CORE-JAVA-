package com.cg.queuesethashmap;

import java.util.HashSet;

public class HashsetExample {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet s=new HashSet(); // duplicate element print only once 
         s.add("Ashutosh");
         s.add("Ashutosh");
         s.add(12.5);
         s.add(25);
         s.add(25);
         s.add(2.8);
        
         System.out.println(s);
         
         
			}

}