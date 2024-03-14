package com.learning.day1;
import java.util.Scanner;

public class D03P01 
{
	public static void method(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inp=sc.nextLine();
		System.out.println(inp.toUpperCase());
		int start=0;
		int end=inp.length()-1;
		int a=1;
		while(start<end) 
		{
			if(inp.charAt(start)!=inp.charAt(end))
			{
				a=1;
                break;
            }

            start++;
            end--;
        }
		if(a==1)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}
	
			
	
}
	
	
	
	


