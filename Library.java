package calculator;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books;
	private List<User> users;
	
	
	public Library()
	{
		books=new ArrayList<>();
		users=new ArrayList<>();
	}
	
	public void addBook(Book book)
	{
		books.add(book);
		System.out.println("Book added successfully.");
	}
	
	public void registerUser(User user)
	{
		users.add(user);
		System.out.println("User registered successfully.");
	}
	
	public void showBooks()
	{
		System.out.println("\n Available Books:");
		for(Book book:books)
		{
			System.out.println(book);
		}
	}
	
	public void issueBook(int bookId)
	{
		for(Book book:books)
		{
			if(book.getId()==bookId && !book.isIssued())
			{
				book.issueBook();
				System.out.println("Book issued successfully");
				return;
			}
		}
		System.out.println("Book not available");
	}
	
	public void returnBook(int bookId)
	{
		for(Book book:books)
		{
			if(book.getId() == bookId && book.isIssued())
			{
				book.returnBook();
				System.out.println("Book returned successfully.");
				return;
			}
		}
		
		System.out.println("Book not found or not issued.");
	}

}
