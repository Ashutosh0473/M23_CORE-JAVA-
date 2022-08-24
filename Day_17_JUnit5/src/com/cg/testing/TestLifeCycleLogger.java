package com.cg.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger 
{
	//It is used to signal that the annotated method should be executed after all 
	@AfterAll
	default
	void testMethod(){
		System.out.println("test method");
	}
	//It is used to signal that the annotated method should be executed 
	@BeforeAll
	default void beforeAllTest() 
	
	{
		System.out.println("before all test");
	}
	
}
