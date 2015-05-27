package Library;

import java.util.Scanner;


public class Library {
	static int maxCustomers = 100;
	static int maxBooks = 100;
	static int lastBook = 0;
	static Customer[] customers = new Customer[maxCustomers];
    static Book[] books = new Book[maxBooks];
    static int answer = 0;
    
	//Create a scanner object each for text and numbers
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		//Initialize Books
		
		for (int i = 0; i < books.length; i++)
			books[i] = new Book();
		
		//Add the books
		addBooks();
		
		//Menu
		menu();

		
	}
	
	private static void menu()
	{
		//The Main Menu
		do
		{
			System.out.println("What would you like to do?");
			System.out.println("1 display books");
			System.out.println("2 checkout a book");
			System.out.println("3 checkin a book");
			System.out.println("4 add a customer");
			System.out.println("5 add books");
			answer = nInput.nextInt();
			
			if (answer == 1)
				{
				System.out.println(lastBook);
				displayBooks();
				}
			else if (answer == 2)
				checkout();
			else if (answer == 3)
				checkin();
			else if (answer == 4)
				addCustomer();
			else if (answer == 5)
				addBooks();
					
		}while (answer != 0);
		
	}
	
	private static int findBook()
	{
		int i;
		System.out.println("Which book");
		String t = tInput.nextLine();
		System.out.println(lastBook);
		for (i = 0; i < lastBook; i++)
		{
			if (books[i].getTitle().toLowerCase().equals(t.toLowerCase()))
				return i;
			System.out.println(i);
		}
		return 0;
		
	}
	
	private static void addCustomer()
	{
		
	
	} 
	
	private static void checkout()
	{
		int bookI = findBook();
		if (bookI!=0)
		{
			books[bookI].checkOut(1);
			System.out.println(books[bookI].getTitle() + " is now checked out");
		}
		else
			System.out.println("The book wasn't found.");
			
		
	}
	
	private static void checkin()
	{
		
		
	}
	private static void addBooks()
	{
		System.out.println("How many books do you want to enter?");
		int numBooks = nInput.nextInt();
		
		int b = 0;
		
		for (b = 0; b < books.length && !books[b].getTitle().equals(""); b++)
		{
			
		}
		lastBook = b;
		System.out.println(lastBook);
		
		for (int i = lastBook; i < numBooks+lastBook && i < maxBooks; i++ )
		{
			System.out.println("Enter a book name");
			books[i].setTitle(tInput.nextLine());
			System.out.println("the Author?");
			books[i].setAuthor(tInput.nextLine());
			
		}
		lastBook = b+numBooks;

	}
	
	private static void displayBooks()
	{
		for (int i = 0; i < lastBook; i++ )
		{
			System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor() + " " + books[i].getCheckedOut());
		}
		

	}

}
