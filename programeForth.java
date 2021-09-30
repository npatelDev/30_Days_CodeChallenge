package com.colloectionList.ListDemo;
import java.util.ArrayList;
import java.util.Collections;
public class programeForth {
	//Sorting of Alphanumeric and Integer value
	//Both ascending and descending order
	
	public static void main(String[] args) {
		
	
	ArrayList<String> fruits=new ArrayList<>();
	
	fruits.add("Oranges");
	fruits.add("Bananas");
	fruits.add("Mangoes");
	fruits.add("Pinnepales");
	fruits.add("Apple");
	
	// Sorting in Ascending order
	System.out.println("Sorting of String in ascending order\n");
	Collections.sort(fruits);
	for(String fruitsList:fruits) {
	System.out.println(fruitsList);
	}
	System.out.println("Sorting of String in descending order\n");
	// Sorting in descending order
	
		Collections.reverse(fruits);
		for(String fruitsList:fruits) {
		System.out.println(fruitsList);
		}
	
	System.out.println("Below Sorting of Integer");
	
	ArrayList<Integer> num=new ArrayList<>();
	
	num.add(10);
	num.add(500);
	num.add(60);
	num.add(45);
	num.add(35);
	num.add(23);
	num.add(43);
	num.add(56);
	num.add(76);
	num.add(5);
	num.add(4);
	num.add(0);
	
	System.out.println("Sorting of Integer in ascending order\n");
	// Sorting in ascending order
	Collections.sort(num);
	for(int intNum:num) {
	System.out.println(intNum);
	}
	
	System.out.println("Sorting of Integer in descending order\n");
	// Sorting in descending order
	Collections.reverse(num);
	for(int intNum:num) {
	System.out.println(intNum);
	}
	}
}
