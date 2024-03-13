package com.learning.day7;
import java.util.Scanner;

class StackR 
{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackR(int size) 
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

    public void reverse()
    {
        if (!isEmpty()) 
        {
            int poppedElement = pop();
            reverse();
            insertAtBottom(poppedElement);
        }
    }

    private void insertAtBottom(int item) 
    {
        if (isEmpty()) {
            push(item);
        } else {
            int poppedElement = pop();
            insertAtBottom(item);
            push(poppedElement);
        }
    }

    public void display() 
    {
        for (int i = top; i >= 0; i--) 
        {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class D07P05 
{

    public static void main(String[] args) {
        StackR stack = new StackR(100);
        if (args.length > 0) 
        {
            for (String str : args) 
            {
                stack.push(Integer.parseInt(str));
            }
        }
        else 
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the numbers separated by spaces: ");
            String inputStr = scanner.nextLine();
            String[] numbers = inputStr.split(" ");
            for (String num : numbers)
            {
                stack.push(Integer.parseInt(num));
            }
        }
        System.out.print("Reversed stack ");
        stack.display();
    }
}
