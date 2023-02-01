package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//List<dataType>arrayListName = new ArrayList<>();
		List<Object>array1 = new ArrayList<>();
		
		array1.add(10);
		array1.add("Selenium");
		array1.add('A');
		array1.add(10.123);
		
		/*
		System.out.println(array1.get(0));
		System.out.println(array1.get(1));
		System.out.println(array1.get(2));
		*/
		
		for(int i=0;i<array1.size();i++)
		{
			System.out.println(array1.get(i));
		}
				
	}
	
}
