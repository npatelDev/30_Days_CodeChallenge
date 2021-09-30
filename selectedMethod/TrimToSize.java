package com.nitesh1.ArrayListToSubList;

import java.util.ArrayList;

//trimToSize() method is used for memory optimization. 
//It trims the capacity of ArrayList to the current list size. 
//For e.g. An arrayList is having capacity of 15 but there are only 5 
//elements in it, calling trimToSize() method on this ArrayList would
//change the capacity from 15 to 5.

public class TrimToSize {
	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<>(60);
		lista.add("Hari");
		lista.add("Mohan");
		lista.add("Prasad");
		lista.add("Mohan");
		lista.add("Monty");
		lista.add("Mohan");
		lista.add("Monty");
		lista.add("Prasad");
		lista.add("Monty");
		
		
		lista.ensureCapacity(4);
		lista.add("Mayank");
		lista.trimToSize();
		System.out.println(lista);
		//for(String lista1:lista) {
		//	System.out.println(lista1);
		//}
		
	
		
	}
}
