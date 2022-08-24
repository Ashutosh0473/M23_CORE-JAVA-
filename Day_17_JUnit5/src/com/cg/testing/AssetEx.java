package com.cg.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssetEx {
	@Test
	public void disp()
	{
		int result=5;
		int expected=5;
		/*it will check the value is equal or not ,if it is equal no failures 
		otherwise u will get failure*/
		assertEquals(result,expected);
	}

}
