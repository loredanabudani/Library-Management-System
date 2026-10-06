package LibraryManagementSystem;
import java.util.*;
public class LibraryManagementSystem {
	//add book
	static void addBook(ArrayList<Book>books,Scanner sc) {
		System.out.println("Add book title: ");
		String title=sc.nextLine();
		System.out.println("Add book author: ");
		String author=sc.nextLine();
		System.out.println("Add number of pages:");
		int pages=Integer.parseInt(sc.nextLine());
		books.add(new Book(title,author,pages));
		System.out.println("Book added successfully!");
	}
	//display all the books
	static void displayBook(ArrayList<Book> books) {
		if(books.isEmpty()) {
			System.out.println("The library is empty.");
		}
		else {
			System.out.println("All Books: ");
			for(int i=0;i<books.size();i++) {
				books.get(i).displayInfo();
			}
		}
	}
	//search for a book
	static void searchBooks(ArrayList<Book> books,Scanner sc) {
		System.out.println("Write the book title you are searching: ");
		boolean find=false;
		String searchTitle=sc.nextLine();
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getTitle().equalsIgnoreCase(searchTitle)) {
			 find=true;
			 System.out.println("Book found!");
			 books.get(i).displayInfo();
			 break;
			}
		}if(!find) {
			System.out.println("Book not found!");
		} 
		
	}
	//Delete a book
	static void deleteBook(ArrayList<Book> books,Scanner sc) {
		System.out.println("Write the book title you want to delete:");
		boolean findToDelete=false;
		String deleteTitle=sc.nextLine();
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getTitle().equalsIgnoreCase(deleteTitle)) {
				findToDelete=true;
				books.remove(i);
				System.out.println("Book deleted successfully!");
				break;
			}
			}
		if(!findToDelete) {
				System.out.println("Book not found!");
			
		}
		
	}
	//most pages
	static void findBookWithMostPages(ArrayList<Book> books) {
		if(books.isEmpty()) {
			System.out.println("The library is empty.");
		}else {
		System.out.println("Book with the most pages: ");
		Book maxPages=books.get(0);
		for(int i=1;i<books.size();i++) {
			if(books.get(i).getPages()>maxPages.getPages()) {
				maxPages=books.get(i);
			}
		}
		maxPages.displayInfo();
		}	
	}
	//Average nr of pages
	static void averagePages(ArrayList<Book> books) {
		if(books.isEmpty()) {
			System.out.println("The library is empty.");
		}else {
	    int total=0;
	    for(int i=0;i<books.size();i++) {
	    	total+=books.get(i).getPages();
	    }
	    double average=(double)total/books.size();
	    System.out.println("Average number of pages: " +average);
	    }
	}
	
	//edit book
	static void editBook(ArrayList<Book> books, Scanner sc) {
		System.out.println("Write the title of the book you want to edit.");
	    boolean findToEdit=false;
	    String searchTitle=sc.nextLine();
	    for(int i=0;i<books.size();i++) {
	    	if(books.get(i).getTitle().equalsIgnoreCase(searchTitle)) {
	    		findToEdit=true;
	    		System.out.println("Book found.Write the new title: ");
	    		String newTitle=sc.nextLine();
	    		books.get(i).setTitle(newTitle);
	    		System.out.println("Write the new author:");
	    		String newAuthor=sc.nextLine();
	    		books.get(i).setAuthor(newAuthor);
	    		System.out.println("Write the new number of pages:");
	    		int newPages=Integer.parseInt(sc.nextLine());
	    		books.get(i).setPages(newPages);
	    		System.out.println("Book updated successfully!");
	    		break;
	    	}
	    }if (!findToEdit) {
	        System.out.println("Book not found!");
	    }
	}
	
	public static void main(String args[]) {
		ArrayList <Book> books= new ArrayList<> ();
		Scanner sc= new Scanner(System.in);
		boolean running=true;
		while(running) {
		System.out.println("====LIBRARY MANAGEMENT SYSTEM====");
		System.out.println("1. Add Book");
		System.out.println("2. Display All Books");
		System.out.println("3. Search Book");
		System.out.println("4. Delete Book");
		System.out.println("5. Book with the Most Pages");
		System.out.println("6. Average Number of Pages");
		System.out.println("7. Edit Book.");
		System.out.println("8. Exit");
		
		System.out.println("Enter your choice: ");
		int choice=Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1: //add book
			addBook(books, sc);
		    break;
		case 2: //display all books
			displayBook(books);
			break;
		case 3: //Search book
			searchBooks(books,sc);
			break;
		case 4: //delete book
			deleteBook(books, sc);
			break;
		case 5: //most pages
			findBookWithMostPages(books);
			break;
			
		case 6:  //average nr of pages
			averagePages(books);
		    break;
		    
		case 7://edit book
			editBook(books,sc);
		    break;
		case 8: //exit
			System.out.println("Program exited. Goodbye! ");
			running=false;
			break;
			
			default:
				System.out.println("Invalid choice!");
		}
		
	}
		sc.close();
	}


}
