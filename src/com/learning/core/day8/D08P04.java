package com.learning.day8;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P04
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Queue<String> queue = new LinkedList<>();
		System.out.print("Enter elements separated by spaces: ");
		String input = scanner.nextLine();
	    if (input.trim().isEmpty()) 
	    {
	    	System.out.println("Empty");
	    } 
	    else 
	    {
	    	String[] elements = input.split(" ");
	    	for (String element : elements) 
	    	{
	    		queue.add(element);
	    	}
	    	if (queue.isEmpty()) 
	    	{
	    		System.out.println("Empty");
	    	} 
	    	else 
	    	{
	    		System.out.println("Not Empty");
	    	}
	    }
	}
}
