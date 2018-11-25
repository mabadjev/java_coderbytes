/*
 * Maksim Abadjev 
 * Challenge courtesy of www.coderbyte.com
 */

import java.util.*; 
import java.io.*;
/**
 *
 * @author Maksim Abadjev
 */
public class EasyReverseString {
 public static String FirstReverse(String str) { 
  
    String newString ="";
    
    for (int i=0;i<str.length();i++){
        newString = str.charAt(i) + newString;
    }
       
    return newString;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}