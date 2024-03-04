package learning.core.day2;

import java.util.Scanner;

public class D02P16 
{

	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for fibonacci series");
		int n=sc.nextInt();
		 int firstTerm = 0, secondTerm = 1;
	        for (int i = 1; i <= n; i++) 
	        {
	            System.out.print(firstTerm + " ");
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	            System.out.println(nextTerm);
	        }
	}
	
}
