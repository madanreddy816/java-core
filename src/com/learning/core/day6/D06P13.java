package com.learning.day6;
import java.util.Hashtable;

class EmployeeDetails 
{
    private int id;
    private String name;
    private String department;
    private String designation;

    public EmployeeDetails(int id, String name, String department, String designation) 
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
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
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
        EmployeeDetails employee = (EmployeeDetails) obj;
        return id == employee.id;
    }
}
public class D06P13 
{

  public static void main(String[] args)
  {
        EmployeeDetails e1 = new EmployeeDetails(1001, "Daniel", "L&D", "Analyst");
        EmployeeDetails e2 = new EmployeeDetails(1002, "Thomas", "Testing", "Tester");
        EmployeeDetails e3 = new EmployeeDetails(1003, "Robert", "Development", "Product Manager");
        EmployeeDetails e4 = new EmployeeDetails(1004, "Grace", "Tech Support", "");
        Hashtable<Integer, EmployeeDetails> employeeTable = new Hashtable<>();
        employeeTable.put(e1.getId(), e1);
        employeeTable.put(e2.getId(), e2);
        employeeTable.put(e3.getId(), e3);
        employeeTable.put(e4.getId(), e4);
        int numKeys = employeeTable.size();
        System.out.println("Number of keys in the hashtable: " + numKeys);
    }
}