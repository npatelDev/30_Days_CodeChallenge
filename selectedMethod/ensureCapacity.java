package com.nitesh1.ArrayListToSubList;

import java.util.ArrayList;

public class ensureCapacity {
	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<>(3);
		lista.add("Hari");
		lista.add("Mohan");
		lista.add("Prasad");
		lista.add("Monty");
		
		lista.ensureCapacity(4);
		lista.add("Mayank");
		System.out.println(lista);
		//for(String lista1:lista) {
		//	System.out.println(lista1);
		//}
		
	
		
	}
}
