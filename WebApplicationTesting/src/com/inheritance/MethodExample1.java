package com.inheritance;

public class MethodExample1 {
	
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
		
		MethodExample1 m1 = new MethodExample1();
		m1.addition();
	}

}
