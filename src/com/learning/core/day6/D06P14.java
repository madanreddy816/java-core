package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
class Employee4
{
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee4(int id, String name, String department, String designation) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() 
    {
        return id;
    }

    @Override
    public String toString()
    {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() 
    {
        return id;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee4 Employee4 = (Employee4) obj;
        return id == Employee4.id;
    }
}
public class D06P14 
{

  public static void main(String[] args) 
  {
        Hashtable<Integer, Employee4> Employee4Table = new Hashtable<>();
        Employee4Table.put(1001, new Employee4(1001, "Grace", "Tech Support", "HR"));
        Employee4Table.put(1002, new Employee4(1002, "Robert", "Product Manager", "development"));
        Employee4Table.put(1003, new Employee4(1003, "Thomas", "Tester", "Testing"));
        Employee4Table.put(1004, new Employee4(1004, "Daniel", "Analyst", "L&D"));
        Hashtable<Integer, Employee4> currentCollection = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Employee4 details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            currentCollection.put(id, new Employee4(id, name, department, designation));
            System.out.print("Do you want to add another Employee42? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) 
            {
                break;
            }
        }
        Employee4Table.putAll(currentCollection);
        System.out.println("Employee42 details added successfully!");
        System.out.println("Employee42 Table:");
        for (Map.Entry<Integer, Employee4> entry : Employee4Table.entrySet()) 
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
