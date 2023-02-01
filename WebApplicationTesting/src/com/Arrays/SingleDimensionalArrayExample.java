package com.Arrays;

public class SingleDimensionalArrayExample {
	
	public static void main(String[] args) {
		
		// Syntax: -SingleDimensionalArray
		//dataType arrayName[] = new dataType[Size]
		
		int array1[] = new int[4];
		
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		*/
		
//for(int index=0;index<=3;index++) // Printing all the values of an Array
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(index+" - "+array1[index]);
		}
		
		// Array should be declared with the dataType 
		
		// Array should be declared with the size - the size is fixed at the
		// time of creating an Array
		
		// Array accepts Similar dataType values
		
		// Array index always starts with 0
		
		// When an Array is created - Array will be created with Memory index's
		
// Array cannot be store with an extra value more than the size declared - it
	// throws an exception as ArrayIndexOut of Bounds Exception
		
// If we want to save an extra value into the array then the size of the array
// should be changed		
				
	}

}
