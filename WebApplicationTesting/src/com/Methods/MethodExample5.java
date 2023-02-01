package com.Methods;

public class MethodExample5 {
	public void subtraction() // Method withOut Parameters
	{
		int var1=10;
		int var2=5;
		int var3;
		
		var3=var1-var2;
	System.out.println(" The value of the variable var3 after subtraction is:- "
																+var3);	
	}
	public void subtraction(int a,int b) // Method with Parameters
	{
		int c;
		c=a-b;
  System.out.println(" The value of the variable c after subtraction is:- "+c);
	}
	
	public void subtraction(int a,int b,int c)
	{
		c=a-b;
	System.out.println(" The value of the variable c after subtraction is:- "+c);
	}
	
	public static void main(String[] args) {
		
		MethodExample5 m5 = new MethodExample5();
		m5.subtraction();
		
		m5.subtraction(100, 50);
		m5.subtraction(10, 5, 50);
		m5.subtraction(20.2, 10.1);
		m5.subtraction(20.24f, 10.12);
	}
	public void subtraction(double a,double b)
	{
		double c;
		c=a-b;
System.out.println(" the value of c for double type of parameter values is :- "+c);
	}
	public void subtraction(float a,double b)
	{
		double c;
		c=b-a;
System.out.println(" the value of c for mixed dataType parameter values is :- "+c);
		
	}
}
