package com.learning.core.day8;

import java.util.Scanner;

class CircularQueue
{
	int front=-1;
	int rear=-1;
	int arr[];
	int n;
	
	public CircularQueue(int n)
	{
		this.n=n;
		arr=new int[n];
	}
	public boolean isFull()
	{
		return ((rear+1)%n)==front;
	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else if(isEmpty())
		{
			rear=front=0;
			arr[rear]=data;
		}
		else
		{
			rear= (rear+1)%n;
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
			front=(front+1)%n;
			return top;
		}
	}
}
public class D08P03 
{
	public static void main(String[] args)
	{
		CircularQueue cq=new CircularQueue(4);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 elements");
		for(int i=0;i<4;i++)
		{
			cq.enqueue(sc.nextInt());
		}
		cq.dequeue();
		System.out.println("Elements after removing once:");
        int current = cq.front;
        while (current != cq.rear) {
            System.out.print(cq.arr[current]+" ");
            current = (current + 1) % cq.n;
        }
        System.out.print(cq.arr[current]);
	}
}
