package com.BookData.Main;

import java.util.LinkedList;

import com.BookData.Book.Book;

public class MainBook {
	public static void main(String[] args) {
		
		//creating Books
		LinkedList<Book> list=new LinkedList<Book>();
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		//adding books
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
	for(Book b:list) {
		System.out.println(b.BookId+", "+b.BookName+" ,"+b.BookAuthor+" ,"+b.BookPublisher+", "+b.BookQuantity);
	}
		
	}
}
