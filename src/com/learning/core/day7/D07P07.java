package com.learning.day7;
import java.util.Scanner;

class StackEven 
{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackEven(int size) 
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) 
    {
        if (isFull()) 
        {
            System.out.println("Stack is full, cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty");
            return -1; 
        }
        return stackArray[top];
    }

    public boolean isEmpty() 
    {
        return top == -1;
    }

    public boolean isFull() 
    {
        return top == maxSize - 1;
    }

    public boolean isTopEven() 
    {
        if (isEmpty()) 
        {
            return false; 
        }
        int topElement = peek();
        return topElement % 2 == 0; 
    }
}

public class D07P07 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        StackEven stack = new StackEven(n);
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            stack.push(sc.nextInt());
        }
        boolean result = stack.isTopEven();
        System.out.println(result);
    }
}

