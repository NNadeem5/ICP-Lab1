/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacircum;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Nadeem Issah
 * @author Albert Hodo
 */
public class AreaCircum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int radius = scan.nextInt();
        double circum = Math.round((2 * Math.PI * radius)*100.0)/100.0 ;
        double area = Math.round((Math.PI * radius * radius)*100.0)/100.0;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circum);
        
        
    
    


    }
    
}
