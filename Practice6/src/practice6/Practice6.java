/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice6;
import javax.swing.JOptionPane;
/**
 *
 * @author ZILD
 */
public class Practice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dialogBox, outputDialogBox;
        double volume;
        double radius;
        double PI = 3.14285714286;
     
                
        dialogBox = JOptionPane.showInputDialog("Enter Radius: ");
        radius = Double.parseDouble(dialogBox);
        
        volume = (4.0/3.0) * PI * (radius*radius*radius);
        
        outputDialogBox = "Volume of the Sphere: " + volume;
        
        JOptionPane.showMessageDialog(null,outputDialogBox,"Volume of Sphere", JOptionPane.INFORMATION_MESSAGE);
        
        
        // TODO code application logic here
    }
    
}
