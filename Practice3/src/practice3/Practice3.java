/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice3;

import java.util.Scanner;
/**
 *
 * @author ZILD
 */

public class Practice3 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();
       
        double swap;
        swap = num1;
        num1 = num2;
        num2 = swap;
       
        System.out.printf("After Swapping, firstNumber = %.2f\n", num1);
        System.out.printf("After Swapping, secondNumber = %.2f\n", num2);
        
        
        // TODO code application logic here
    }
    
}
