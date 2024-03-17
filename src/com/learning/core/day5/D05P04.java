package com.learning.core.day5;
import java.util.HashSet;
import java.util.Scanner;
public class D05P04 
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
        System.out.print("Enter P00 and then product ID without space: ");
        String ProductId = scanner.nextLine();
        System.out.print("Product Name : ");
        String ProductName = scanner.nextLine();

        searchProduct(ProductId, ProductName, hs);
	}
	private static void searchProduct(String ProductId, String ProductName, HashSet<Product> productSet) {
        Product searchProduct = new Product(ProductId, ProductName);

        if (productSet.contains(searchProduct)) {
            System.out.println("Product found");
        } else {
            System.out.println("Product not found");
        }
    }
}


