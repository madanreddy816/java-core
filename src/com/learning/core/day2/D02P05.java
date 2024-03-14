package com.learning.day2;

import java.util.Scanner;

public class D02P05 
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n1=sc.nextInt();
		if (n1%5==0) 
		{
			System.out.println("Number is divisible by 5");
		}
		else {
			System.out.println("Number is not by 5");
		}
		
		
		
	}

}
