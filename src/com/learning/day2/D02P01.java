package learning.core.day2;

import java.util.Scanner;

public class D02P01 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 12");
		int Month=sc.nextInt();
		String monthName;
		if (Month == 1)
		
		{
            monthName = "January";
        }
		else if (Month == 2) 
		{
            monthName = "February";
        } 
		else if (Month == 3) 
		{
            monthName = "March";
        }
		else if (Month == 4) 
		{
            monthName = "April";
        }
		else if (Month == 5) 
		{
            monthName = "May";
        }
		else if (Month == 6) 
		{
            monthName = "June";
        } 
		else if (Month == 7) 
		{
            monthName = "July";
        }
		else if (Month == 8) 
		{
            monthName = "August";
        }
		else if (Month== 9) 
		{
            monthName = "September";
        } 
		else if (Month == 10) 
		{
            monthName = "October";
        }
		else if (Month == 11) 
		
		{
            monthName = "November";
        }
		else if (Month== 12) 
		{
            monthName = "December";
        }
		else {
            monthName = null;
        }

        if (monthName != null) {
            System.out.println("Month: " + monthName);
        } else {
            System.out.println("Invalid Input");
        }
	}
		
}
		
