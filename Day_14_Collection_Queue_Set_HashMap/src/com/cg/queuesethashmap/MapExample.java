package com.cg.queuesethashmap;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		Map<Character,String> map=new HashMap<Character,String>();
   map.put('a',"Ashutosh");
   map.put('k',"Kamlesh");
   map.put('a', "Ashu");
   map.put('p',"Pankaj");
   map.put('r',"Rahul");
   System.out.println(map);
   map.remove('k');
   for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet())
  {
	  System.out.println(m.getKey()+" "+m.getValue());
	 
  }

	}

}