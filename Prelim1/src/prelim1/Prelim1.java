/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prelim1;

import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author ZILD
 */
public class Prelim1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String dialogBox, outputDialogBox;
    double regularPrice=10;
    double premiumPrice=25;

    String customerCode = JOptionPane.showInputDialog("Service Code: Type 'R' Regular and 'P' Premium");
    char code = customerCode.charAt(0);
    
    if ((code == 'r') || (code == 'R'))
    {
    dialogBox = JOptionPane.showInputDialog("Enter Account Number: ");
    int accountNumber = Integer.parseInt(dialogBox);
    dialogBox = JOptionPane.showInputDialog("Enter number of minutes: ");
    int minutes = Integer.parseInt(dialogBox);
        int min;
        if (minutes>50){
            min=minutes-50;
            regularPrice=regularPrice+(min*0.20);
        }
        outputDialogBox = "Bill: "+regularPrice + "\n" + 
                           "Service Code: Regular"+ "\n" +
                            "Account Number: " + accountNumber;
	JOptionPane.showMessageDialog(null,outputDialogBox,"Regular Service", JOptionPane.INFORMATION_MESSAGE);
    }
    else if ((code == 'p') || (code == 'P'))
    {
        dialogBox = JOptionPane.showInputDialog("Choose type of call:\n1. Calls made from 6:00 a.m. to 6:00 p.m.\n2. Calls made from 6:00 p.m. to 6:00 a.m.");
        int callType = Integer.parseInt(dialogBox);
                
        int minutes;
        int min;
       
        dialogBox = JOptionPane.showInputDialog("Enter Account Number: ");
        int accountNumber = Integer.parseInt(dialogBox);
        
        dialogBox = JOptionPane.showInputDialog("Enter number of minutes: ");
        minutes = Integer.parseInt(dialogBox);
		   if (callType==1){
		       
		       if (minutes>75){
		        min=minutes-75;
		        premiumPrice=premiumPrice+(min*0.10);
		    }
		   }
		   else if (callType==2){
		       if (minutes>100){
		        min=minutes-100;
		        premiumPrice=premiumPrice+(min*0.05);
		    }
		   }
         outputDialogBox = "Bill: "+premiumPrice + "\n" + 
                           "Service Code: Premium" +  "\n" +
                            "Account Number: " + accountNumber;
	JOptionPane.showMessageDialog(null,outputDialogBox,"Premium Service", JOptionPane.INFORMATION_MESSAGE);
          }
    else if ((code != 'r') || (code != 'R') || (code != 'p') || (code != 'P')){
    JOptionPane.showMessageDialog(null,"Invalid Service Code!","Invalid Input", JOptionPane.ERROR_MESSAGE);
    exit(0);
    }
   }
 }
