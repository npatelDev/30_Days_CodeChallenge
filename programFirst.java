package com.colloectionList.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class programFirst {
	public static void main(String[] args) {
		//creation of ArrayList 
		ArrayList<String> student=new ArrayList<>();
		//Adding Students in object
		student.add("Ravi sits on Second row");
		student.add("Hari sits on first row");
		student.add("Mohan sits on third row second column");
		student.add("Mayank");
		student.add("Nitesh");
		
		//adding at index position of arrayList
		student.add(5,"Ashish;");
		
		//Replace the position by set method
		student.set(4, "Vijay");
		
		System.out.println("List printed after updated  :");
		
		//Replace the position by set method
				student.remove(1);
				
		System.out.println("List printed with for loop  :");
		
		//Display list with loop
		System.out.println(student);
		
		//using  for loop to ArrayList
		for(int i=0; i<student.size(); i++) {
			
			//Display list with forLoop
			System.out.println(student.get(i));
		}
		System.out.println("List printed with While loop  :");
		//Display list using whileLoop
		int i=0;
		while(i<student.size()) {
			System.out.println(student.get(i));
			i++;
		}
		
		System.out.println("List printed with Advance For loop  :");
		//Display list using Advance forLoop
		
		for(String list:student){
			System.out.println(list);
		}
		
		//Looping ArrayList using Iterator
		System.out.println("List printed with Iterator  :");
		Iterator<String> iter = student.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
	}
		
		
	}
}
