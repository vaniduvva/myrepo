package ega.org.ega;

import org.testng.annotations.Test;

public class ConvertStringToChar {
	
	
	
  @Test
  public void EgOfConvertStringToChar() {
	  
	 System.out.println("Example of converting String to character"); 
	  String s = "hello";
	  
	  for (int i =0; i<s.length(); i++)
	  {
		  
		  char ch = s.charAt(i);
		  System.out.println("each repo");
		  System.out.println("each character of string    "+s+"  is: " +ch);
	  }
  }
  
  
  
  
  
  
  
}
