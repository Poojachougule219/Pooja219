package calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Library library=new Library();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n--- Library Menu ---");
			System.out.println("1. Add Book");
			System.out.println("2.Register Book");
			System.out.println("3.Show Books");
			System.out.println("4.Issue Book");
			System.out.println("5.Return Book");
			System.out.println("6.Exit");
			System.out.println("Enter Choice:");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter book id:");
					int bookId=sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter book title:");
					String title=sc.nextLine();
					
					System.out.println("Enter author:");
					String author=sc.nextLine();
					
					library.addBook(new Book(bookId, title, author));
					break;
					
				case 2:
					System.out.println("Enter user id:");
					int userId=sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter user name:");
					String name=sc.nextLine();
					
					library.registerUser(new User(userId, name));
					break;
					
				case 3:
					library.showBooks();
					break;
					
				case 4:
					System.out.println("Enter book id to issue:");
					int issueId=sc.nextInt();
					library.issueBook(issueId);
					break;
					
				case 5:
					System.out.println("Enter book id to return:");
					int returnId=sc.nextInt();
					library.returnBook(returnId);
					break;
					
				case 6:
					System.out.println("Exiting...");
					sc.close();
					return;
				
				default:
					System.out.println("Invalid Choice:");
			}
		}
	}

}
