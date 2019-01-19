/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlenghth;
import java.util.Scanner;

/**
 *
 * @author rahulsrinivas
 * @author jeffersonwelbeck
 */
public class StringLenghth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //System.out.println("Type a string here");
        String input = scan.nextLine();
        String[] splitString = input.split(" ");
        String ReversedWord = "";

        for (int i = 0; i < splitString.length; i++) {
            String word = splitString[i];
            String newWord = "";
            //String reversed = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                newWord += word.charAt(j);
                //System.out.println(newWord);
                //reversed = reversed.charAt(j) + reversed+ "";
                // ReversedWord= ReversedWord + reversed;
            }
            ReversedWord += newWord + " ";
            
        }
        System.out.println(ReversedWord);
    }
    
}
/*
 // Takes user input
        Scanner scanSentence = new Scanner(System.in);
        
        //reads sentence and assigns to variable
        String sentence = scanSentence.nextLine();
        
        //splits sentence into words into an array
        String[] sentenceParts = sentence.split(" ");
        String reverseWord = "";
        
        //loop picks each word in array
        for (int i = 0; i < sentenceParts.length; i++){
            // assigns word to a variable
            String word = sentenceParts[i];
            String newWord = "";
            
            // reverses word and assigns to variable
            for( int a = word.length() - 1; a >= 0; a--){
                newWord += word.charAt(a);    
            }
            
            // form sentence back with reversed words
            reverseWord += newWord + " ";
            
    */        

/*import java.util.Scanner;
public class ReverseProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Type a string here");
        String input = scan.nextLine();
        String[] splitString = input.split(" ");
        String ReversedWord = "";

        for (int i = 0; i >= splitString.length - 1; i++) {
            String word = splitString[i];
            String newWord = "";
            //String reversed = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                newWord += word.charAt(j);
                System.out.println(newWord);
                ReversedWord += newWord + " ";
                //reversed = reversed.charAt(j) + reversed+ "";
                // ReversedWord= ReversedWord + reversed;
            }
            System.out.println(ReversedWord);

        }**/


