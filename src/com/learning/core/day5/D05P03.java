package com.learning.core.day5;

import java.util.HashSet;

public class D05P03 
{

	public static void main(String[]args)
	{
		HashSet<Product> hs=new HashSet<Product>();
		
		Product p1=new Product("P001","Maruthi 800");
		Product p2=new Product("P002","Maruthi Zen");
		Product p3=new Product("P003","Maruthi Dezire");
		Product p4=new Product("P004","Maruthi Alto");
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		System.out.println(hs);
		

		
		
		
	}
}
