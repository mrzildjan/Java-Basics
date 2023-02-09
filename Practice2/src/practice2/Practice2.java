/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice2;

import java.util.Scanner;
/**
 *
 * @author ZILD
 */

public class Practice2 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("");
        
        String fname = input.next();
        String sname = input.next();
        System.out.println("Name:" + fname + " " + sname );
        
        int age = input.nextInt();
        System.out.println("Age: " + age);
        
        double weight = input.nextDouble();
        System.out.println("Weight: " + weight);
        
        
        // TODO code application logic here
    }
    
}