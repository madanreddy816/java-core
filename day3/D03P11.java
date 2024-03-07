package com.learning.day3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class D03P11 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the pattern: ");
        	String pattern = scanner.nextLine();
        	System.out.print("Enter the number of strings in the dictionary: ");
        	int n = scanner.nextInt();
<<<<<<< HEAD
        	scanner.nextLine(); // Consume newline
=======
       		scanner.nextLine(); // Consume newline
>>>>>>> 50fecc7d0cbd3af7b7632d2abdaa100e1b205ca0
        	List<String> dictionary = new ArrayList<>();
        	System.out.println("Enter the strings in the dictionary:");
        	for (int i = 0; i < n; i++)
        	{
           	dictionary.add(scanner.nextLine());
        	}
<<<<<<< HEAD
        	List<String> matchedStrings = findMatchingStrings(dictionary, pattern);
=======
       		List<String> matchedStrings = findMatchingStrings(dictionary, pattern);
>>>>>>> 50fecc7d0cbd3af7b7632d2abdaa100e1b205ca0
        	System.out.println("Strings matching the pattern:");
        	for (String str : matchedStrings) 
        	{
            	System.out.println(str);
        	}
<<<<<<< HEAD
	}
=======
    	}
>>>>>>> 50fecc7d0cbd3af7b7632d2abdaa100e1b205ca0

    public static List<String> findMatchingStrings(List<String> dictionary, String pattern) 
    {
        List<String> matchedStrings = new ArrayList<>();
        for (String str : dictionary)
        {
            if (matchesPattern(str, pattern))
            {
                matchedStrings.add(str);
            }
        }
        return matchedStrings;
    }
    public static boolean matchesPattern(String str, String pattern)
    {
        if (str.length() != pattern.length())
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++) 
        {
            if (pattern.charAt(i) != '.' && pattern.charAt(i) != str.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
