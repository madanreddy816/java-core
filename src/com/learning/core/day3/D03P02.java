package com.learning.core.day3;

import java.util.Scanner;

import java.util.Scanner;

public class D03P02 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers between 1 and 40 ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.print("Enter 5 integers  ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
        {
            array[i] = scanner.nextInt();
        }
        boolean found1 = false;
        boolean found2 = false;
        for (int i = 0; i < 5; i++) 
        {
            if (array[i] == num1)
            {
                found1 = true;
            }
            if (array[i] == num2)
            {
                found2 = true;
            }
        }
        if (found1 && found2)
        {
            System.out.println("It's Bingo");
        } else {
            System.out.println("Not found");
        }

        scanner.close();
    }
}
