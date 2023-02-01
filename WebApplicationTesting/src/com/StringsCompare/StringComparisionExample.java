package com.StringsCompare;

public class StringComparisionExample {
	
	public static void main(String[] args) {
		
		String string1="LiveTech";
		
		int charAtAnIndex=string1.charAt(4);
		
System.out.println("The information in the variable charAtAnIndex is :"
																+charAtAnIndex);
		
System.out.println(" The letter at 0 index in the String str1 is : "
															+ string1.charAt(4));

      String string2="LiveTech";
      
      String convertedStringUpperCaseValue=string2.toUpperCase();
      
 System.out.println("The value of the variable convertedStringUpperCaseValue is:"
		 										+convertedStringUpperCaseValue);
      
 String convertedStringLowerCaseValue=string2.toLowerCase();
      
 System.out.println("The value of the variable convertedStringLowerCaseValue is:"
		 										+convertedStringLowerCaseValue);
      
    String string3="LiveTech";
    String string4="LiveTech";
    
    if(string3.equals(string4))
    {
   System.out.println(" string3 is equal to string4 - Both Strings are Equal");
    }
    else
    {
System.out.println("string3 is Not equal to string4-Both Strings are Not Equal");
    }
    
    System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
    
    String string5="liveTech";
    /*
    
    string4=string4.toLowerCase();
    
    string5=string5.toLowerCase();
    
    if(string4.equals(string5))
    {
    	System.out.println(" Both strings are equal ");
    }
    else
    {
    	System.out.println(" Both Strings are not equal ");
    }
    */
         
      if(string4.equalsIgnoreCase(string5))
      {
      	System.out.println(" Both strings are equal ");
      }
      else
      {
      	System.out.println(" Both Strings are not equal ");
      }	  
      
      System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$ ");
            
      String string6="LiveTech";
      String string7="Tech";
      
      if(string6.contains(string7))
      {
    	  System.out.println(" String Value is Existing ");
      }
      else
      {
    	  System.out.println(" String value is not Existing ");
      }
                		
	}

}
