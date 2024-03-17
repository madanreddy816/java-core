package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Percentage");
		double perc=sc.nextDouble();
		if(perc>=60 && perc<=100)
		{
			System.out.println("Grade A");
		}
		else if(perc>=45 && perc<60)
		{
			System.out.println("Grade B");
		}
		else if(perc>=35 && perc<45)
		{
			System.out.println("Grade C");
		}
		else
			System.out.println("Fail");
				
	}

}
