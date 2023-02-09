/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice5;

import java.util.Scanner;

/**
 *
 * @author ZILD
 */
public class Practice5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter:");
        String ltr = input.next();
        System.out.print("Enter a word:");
        String word = input.next();
        System.out.print("Enter a num:");
        int num = input.nextInt();
        System.out.print("Enter a number with decimal:");
        Float dec = input.nextFloat();
        System.out.print("Enter a negative number with decimal:");
        Float negadec = input.nextFloat();
        System.out.print("Enter a another number with decimal:");
        Float odec = input.nextFloat();
        
        System.out.print("\n\nTHESE ARE THE FOLLOWING OUTPUT THAT IMPLEMENTS\n");
        System.out.print("DIFFERENT KINDS OF SPECIFIER, POSITION AND DECIMAL PLACES\n");
        
        System.out.printf("\n1.   " + ltr);
        System.out.printf("\n2. " + ltr);
        System.out.printf("\n3. " + word);
        System.out.printf("\n4. " + num);
        System.out.printf("\n5.       " + num);
        System.out.printf("\n6. " + num);
        System.out.printf("\n7. %.6f", dec);
        System.out.printf("\n8. %.6f", dec);
        System.out.printf("\n9.%11.2f", dec);
        System.out.printf("\n10. %.2f", dec);
        System.out.printf("\n11. %.2f", dec);
        System.out.printf("\n12.%11.3f", negadec);
        System.out.printf("\n13.%11.6f\n", odec);

        
        // TODO code application logic here
    }
    
}
