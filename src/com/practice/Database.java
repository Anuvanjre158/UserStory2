package com.practice;


import java.util.Iterator;
import java.util.TreeSet;


public class Database {


	TreeSet<Book> intSet;
	public Database() {
		intSet = new TreeSet<Book>();
		
		Book book1 = new Book(1,"C","Mr.Yashwant",350);
		Book book2 = new Book(2,"Code","Robert",550);
		Book book3 = new Book(3,"Algorithm","Charles",750);
		Book book4 = new Book(4,"Python","Mark",450);
		
		intSet.add(book1);
		intSet.add(book2);
		intSet.add(book3);
		intSet.add(book4);
	}
	
	public void viewAll() {
		
		  Iterator<Book> itr = intSet.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		
				
	}
	
	
	public Book viewByName(String name) {
		for(Book b : intSet) 
		  { 
			  if(b.title.equals(name)){ 
				   return b;
				  }
			  }
		return null;
	}
	
	  public void insert(Book b2) {
			
			 intSet.add(b2);
			 System.out.println("Data Inserted..");
			  
		  }
		  
	  public boolean delete(int id) {
		  Iterator<Book> itr = intSet.iterator();
			while(itr.hasNext()) {
				Book btemp=itr.next();
				if (btemp.bookId==id) {
					itr.remove();
					System.out.println("Book Deleted");
					return true;
				}		
			}
				System.out.println("No book available");
				return false;
		  }
		  
		  public void update(int id2,double price1) {
			  Iterator<Book> itr = intSet.iterator();
				while(itr.hasNext()) {
					Book btemp=itr.next();
					if (btemp.bookId==id2) {
						
						String title1=btemp.title;
						String author1=btemp.author;
						itr.remove();
						 Book b=new Book(id2,title1,author1,price1);
						 intSet.add(b);
						
						System.out.println("Details Updated");
				}
				
			}
			  
	  }

		
}
