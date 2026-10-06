package LibraryManagementSystem;
import java.util.*;
public class Book {
	private String title;
	private String author;
	private int pages;
	
	Book (String title, String author, int pages){
		this.title=title;
		this.author=author;
		this.pages=pages;
	}
	void displayInfo() {
		System.out.println("Title: " +title+ " | Author: "+author+ " | Pages: " +pages );
	}
	
	public String getTitle() {
		return title;
		
	}
	public String getAuthor() {
		return author;
	}
	public int getPages() {
		return pages;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPages(int pages) {
		this.pages=pages;
	}
}
