package com.learning.day9;

import java.util.Scanner;

class MergeSort 
{
    public void sort(int arr[], int lb, int up) 
    {
        if (lb < up) 
        {
            int mid = (lb + up) / 2;
            sort(arr, lb, mid);
            sort(arr, mid + 1, up);
            merge(arr, lb, mid, up);
        }
    }

    public void merge(int arr[], int lb, int mid, int up)
    {	
        int n1 = mid - lb + 1;
        int n2 = up - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) 
        {
            left[i] = arr[lb + i];
        }
        for (int j = 0; j < n2; j++) 
        {
            right[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = lb;
        while (i < n1 && j < n2) 
        {
            if (left[i] <= right[j]) 
            {
                arr[k] = left[i];
                i++;
            } 
            else 
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) 
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) 
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}

public class D09P02 
{	
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        MergeSort m = new MergeSort();
        int l = arr.length;
        m.sort(arr, 0, l - 1);
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
