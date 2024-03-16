package com.learning.day10;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
public class D10P07 
{
	@Test
	public void testAdd()
	{
		assertEquals(30,calculator.add(14,16));
	}
	
	@Test
	public void testSub()
	{
		assertEquals(9,calculator.Sub(18,9));
	}
}

class calculator
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int Sub(int a,int b)
	{
		return a-b;
	}
}
