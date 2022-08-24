package com.cg.testing;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class parameterizedDemo {
	@ParameterizedTest
	@ValueSource(strings= {"ashutosh","ashu"})
	void print(String word )
	{
		assertNotNull(word);
	}
}
