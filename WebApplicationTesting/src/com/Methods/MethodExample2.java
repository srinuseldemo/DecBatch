package com.Methods;

public class MethodExample2 {
	
	// Global Variables
	int var1=30;
	int var2=20;
	
	public void addition()  // User defined Method
	{
		// local variable
		int var1=30;
		int var2=20;
		int var3;
		
		var3=var1+var2;
System.out.println(" The value of the variable var3 after addition is :-"+var3);
	}
	
	public static void main(String[] args) {
		
		// Creating an Object for the current class
		MethodExample2 m2 = new MethodExample2();
m2.addition(); // using the object created - calling the User defined Methods
				
		m2.subtraction();
		m2.multiplication();
		
		// calling the same addition user defined method again
		m2.addition(); 
		
	}
	
	public void subtraction()
	{
		int var1=30;
		int var2=20;
		int var3;
		var3=var1-var2;
System.out.println(" The value of the variable var3 after subtraction is :-"+var3);
	}

	public void multiplication()
	{
		int var3;
		var3=var1*var2;
System.out.println(" The value of the variable var3 after multiplication is :-"
														+var3);
	}
}
