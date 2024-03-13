package com.learning.day7;

class Stack 
{
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) 
    {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public void push(String item) 
    {
        if (isFull()) 
        {
            System.out.println("Stack is full. Cannot push element.");
        } 
        else 
        {
            top++;
            stackArray[top] = item;
        }
    }

    public String pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        } 
        else 
        {
            String poppedItem = stackArray[top];
            top--;
            return poppedItem;
        }
    }

    public boolean isEmpty() 
    {
        return (top == -1);
    }

    public boolean isFull() 
    {
        return (top == maxSize - 1);
    }

    public void displayStack() 
    {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class D07P01
{
    public static void main(String[] args) 
    {
        Stack s = new Stack(5);
        s.push("Hello");
        s.push("world");
        s.push("java");
        s.push("Programming");
        System.out.println("After Pushing 4 Elements:");
        s.displayStack();
        String poppedItem = s.pop();
        if (poppedItem != null) 
        {
            System.out.println("After a Pop: " );
            s.displayStack();
        }
    }
}