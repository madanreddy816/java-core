package com.learning.day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class D05P05
{
	public static void main(String[]args)
	{
		HashSet<Product> hs=new HashSet<Product>();
		
		Product p1=new Product("P001","Maruthi 800");
		Product p2=new Product("P002","Maruthi Zen");
		Product p3=new Product("P003","Maruthi Dezire");
		Product p4=new Product("P004","Maruthi Alto");
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ProductId to remove: ");
        String productIdToRemove = scanner.nextLine();
        Iterator<Product> iterator = hs.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(productIdToRemove)) {
                iterator.remove();
                removed = true;
                break; // Found and removed the product, no need to continue iterating
            }
        }
        System.out.println("Product after removal:");
        for (Product product : hs) {
            System.out.println(product);
        }
    }		
}

