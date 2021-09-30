package com.colloectionList.ListDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
public class programThird {
		
			//iterate an ArrayList using Enumeration.
			//Interface Enumeration<E>
	public static void main(String[] args) {
		
	
	ArrayList<String> enumer= new ArrayList<>();
	
	enumer.add("C Language");
	enumer.add("C++ Language");
	enumer.add("Java Language");
	enumer.add(".Net Language");
	enumer.add("C# Language");
	enumer.add("Php Language");
	
	  // Get the Enumeration object
	Enumeration<String> e = Collections.enumeration(enumer);
	System.out.println("ArrayList Elements");
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	}	
}
