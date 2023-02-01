package com.KeyWords;

public class BreakKeyWord

{
	
	public static void main(String[] args) {
		
		String str = "Selenium ";
		for(int i=1;i<=3;i++)
		{
			System.out.println(i+" "+str);
			if(i==2)
			{
				break;
			}
			System.out.println(i+" "+"LiveTech");
		}
		
		
	}

}
