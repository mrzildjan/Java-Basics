/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice11;

import javax.swing.JOptionPane;

/**
 *
 * @author ZILD
 */
public class Practice11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dialogBox, outputDialogBox;
        int totalCookies, totalBox, totalContainer, extraCookies, extraBox;
        
        dialogBox = JOptionPane.showInputDialog("Enter total number of cookies: ");
        totalCookies  = Integer.parseInt(dialogBox);
        
        totalBox = totalCookies/24;
        extraCookies = totalCookies%24;
        totalContainer = totalBox/75;
        extraBox = totalBox/24;
        
        outputDialogBox = "Number of Boxes needed: " + totalBox + "\n" +
                            "Number of Containers needed: " + totalContainer + "\n" +
                              "Left over Cookies: " + extraCookies + "\n" +
                                "Left over Boxes: " + extraBox;
        
        JOptionPane.showMessageDialog(null,outputDialogBox,"Cookie and Stuffs", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
