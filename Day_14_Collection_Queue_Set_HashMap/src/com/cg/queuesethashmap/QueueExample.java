package com.cg.queuesethashmap;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		Queue<Integer>q=new PriorityQueue<Integer>();

		//   q.remove();  // throw exception 
		     q.poll();
		     System.out.println(q);

		 //  q.element();  //throw exception 
		     q.peek();
		     System.out.println(q);

	}

}