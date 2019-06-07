package ega.org.ega;

import org.testng.annotations.Test;

public class NewTest {
	
	
	
	
  @Test
  public void Stringexamples() {
	  
	  
	  System.out.println("program to convert char to string using tostring method");
	  
	  char c = 'a';
	  String a = Character.toString(c);
	  System.out.println(a);
	  
	  
	  System.out.println("program to convert char to string using valueof method");
	  
	  String b = String.valueOf(c);
	  System.out.println(b);
	  
	  
  }
}
