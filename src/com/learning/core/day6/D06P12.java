package com.learning.day6;
import java.util.Hashtable;
import java.util.Scanner;

class StaffMember 
{
    private int id;
    private String name;
    private String department;
    private String designation;

    public StaffMember(int id, String name, String department, String designation) 
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
        StaffMember employee = (StaffMember) obj;
        return id == employee.id;
    }
}
public class D06P12 
{

  public static void main(String[] args)
  {
        StaffMember s1 = new StaffMember(1001, "Daniel", "L&D", "Analyst");
        StaffMember s2 = new StaffMember(1002, "Thomas", "Testing", "Tester");
        StaffMember s3 = new StaffMember(1003, "Robert", "Development", "Product Manager");
        StaffMember s4 = new StaffMember(1004, "Grace", "Tech Support", "");
        Hashtable<Integer, StaffMember> staffTable = new Hashtable<>();
        staffTable.put(s1.getId(), s1);
        staffTable.put(s2.getId(), s2);
        staffTable.put(s3.getId(), s3);
        staffTable.put(s4.getId(), s4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new staff member details in the format: id name designation department");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int newId = Integer.parseInt(parts[0]);
        if (!staffTable.containsKey(newId)) 
        {
            String newName = parts[1];
            String newDesignation = parts[2];
            String newDepartment = parts[3];
            StaffMember newStaffMember = new StaffMember(newId, newName, newDepartment, newDesignation);
            staffTable.put(newId, newStaffMember);
            System.out.println("Staff member added successfully.");
        } 
        else 
        {
            System.out.println("Staff member with the given id already exists.");
        }
        System.out.println("Current Staff Members:");
        for (StaffMember staff : staffTable.values()) 
        {
            System.out.println(staff);
        }
    }
}