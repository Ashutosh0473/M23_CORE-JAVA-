package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableMethodDemo {
	@Test
	void disp()
	{
		System.out.println("not disable");
	}
	@Disabled
	@Test
	void accept()
	{
		System.out.println("disable");
	}

}
