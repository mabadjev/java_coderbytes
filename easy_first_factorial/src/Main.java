/*
 * Maksim Abadjev 
 * Challenge courtesy of www.coderbyte.com
 */

/**
 *
 * @author Maksim Abadjev
 */
import java.util.*; 
import java.io.*;

public class Main {  
    //aim of challenge is to return first factorial, input is known to be 
    //between 1 and 18
    //done with recursion as seen below
  public static int FirstFactorial(int num) { 
  
    if(num <= 1 ) return 1;
    return num * FirstFactorial(num-1);
           
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    //note: had to change it a bit on the site, for some reason their compiler
    //doesnt like below line
    System.out.print(FirstFactorial(Integer.parseInt(s.nextLine()))); 
  }   
  
}
