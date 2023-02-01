package com.Arrays;

public class MultiDimensionalArrayExample {
	
	public static void main(String[] args) {
		
		// Syntax
		// dataType arrayName[][] = new dataType[size][size]
		
		String array1[][] = new String[2][2];
		
		array1[0][0] = "Venkat Sir";
		array1[0][1] = "Manual Testing";
		
		array1[1][0] = "Srini";
		array1[1][1] = "Automation";
		
		
		for(int rowIndex=0;rowIndex<=1;rowIndex++) // to go every Row
		{
			
		// to goto Every row of all the Columns
			for(int rowOfColumnIndex=0;rowOfColumnIndex<=1;rowOfColumnIndex++)
			{
				System.out.print(array1[rowIndex][rowOfColumnIndex]+"  ");
			}
			System.out.println();
			
		}
		
		//System.out.println(array1[0][0]);
			
	}

}
