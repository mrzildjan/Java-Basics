/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practiceactivity1;

import java.util.*;
/**
 *
 * @author ZILD
 */
public class PracticeActivity1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner enter = new Scanner (System.in);
        
        System.out.print("Enter Radius: ");
        double rad = enter.nextDouble();
        System.out.print("Enter Height: ");
        double height = enter.nextDouble();
        
        double result = radius(rad,height);
        System.out.printf("The Radius of the Right Cylender is: %.2f\n" ,result);
    }
    public static double radius(double rad,double height){
        double result= Math.PI * rad * rad * height;
        return result;
    }
    
}
