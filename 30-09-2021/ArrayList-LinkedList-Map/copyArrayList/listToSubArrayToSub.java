package com.nitesh1.ArrayListToSubList;

import java.util.List;
import java.util.ArrayList;

public class listToSubArrayToSub {

	public static void main(String[] args) {
		
			ArrayList<String> lista=new ArrayList<>();
			lista.add("Hari");
			lista.add("Mohan");
			lista.add("Prasad");
			lista.add("Monty");
			lista.add("Mayank");
			lista.add("Raju");
			
			System.out.println(lista);
			ArrayList<String> listb=new ArrayList<>(lista.subList(1, 3));
				System.out.println("SubList Stored in ArrayList :"+ listb);
		
				List<String> listc= new ArrayList<>(lista.subList(2, 4));
			System.out.println("SubList Stored in List :"+listc);
		}
	


	}

