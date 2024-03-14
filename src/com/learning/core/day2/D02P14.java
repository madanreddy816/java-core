package com.learning.day2;

import java.util.Scanner;

public class D02P14 
{

	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int exp=sc.nextInt();
		int res=1;
		for(int i=0;i<exp;i++)
		{
			res=res*n;
		}
		System.out.println(res);
	}

}
