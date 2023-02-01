package com.Methods;

public class MethodsExample3 {
	
	// Global Variables
		int var1=30;
		int var2=20;
		
	private void subtraction()
	{
		int var1=30;
		int var2=20;
		int var3;
		var3=var1-var2;
System.out.println(" The value of the variable var3 after subtraction is :-"
																	+var3);
	}
	
	public static void main(String[] args) {
		
		MethodsExample3 m3 = new MethodsExample3();
		
		m3.subtraction();
		m3.multiplication();
		m3.division();
		
		MethodExample2 m2 = new MethodExample2();
		m2.addition();
		
		MethodExample5 m5 = new MethodExample5();
		m5.subtraction(50, 10);
	}

	protected void multiplication()
	{
		int var3;
		var3=var1*var2;
System.out.println(" The value of the variable var3 after multiplication is :-"
														+var3);
	}
	
	// default
	void division()
	{
		int var1=30;
		int var2=10;
		int var3;
		
		var3=var1/var2;
	System.out.println(" The value of the variable var3 after division is :-"
				+var3);
		
	}
}
