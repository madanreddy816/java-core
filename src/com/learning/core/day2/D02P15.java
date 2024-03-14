package com.learning.day2;

import java.util.Scanner;

public class D02P15 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value of N: ");
            int N = sc.nextInt();

            System.out.print("Enter " + N + " numbers separated by space: ");
            double[] numbers = new double[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = sc.nextDouble();
            }

            int positive = 0;
            int negative = 0;
            int zero = 0;

            for (double num : numbers) {
                if (num > 0) {
                    positive++;
                } else if (num < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }

            System.out.println("\nNumber of positive numbers: " + positive);
            System.out.println("Number of negative numbers: " + negative);
            System.out.println("Number of zeros: " + zero);

            sc.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}


