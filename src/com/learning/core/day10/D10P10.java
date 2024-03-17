package com.learning.core.day10;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
public class D10P10 
{
    Scanner sc = new Scanner(System.in);
    @Test(timeout = 2000)
    public void testName() 
    {
        assertTrue(User.validateUsername("Madan"));
    }
    @Test(timeout = 2000)
    public void testPassword() 
    {
        assertTrue(User.validatePassword("Madan816"));
    }
}
class User
{
    public static boolean validateUsername(String name) {
        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public static boolean validatePassword(String password) {
        String regex = "^(?=.*\\d)(?=.*[A-Za-z])[A-Za-z\\d]{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
