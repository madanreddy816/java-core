package com.learning.day6;

import java.text.SimpleDateFormat;
import java.util.*;

class Book1 implements Comparable<Book1> 
{
    private int Id;
    private String title;
    private double price;
    private Date dOp;
    private String author;

    public Book1() 
    {
    	
        super();
    }

    public Book1(int Id, String title, double price, Date dOp, String author) 
    {
        super();
        this.Id = Id;
        this.title = title;
        this.price = price;
        this.dOp = dOp;
        this.author = author;
    }

    public int getId() 
    {
        return Id;
    }

    public void setId(int Id)
    {
        this.Id = Id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public Date getdop() 
    {
        return dOp;
    }

    public void setdOfPubl(Date dOp) 
    {
        this.dOp = dOp;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(author, Id, dOp, price, title);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book1 other = (Book1) obj;
        return Objects.equals(author, other.author) && Id == other.Id && Objects.equals(dOp, other.dOp)
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
                && Objects.equals(title, other.title);
    }

    @Override
    public String toString() 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return Id + " " + title + " " + price + " " + author + "   " + sdf.format(dOp);
    }

    @Override
    public int compareTo(Book1 o) 
    {
        return this.Id - o.Id;
    }
}

public class D06P04
{
    public static void main(String[] args) 
    {
        TreeSet<Book1> b = new TreeSet<>(Comparator.comparing(Book1::getAuthor));

        b.add(new Book1(1001, "Python Learning", 715, new Date(120, 1, 2), "Martic C. Brown"));
        b.add(new Book1(1002, "Modern Mainframe", 295, new Date(97, 4, 19), "Sharad"));
        b.add(new Book1(1003, "Java Programming", 523, new Date(84, 10, 23), "Gilad Bracha"));
        b.add(new Book1(1004, "Read C++", 295, new Date(84, 10, 19), "Henry Harvin"));
        b.add(new Book1(1005, ".Net Platform", 3497, new Date(84, 2, 6), "Mark J. Price"));

        for (Book1 bk : b) 
        {
            System.out.println(bk);
        }
    }
}
