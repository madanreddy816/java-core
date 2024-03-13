package com.learning.day7;
class Node 
{
    double data;
    Node next;

    Node(double data) 
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack 
{
    private Node top;

    public LinkedListStack() 
    {
        this.top = null;
    }

    public void push(double item) 
    {
        Node newNode = new Node(item);
        if (isEmpty()) 
        {
            top = newNode;
        } 
        else 
        {
            newNode.next = top;
            top = newNode;
        }
    }

    public double pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot pop element.");
            return Double.NaN;
        } else 
        {
            double poppedItem = top.data;
            top = top.next;
            return poppedItem;
        }
    }

    public boolean isEmpty() 
    {
        return (top == null);
    }

    public void displayStack() 
    {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}


public class D07P02 
{
	public class Main 
	{
		public static void main(String[] args) 
		{
			LinkedListStack ls= new LinkedListStack();
			ls.push(10.0);
			ls.push(20.0);
			ls.push(30.0);
			ls.push(40.0);
			ls.displayStack();
			ls.pop();
			ls.pop();
			System.out.print("After popping twice: ");
			ls.displayStack();
		}
	}
}
