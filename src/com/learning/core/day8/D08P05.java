package com.learning.core.day8;

import java.util.Scanner;

class Queue1 {
	int front = -1;
	int rear = -1;
	int arr[];
	int n;

	public Queue1(int n) {
		this.n = n;
		arr = new int[n];
	}

	public boolean isFull() {
		return rear == n - 1;
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else if (isEmpty()) {
			rear = front = 0;
			arr[rear] = data;
		} else {
			rear++;
			arr[rear] = data;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else if (front == rear) {
			int top = arr[front];
			front = rear = -1;
			return top;
		} else {
			int top = arr[front];
			front++;
			return top;
		}
	}
	public void display() {
		for (int i = this.front; i <= this.rear; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}

public class D08P05 {
	public static void main(String[] args) {
		Queue1 q = new Queue1(7);
		Queue1[] output = new Queue1[2];
		Queue1 oddq = new Queue1(4);
		Queue1 evenq = new Queue1(4);
		output[0] = oddq;
		output[1] = evenq;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<7;i++)
		{
			q.enqueue(sc.nextInt());
		}
		while (!q.isEmpty()) {
			int data = q.dequeue();
			if (data % 2 != 0) {
				oddq.enqueue(data);
			} else {
				evenq.enqueue(data);
			}
		}
		System.out.println("Odd Queue:");
		oddq.display();
		System.out.println();
		System.out.println("Even Queue:");
		evenq.display();
	}
}