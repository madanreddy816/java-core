package core.day1;

public class Books 
{
	 public static Book createBook(String title, double price) {
	        Book b= new Book();
	        b.setBookTitle(title);
	        b.setBookPrice(price);
	        return b;
	    }

	    public static void showBook(Book b) {
	        System.out.println("Book Title: " + b.getBookTitle() + " and Price: " + b.getBookPrice());
	    }
}
