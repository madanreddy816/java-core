package core.day1;

public class D01P01 
{
	public static void main(String[] args) 
	{
        String title = "Java Programming";
        double price = 350.00;


        Book book = Books.createBook(title, price);

        Books.showBook(book);
    }
}
