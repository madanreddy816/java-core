package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 
{
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        System.out.println("Length of string  " + input.length());
	        String uppercase = input.toUpperCase();
	        System.out.println("Uppercase string " + uppercase);
	        if (isPalindrome(input))
	        {
	            System.out.println("It is a Palindrome");
	        } else 
	        {
	            System.out.println("It is not a Palindrome.");
	        }
	    }
	    public static boolean isPalindrome(String str)
	    {
	        str = str.toLowerCase();
	        int start = 0;
	        int end = str.length() - 1;
	        while (start < end)
	        {
	            if (str.charAt(start) != str.charAt(end)) 
	            {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }
	}




