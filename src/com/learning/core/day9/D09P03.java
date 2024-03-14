package com.learning.day9;

import java.util.Scanner;

public class D09P03 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = scanner.nextInt();
        int[] arr = new int[n];
       System.out.println("Ente the elements");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to search");
        int search = scanner.nextInt();
        int res = binarySearch(arr, search);
        if (res != -1) 
        {
            System.out.println("Element is Present");
        } 
        else 
        {
            System.out.println("Element is not Present");
        }

        scanner.close();
    }


    public static int binarySearch(int[] arr, int search) 
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == search) 
            {
                return mid;
            }
            if (arr[mid] < search) 
            {
                left = mid + 1;
            }
            
            else 
            {
                right = mid - 1;
            }
        }
        return -1;
    }
}