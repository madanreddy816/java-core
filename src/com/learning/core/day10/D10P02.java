package com.learning.core.day10;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class BlankFieldException extends Exception 
{
    public BlankFieldException(String message) 
    {
        super(message);
    }
}

class InvalidDataException extends Exception 
{
    public InvalidDataException(String message)
    {
        super(message);
    }
}

class Student implements Serializable 
{
    private static final long serialVersionUID = 1L;

    private int rollNumber;
    private String name;
    private int age;
    private String address;

    public Student(int rollNumber, String name, int age, String address) 
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() 
    {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

public class D10P02 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) 
        {
            try 
            {
                System.out.println("Enter student details (Roll Number, Name, Age, Address): ");
                int rollNumber = getIntInput("Roll Number: ", scanner);
                String name = getStringInput("Name: ", scanner);
                int age = getIntInput("Age: ", scanner);
                String address = getStringInput("Address: ", scanner);
                students.add(new Student(rollNumber, name, age, address));
                System.out.println("Do you want to add another student? (yes/no): ");
                String choice = scanner.next().toLowerCase();
                if (!choice.equals("yes")) 
                {
                    break;
                }
            } 
            catch (InvalidDataException | BlankFieldException e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); 
            }
        }
        System.out.print("Do you want to write the data to file? (yes/no): ");
        String writeToFileChoice = scanner.next().trim().toLowerCase();
        if (writeToFileChoice.equals("yes")) 
        {
            writeStudentsToFile(students);
        }

        scanner.close();
    }

    private static int getIntInput(String prompt, Scanner scanner) throws InvalidDataException {
        System.out.print(prompt);
        try {
            int input = Integer.parseInt(scanner.next());
            if (input < 0) 
            {
                throw new InvalidDataException("Invalid input. Age and Roll Number should be positive integers.");
            }
            return input;
        }
        catch (NumberFormatException e) 
        {
            throw new InvalidDataException("Invalid input. Age and Roll Number should be numeric.");
        }
    }

    private static String getStringInput(String prompt, Scanner scanner) throws BlankFieldException 
    {
        System.out.print(prompt);
        String input = scanner.next();
        if (input.trim().isEmpty()) 
        {
            throw new BlankFieldException("Field cannot blank.");
        }
        return input;
    }

    private static void writeStudentsToFile(ArrayList<Student> students) 
    {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students.dat"))) 
        {
            for (Student student : students) 
            {
                outputStream.writeObject(student);
            }
            System.out.println("Records saved to file.");
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing records to file.");
            e.printStackTrace();
        }
    }
}
