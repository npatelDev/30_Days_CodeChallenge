package com.BookData.Book;

public class Book {
	 public int BookId;
	 public String BookName;
	 public String BookAuthor;
	 public String BookPublisher;
	 public int BookQuantity;
	public Book(int bookId, String bookName, String bookAuthor, String bookPublisher, int bookQuantity) {
		super();
		BookId = bookId;
		BookName = bookName;
		BookAuthor = bookAuthor;
		BookPublisher = bookPublisher;
		BookQuantity = bookQuantity;
	}
	
	
}
