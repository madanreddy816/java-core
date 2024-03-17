package com.learning.core.day4;
import java.util.Scanner;
import java.util.Scanner; 
class NegativeAmount extends Exception  
{ 
 public NegativeAmount(String message)  
 { 
     super(message); 
 } 
} 
class LowBalanceException extends Exception  
{ 
 public LowBalanceException(String message) 
 { 
     super(message); 
 } 
} 
class BankAccount  
{ 
 private int accNo; 
 private String custName; 
 private String accType; 
 private float balance; 
 public BankAccount(int accNo, String custName, String accType, float balance) throws LowBalanceException, NegativeAmount { 
     this.accNo = accNo; 
     this.custName = custName; 
     this.accType = accType; 
     if (accType.equalsIgnoreCase("savings") && balance < 1000) 
     { 
         throw new LowBalanceException("Minimum balance for savings account is 1000"); 
     } else if (accType.equalsIgnoreCase("current") && balance < 5000) 
     { 
         throw new LowBalanceException("Minimum balance for current account is 5000"); 
     } 
     if (balance < 0)  
     { 
         throw new NegativeAmount("Balance cannot be negative"); 
     } 
     this.balance = balance; 
 } 
 public void deposit(float amt) throws NegativeAmount 
 { 
     if (amt < 0) { 
         throw new NegativeAmount("Amount cannot be negative"); 
     } 
     balance += amt; 
     System.out.println("Amount deposited successfully. Updated balance: " + balance); 
 } 
 
 public float getBalance() throws LowBalanceException  
 { 
     if (accType.equalsIgnoreCase("savings") && balance < 1000)  
     { 
         throw new LowBalanceException("Low balance for savings account"); 
     } else if (accType.equalsIgnoreCase("current") && balance < 5000) 
     { 
         throw new LowBalanceException("Low balance for current account"); 
     } 
     return balance; 
 } 
} 
 
public class D04P01 
{ 
 public static void main(String[] args)  
 { 
     Scanner sc = new Scanner(System.in); 
     try  
     { 
         System.out.println("Enter account number:"); 
         int accNo = sc.nextInt(); 
         sc.nextLine();
         System.out.println("Enter customer name:"); 
         String custName = sc.nextLine(); 
         System.out.println("Enter account type (savings/current):"); 
         String accType = sc.nextLine(); 
         System.out.println("Enter initial balance:"); 
         float balance = sc.nextFloat(); 
         if (balance < 0) 
         { 
             throw new NegativeAmount("Initial balance cannot be negative"); 
         } 
         BankAccount account = new BankAccount(accNo, custName, accType, balance); 
         float currentBalance = account.getBalance(); 
         System.out.println("Current balance: " + currentBalance); 
     }  
     catch (LowBalanceException e)  
     { 
         System.out.println("LowBalance"); 
     }  
     catch (NegativeAmount e) 
     { 
         System.out.println("NegativeAmount"); 
     }  
     finally  
     { 
 
     } 
 } 
}
