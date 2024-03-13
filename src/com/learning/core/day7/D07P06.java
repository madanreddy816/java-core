package com.learning.day7;

import java.util.Scanner;

class stck 
{
    int n;
    int arr[];
    int top;

    stck(int n) 
    {
        this.n = n;
        this.arr = new int[n];
        this.top = -1;
    }

    public boolean isEmpty() 
    {
        return (top == -1);
    }

    public boolean isFull() 
    {
        return (n - 1 == top);
    }

    public void push(int data)
    {
        if (isFull())
        {
            System.out.println("Stack is Full");
        } 
        else 
        {
            top++;
            arr[top] = data;
        }
    }

    public int pop() 
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        } 
        else 
        {
            int value = arr[top];
            top--;
            return value;
        }
    }

    public void getMin() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is Empty");
        } 
        else 
        {
            int min = arr[0]; 
            for (int i = 1; i <= top; i++) 
            {
                if (arr[i] < min) 
                {
                    min = arr[i];
                }
            }
            System.out.println("Minumum element in the Stack "+min);
        }
    }
}

public class D07P06 
{
    public static void main(String[] args) 
    {
        stck s = new stck(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements");
        for (int i = 0; i < 5; i++) { // Corrected loop condition
            s.push(sc.nextInt());
        }
        s.getMin();
    }
}
