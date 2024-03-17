package com.learning.core.day6;
import java.text.SimpleDateFormat;
import java.util.*;

class Book implements Comparable<Book> 
{
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;

    public Book(int bookId, String title, double price, String author, Date publicationDate) 
    {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() 
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(publicationDate);
        
        return bookId + " " + title + " $" + price + " " + author + " " + formattedDate;
    }


    @Override
    public int hashCode() 
    {
        return Objects.hash(bookId, title, price, author, publicationDate);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publicationDate, book.publicationDate);
    }

    @Override
    public int compareTo(Book otherBook) 
    {
        return Integer.compare(this.bookId, otherBook.bookId);
    }
}

public class D06P03 
{
    public static void main(String[] args) 
    {
        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book(1001, "Python learning", 715.0, "Martin C.Brown", new Date(120, 1, 2)));
        bookSet.add(new Book(1002, "Modern mainframe", 295.0, "Sharad", new Date(97, 4, 19)));
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23)));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19)));
        bookSet.add(new Book(1005, "Net Platform", 3497.0, "Mark J Price", new Date(84, 2, 6)));
        System.out.println("Book Details:");
        for (Book book : bookSet) 
        {
            System.out.println(book);
        }
    }
}
