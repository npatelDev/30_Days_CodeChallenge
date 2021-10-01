package com.hashMap.test;

import java.util.HashMap;
import java.util.Map.Entry;
import com.hashMap.employee.Employee;

public class EmployeTest {
	public static void main(String[] args) {
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		Employee e1=new Employee("Tom","FrontEnd",24);
		Employee e2=new Employee("Steve","Admin",35);
		Employee e3=new Employee("John","FullStack",42);
		Employee e4=new Employee("Malik","BackEnd",28);
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
		
		//Traverse the HashMap
		
		for(Entry<Integer,Employee> m:emp.entrySet()) {
			int key=m.getKey();
			Employee e=m.getValue();
			
			System.out.println("Employee "+key+" "+"Info");
			
			System.out.println(e.name+" "+e.dept+" "+e.age);
		}
		
	}
}
