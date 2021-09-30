package com.nitesh1.copyArrayList;
import java.util.ArrayList;
public class ArrayListToArrayList {

		//Java ArrayList addAll(Collection c) Method example
		
		public static void main(String[] args) {
			ArrayList<String> lista=new ArrayList<>();
			lista.add("Hari");
			lista.add("Mohan");
			lista.add("Prasad");
			lista.add("Monty");
			
			for(String lista1:lista) {
				System.out.println(lista1);
			}
			ArrayList<String> listb=new ArrayList<>();
			listb.add("Mayank");
			listb.add("Raju");
		
			
			lista.addAll(listb);
			System.out.println(lista);
		}
	}



