package com.nitesh1.copyListToArrayList;

import java.util.List;
import java.util.ArrayList;

public class copyListToArrayList {

	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<>();
		lista.add("Hari");
		lista.add("Mohan");
		lista.add("Prasad");
		lista.add("Monty");
		
		for(String lista1:lista) {
			System.out.println(lista1);
		}
		List<String> listb=new ArrayList<>();
		listb.add("Mayank");
		listb.add("Raju");
	
		
		lista.addAll(listb);
		System.out.println(lista);
	}
}



