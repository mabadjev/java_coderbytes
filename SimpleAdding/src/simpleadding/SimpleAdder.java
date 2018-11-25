package simpleadding;

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
public class SimpleAdder {
  public static int SimpleAdding(int num) { 
  
      //easy recursive solution
    if (num==1) return 1;
    return num+SimpleAdding(num-1);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleAdding(Integer.parseInt(s.nextLine()))); 
  }   
  
}


  