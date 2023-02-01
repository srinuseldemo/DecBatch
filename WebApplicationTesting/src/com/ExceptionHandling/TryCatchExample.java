package com.ExceptionHandling;

public class TryCatchExample {
	
	public static void main(String[] args) {

		try
		{
		int var1=20;
		int var2=0;
		int var3;
		var3=var1/var2;
System.out.println(" The value of the variable var3 after division is :"+var3);
		int a=20;
		int b=10;
		int c;
		c=a+b;
System.out.println(" The value of the variable c after addition is :"+c);
		}
		catch(Exception error)
		{
	System.out.println(" Issue in executing the statements of Try Block");
System.out.println(" The error caught during the Execution process is : "+error);
		}

	}
		
/*
		int a=20;
		int b=10;
		int c;
		
		c=a+b;
System.out.println(" The value of the variable c after addition is :"+c);			

*/
	

/*
		var3=var1%var2;

System.out.println(" The value of the variable var3 after division is :"+var3);		
		
		
	}
*/
}
