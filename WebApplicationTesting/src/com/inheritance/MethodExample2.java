package com.inheritance;

public class MethodExample2 extends MethodExample1{
	private void subtraction() // Method withOut Parameters
	{
		int var1=10;
		int var2=5;
		int var3;
		
		var3=var1-var2;
	System.out.println(" The value of the variable var3 after subtraction is:- "
																+var3);	
	}
	
	protected void subtraction(int var1,int var2) // Method with Parameters
	{
		int var3;
		
		var3=var1-var2;
	System.out.println(" The value of the variable var3 after subtraction is:- "
																+var3);	
	}
	public static void main(String[] args) {
		
		MethodExample2 m2 = new MethodExample2();
		m2.subtraction();
		
		m2.addition();
				
		/*
		MethodExample1 m1 = new MethodExample1();
		m1.addition();
		*/
				
	}
	
}
