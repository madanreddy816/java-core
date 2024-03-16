package com.learning.day10;
import java.io.IOException;
import java.nio.file.*;
public class D10P04 
{
    public static void main(String[] args) 
    {
        Path sourcePath = Paths.get("C:\\Users\\DELL\\Desktop\\Java_Practise\\java_core\\src\\com\\learning\\day10\\source.txt");
        Path destPath = Paths.get("C:\\Users\\DELL\\Desktop\\Java_Practise\\java_core\\src\\com\\learning\\day10\\destination.txt");
        try 
        {   
            Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } 
        catch (IOException e) 
        {
            System.err.println("Error occurred while copying file: " + e.getMessage());
        }
    }
}
