package com.learning.core.day10;
import java.io.*;
import java.util.ArrayList;

public class D10P03
{
    public static void main(String[] args) 
    {
        ArrayList<Student> students = readStudentsFromFile("Students.dat");
        if (students != null) {
            for (Student student : students) 
            {
                System.out.println(student);
            }
        } 
        else
        {
            System.out.println("No records found.");
        }
    }
    private static ArrayList<Student> readStudentsFromFile(String fileName) 
    {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) 
        {
            ArrayList<Student> students = new ArrayList<>();
            while (true)
            {
                try 
                {
                    Student student = (Student) inputStream.readObject();
                    students.add(student);
                } 
                catch (EOFException e) 
                {
                    break;
                }
            }
            return students;
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            System.out.println("An error occurred while reading records from file.");
            e.printStackTrace();
            return null;
        }
    }
}
