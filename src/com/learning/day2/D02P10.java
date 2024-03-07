package learning.core.day2;

import java.util.Scanner;

public class D02P10 
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int res=0;
		while(n!=0)
		{
			int a=n%10;
			res=res*10+a;
			n=n/10;
		}
		System.out.println(res);
		
		
		
	}

}
