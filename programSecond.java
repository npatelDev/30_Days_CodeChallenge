package com.colloectionList.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class programSecond {
	public static void main(String[] args) {
		
		//iterate an ArrayList using Integer. 
		
		ArrayList<Integer> integ=new ArrayList<>();
		
		integ.add(101);
		integ.add(102);
		integ.add(103);
		integ.add(104);
		integ.add(105);
		
		System.out.println("List of student RollNumber Cleared Test :");
		
		integ.remove(1);
		integ.remove(3);
		
		//Iterator method
		Iterator<Integer> num= integ.iterator();
		while(num.hasNext()) {
			System.out.println(num.next());
		}
	}
}
