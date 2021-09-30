package com.colloectionList.ListDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class alreadEmplementComparable {
		public static void main(String[] args) {
			//sorting arrays integer
			System.out.println("Sorting integer arrays");
			int[] arr=new int[] {2,4,6,5,0,10,8};
			Arrays.sort(arr);
			for(int list1:arr) {
				System.out.println(list1);
			}
			
			
			//sorting String ARRAY Already implements Comparable Interface
			System.out.println("Sorting String Arrays");
			String[] str=new String[] {"hari","Alpha","Numeric","Plant"};
			Arrays.sort(str);
			for(String list2:str) {
				System.out.println(list2);
			}
			
			//Sorting of simple arrayList implements comparable 
			
			List<String> fruits=new ArrayList<>();
			fruits.add("Mangoes");
			fruits.add("Bananas");
			fruits.add("Apples");
			Collections.sort(fruits);
			for(String list3:fruits) {
				System.out.println(list3);
			}
		}
}
