package com.Loops;

public class ForExample1 {
	
	public static void main(String[] args) {
		
		/*
		System.out.println(string);
		System.out.println(string);
		System.out.println(string);
		System.out.println(string);
		*/
		
		String string="LiveTech";
		//for(int a=1;a<6;a++)
		for(int a=1;a<=5;a++)
		{
			System.out.println(a+" "+string);
		}
				
		System.out.println(" *********************** ");
			
		String string1="Selenium";
		
		for(int i=5;i<=8;i++)
		{
			System.out.println(string1);
		}
				
		System.out.println(" @@@@@@@@@@@@@@@ ");
		
		for(int p=3;p<=7;p=p+2)
		{
			
			System.out.println(p+" "+string);
		}
		System.out.println(" ################## ");
				
		String string2="Srini";
		
		for(int k=3;k>=1;k--)
		{
			System.out.println(k+" "+string2);
		}
				
		System.out.println(" &&&&&&&&&&&&&&&&& ");
		
		for(int h=-4;h>=-12;h=h-2)
		{
			System.out.println(h+" "+string2);
		}
		
		System.out.println(" ^^^^^^^^^^^^^^^^^^ ");
		
		for(int y=-10;y<=0;y=y+5)
		{
			System.out.println(y+" "+string1);
		}
			
	}

}
