package com.learning.day3;

import java.util.Scanner;

public class D03P04 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the n elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        findFirstDuplicate(a, n);
        sc.close();
	}

    public static void findFirstDuplicate(int[] arr, int size)
    {
        boolean foundDuplicate = false;
        for (int i = 0; i < size; i++)
        {
            int count = 0;
            for (int j = i; j < size; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    count++;
                    if (count == 2) 
                    {
                        System.out.println("First duplicate element found at  " + j);
                        foundDuplicate = true;
                        break;
                    }
                }
            }
            if (foundDuplicate) 
            {
                break;
            }
        }
        if (!foundDuplicate) 
        {
            System.out.println("No duplicate elements found");
        }
    }
}

	
