package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void division()
	{
		System.setProperty("ashutosh","sawant");
		//if Assumption is true then printing statement will print otherwise not
		Assumptions.assumeTrue("sawant".equals(System.getProperty("ashutosh")));
		System.out.println("Assumption is true");
		
		//if Assumption is true then printing statement will print otherwise not 
		Assumptions.assumeFalse("ram".equals(System.getProperty("ashutosh")));
		System.out.println("Assumption is false");
	}

}
