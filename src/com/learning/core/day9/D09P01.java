package com.learning.day9;
import java.util.Scanner;
class QuickSort
{
	public int partition(int arr[],int lb,int ub)
	{
		int pivot=arr[lb];
		int start=lb;
		int end=ub;
		while(start<end)
		{
			start=start+1;
			while(start<=ub && arr[start]<pivot)
			{
				start++;
			}
			while(end>=lb && arr[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		return end;
	}
	public void quickSort(int arr[],int lb,int ub)
	{
		int loc;
		if(lb<ub)
		{
			loc=partition(arr,lb,ub);
			quickSort(arr,lb,loc-1);
			quickSort(arr,loc+1,ub);
		}
	}
}
public class D09P01 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		QuickSort q=new QuickSort();
		int l=arr.length;
		q.quickSort(arr, 0, l-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
