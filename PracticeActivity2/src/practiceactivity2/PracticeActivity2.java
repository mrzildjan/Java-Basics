/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practiceactivity2;

import java.util.*;
/**
 *
 * @author ZILD
 */
public class PracticeActivity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner (System.in);

        System.out.print("Enter a number to be Squared: ");
        double square = enter.nextDouble();
        
        double result = sqrt(square);
        System.out.printf("Squared Number: %.2f\n" ,result);
    }
    public static double sqrt(double square){
        double result= Math.sqrt(square);
        return result;
    }
    
}
