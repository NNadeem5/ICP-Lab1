/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;
import java.util.Scanner;

/**
 *
 * @author Nadeem Issah
 * @author Albert Hodo
 */
public class Reverse {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        String sentence = scan.nextLine();
        
        String[] stringSplit = sentence.split(" ");
        String reverseString = "";
        
        for (int i = 0; i < stringSplit.length; i++){
            String word = stringSplit[i];
            String reverseWord = ""; 
            for( int j = word.length() - 1; j >= 0; j--){
                reverseWord += word.charAt(j);    
            }
            reverseString += reverseWord + " ";    
        }
        //prints reverse word sentence to console
        System.out.println(reverseString);
    }
    
}
