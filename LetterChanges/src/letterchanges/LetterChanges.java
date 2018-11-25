
package letterchanges;

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
public class LetterChanges {
  public static String LetterChanges(String str) { 
  
    String newString = "";
    
    for(int i=0;i<str.length();i++){
    
        //loop z around back to a
        if(str.charAt(i)=='z' || str.charAt(i)=='Z')
        {
            newString+="a";   
        }
        else if(Character.isLetter(str.charAt(i))) 
        {
        //replace any letter with the next one, z already out of the picture
            newString+=Character.toString((char)(str.charAt(i)+1));
        }
        else newString+=str.charAt(i);
               
    }
    //replace vowels with uppercase
    newString=newString.replace('a', 'A');
    newString=newString.replace('e', 'E');
    newString=newString.replace('i', 'I');
    newString=newString.replace('o', 'O');
    newString=newString.replace('u', 'U');
        
    return newString;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}

