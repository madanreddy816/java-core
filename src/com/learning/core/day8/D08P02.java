package com.learning.core.day8;
import java.util.Scanner;

class Node
{
	int value;
	Node next;
	
	public Node(int value)
	{
		this.value=value;
		this.next=null;
	}
}

class LinkedlistQueue
{
	Node front,rear;
	
	public void enqueue(int data)
	{
		if(front==null)
		{
			rear=new Node(data);
			front =rear;
		}
		else
		{
			Node newNode=new Node(data);
			rear.next=newNode;
			rear=newNode;
		}
	}
	public int dequeue()
	{
		int res;
		if(front==null)
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			res=front.value;
			front=front.next;
			return res;
		}
	}
}

public class D08P02 
{
	public static void main(String[] args)
	{
		LinkedlistQueue lq=new LinkedlistQueue();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for(int i=0;i<5;i++)
		{
			lq.enqueue(sc.nextInt());
		}
		lq.dequeue();
		lq.dequeue();
		Node current = lq.front;
		System.out.println("The remaining elements after removing 2 elements");
        while (current != null) 
        {
            System.out.print(current.value+" ");
            current = current.next;
        }
		
	}
}
