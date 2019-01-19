/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.stringlength;
import java.util.Scanner;

/**
 *
 * @author Nadeem Issah
 * @author Albert Hodo
 */
public class StringLength {
    
     public static void main(String[] args) {
      
       
       Scanner newInput = new Scanner(System.in); 
       String input = newInput.nextLine();
       int strLength = input.length();

       System.out.println(strLength);
    }
}
