package com.Loops;

public class ForLoopExample2 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print( i+ "  " );
			}
			System.out.println();
		}
		
		System.out.println("  ********************  ");
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print( j+ "  " );
			}
			System.out.println();
		}
	}

}
