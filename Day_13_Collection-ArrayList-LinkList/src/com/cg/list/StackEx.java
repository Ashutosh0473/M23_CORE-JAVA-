package com.cg.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.add(0,"Ashhutosh");
		st.add(0,'s');
		st.add(0,12.5f);
		System.out.println(st);
		st.push(45);
		System.out.println(st);
		st.pop();
		System.out.println(st);

	}

}
