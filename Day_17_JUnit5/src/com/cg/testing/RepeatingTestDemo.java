package com.cg.testing;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatingTestDemo {
	
	//it will 
	@RepeatedTest(5)
	void print()
	{
	
		System.out.println("hey guys,whats going on");
	}

}
