/*
 * Maksim Abadjev easy level longest word challenge
 * Challenge is to find longest word in a string
 * Challenge courtesy of www.coderbyte.com
 */
package longest_word;

import java.util.*; 
import java.io.*;

/**
 *
 * @author Maksim Abadjev
 */
public class Longest_word {

 public static String LongestWord(String sen) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */

    //Split the Java string along the builtin Word regex, iterate over the array
    //keep track of longest word and length of longest word
    int maxLength =0;
    
    String result ="";
    
    String[] split = sen.split("\\W"); 

    for(int x=0; x<split.length; x++){
      if (split[x].length() > maxLength)
        {
            result=split[x];
            maxLength=split[x].length();
        }
    }

    sen=result;

    return sen;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}