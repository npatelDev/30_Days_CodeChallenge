package com.nitesh1.ArrayListToSubList;

import java.util.ArrayList;

public class CloneMethod {
	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<>();
		lista.add("Hari");
		lista.add("Mohan");
		lista.add("Prasad");
		lista.add("Monty");
		lista.add("Mayank");
		
		System.out.println(lista);
		
		 
		@SuppressWarnings("unchecked")
		ArrayList<String> listb =(ArrayList<String>)lista.clone();
		System.out.println("Shallow Copy of ArrayList"+listb);
		
		lista.add("Rahul");
		lista.remove("Mohan");
		
		System.out.println("Orignal ArrayList  :"+lista);
		System.out.println("After clone Method :"+listb);
		
		
	
		
	}
}
