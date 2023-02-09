/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice9;
import javax.swing.JOptionPane;

/**
 *
 * @author ZILD
 */
public class Practice9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ISBN, outputDialogBox;
        
        ISBN = JOptionPane.showInputDialog("Enter ISBN (xxx-x-xxx-xxxxx-x): ");

        outputDialogBox = "GSI Prefix:  " + ISBN.charAt(0)+ ISBN.charAt(1)+ ISBN.charAt(2)+ "\n" +
                            "Country: " + ISBN.charAt(4)+ "\n" +
                              "Publisher Code: " + ISBN.charAt(6)+ ISBN.charAt(7)+ ISBN.charAt(8)+ "\n" +
                                "Item Number: " + ISBN.charAt(10)+ ISBN.charAt(11)+ ISBN.charAt(12)+ ISBN.charAt(13)+ ISBN.charAt(14)+ "\n" +
                                  "Check Digit: " + ISBN.charAt(16);
        
        JOptionPane.showMessageDialog(null,outputDialogBox,"International Standard Book Number", JOptionPane.INFORMATION_MESSAGE);
        
        
        // TODO code application logic here
    }
    
}