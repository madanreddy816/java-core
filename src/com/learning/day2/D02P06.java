package learning.core.day2;

import java.util.Scanner;

public class D02P06 
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7");
		int n=sc.nextInt();
		String Weekend;
		if(n==1) 
		{
			Weekend="Monday";
		}
		else if(n==2)
		{
			Weekend="Tuesday";
		}
		else if(n==3)
		{
			Weekend="Wednesday";
		}
		else if(n==4)
		{
			Weekend="Thursaday";
		}
		else if(n==5)
		{
			Weekend="Friday";
		}
		else if(n==6)
		{
			Weekend="Saturday";
		}
		else if(n==7)
		{
			Weekend="Sunday";
		}
		else {
			Weekend=null;
		}
		
		if(Weekend!=null)
		{
			System.out.println(Weekend);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
