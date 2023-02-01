package com.inheritance;

public class MethodExample3 extends MethodExample2 {
	
	public void multiplication()
	{
		int var1=10;
		int var2=5;
		int var3;
		
		var3=var1*var2;
	System.out.println(" The value of the variable var3 after Multiplication is:- "
																+var3);	
	}
	
	public static void main(String[] args) {
		
		MethodExample3 m3 = new MethodExample3();
		System.out.println(" ************current class Method **************");
		m3.multiplication(); // current class Method
		
System.out.println(" *******it is extended of Extended class Method *********");
		m3.addition(); // it is extended of Extended class Method
		
		System.out.println(" ********it is an extended class Method *********");
		m3.subtraction(300, 200); // it is an extended class Method 
		
		
	}

}
