package com.mycompany.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.main.Calculator;

public class CalculatorTest {

	Calculator cal = null;
	
	@Before
	public void  Setup()
	{
		cal = new Calculator();
	}
	
	@Test
	public void test() {
		
		int expected = 15;
		assertEquals(expected, cal.sum(5, 10));
		
	}
	
	public void testCount()
	{
		int expected = 2;
		assertEquals(expected,cal.countA("Alphabet"));
	}

}
