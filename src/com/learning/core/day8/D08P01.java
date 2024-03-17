package com.learning.core.day8;

import java.util.Scanner;

class Queue
{
	int front=-1;
	int rear=-1;
	int arr[];
	int n; 
	
	public Queue(int n)
	{
		this.n=n;
		arr=new int[n];
	}
	public boolean isFull()
	{
		return rear==n-1;
	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else if(isEmpty())
		{
			rear=front=0;
			arr[rear]=data;
		}
		else
		{
			rear++;
			arr[rear]=data;
		}
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else if(front==rear)
		{
			int top=arr[front];
			front=rear=-1;
			return top;
		}
		else
		{
			int top=arr[front];
			front++;
			return top;
		}
	}
	
}


public class D08P01 
{
	public static void main(String[] args)
	{
		Queue q=new Queue(4);
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 4 elements");
		for(int i=0;i<4;i++)
		{
			q.enqueue(sc.nextInt());
		}
		q.dequeue();
		System.out.println("The remaining elements after removing one element");
		for(int i=0;i<3;i++)
		{
			int index=q.front+i;
			System.out.print(q.arr[index]+" ");
		}
	}
}
