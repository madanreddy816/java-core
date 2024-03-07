package com.learning.day3;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D03P12 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.next();

        if (canSplitIntoFourDistinctStrings(input))
        {
            System.out.println("Yes");
        } else 
        {
            System.out.println("No");
        }
    }

    public static boolean canSplitIntoFourDistinctStrings(String input) 
    {
        int n = input.length();
        for (int i = 1; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                for (int k = j + 1; k < n; k++) 
                {
                    String first = input.substring(0, i);
                    String second = input.substring(i, j);
                    String third = input.substring(j, k);
                    String fourth = input.substring(k);
                    if (areDistinct(first, second, third, fourth)) 
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean areDistinct(String... strings) 
    {
        Set<String> set = new HashSet<>();
        for (String str : strings) 
        {
            if (!set.add(str)) 
            {
                return false;
            }
        }
        return true;
    }
}
