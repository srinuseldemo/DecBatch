package com.KeyWords;

public class ContinueKeyWord {
	
	public static void main(String[] args) {
		
		String str = "Selenium ";
		for(int i=1;i<=4;i++)
		{
			if(i==2)
			{
				continue;
			}
			System.out.println(i+" "+str);
			
		}
		
	}

}
