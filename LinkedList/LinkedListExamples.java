package com.LinkedList.project;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples {

	public static void main(String[] args) {
		
		LinkedList<String> student=new LinkedList<>();
		
		student.add("Pawan");
		student.add("Praveen");
		student.add("Raju");
		student.add("Shivam");
		student.add("pintu");
		student.add("Gaurav");
		student.add("Arun");
		student.add("Amit");
		student.add("Nilesh");
		student.add("Nitesh");
		
		
		//remove first and last
		student.removeFirst();
		student.removeLast();
		
		//remove at particular location
		student.remove(7);
		student.remove(4);
		
		//remove firstOccorence and LastOccorence
		student.removeFirstOccurrence(student);
		student.removeLastOccurrence(student);
		
		LinkedList<String> student2=new LinkedList<>();
		student2.add("Sanju");
		student2.add("Jagdish");
		student2.add("Vkas");
		student2.add("Vishal");
		student2.add("Pawan");
		
		//addAll to list 2
		student.addAll(student2);
		
		System.out.println("Final list :"+student);
		
		System.out.println(student2);
		
	
	Iterator<String> i=student.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
		
	}
}
