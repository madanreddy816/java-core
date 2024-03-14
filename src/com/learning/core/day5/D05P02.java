package com.learning.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D05P02
{
	public static void main(String[]args)
	{
		ArrayList<String> al=new ArrayList();
		System.out.println("Enter the names ");
		Scanner sc=new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		for(String name:input)
		{
			al.add(name);
		}
		System.out.println(al);
		System.out.println("Enter the name to search");
		String search=sc.nextLine();
		if (al.contains(search)) {
            System.out.println( "Found");
        } else {
            System.out.println(" Not found");
        }
	}
}
