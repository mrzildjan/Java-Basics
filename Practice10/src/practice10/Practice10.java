/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice10;

import javax.swing.JOptionPane;

public class Practice10 {

    public static void main(String[] args) {
    
    String dialogBox, outputDialogBox;
    double billingAmount;
        
    String customerCode = JOptionPane.showInputDialog("Customer Code: Type 'R' Residential and 'B' Business");
    char code = customerCode.charAt(0);
    dialogBox = JOptionPane.showInputDialog("Enter Account Number: ");
    int accountNumber = Integer.parseInt(dialogBox);
    dialogBox = JOptionPane.showInputDialog("Enter number of Premium Channel: ");
    double noPremiumChannel = Double.parseDouble(dialogBox);
    dialogBox = JOptionPane.showInputDialog("Enter number of Service Connection: ");
    double noBasicServiceConnection = Double.parseDouble(dialogBox);
    
    if ((code == 'r') || (code == 'R'))
    {
        noPremiumChannel = noPremiumChannel * 7.50;
        noBasicServiceConnection = noBasicServiceConnection * 20.50;
        billingAmount = noPremiumChannel + noBasicServiceConnection + 4.50;
      
        outputDialogBox = "Account Number: " + accountNumber + "\n" + 
                            "Billing Amount: " +String.format("%.2f",billingAmount);
        JOptionPane.showMessageDialog(null,outputDialogBox,"Theater Sales Data", JOptionPane.INFORMATION_MESSAGE);
    }
    else if ((noPremiumChannel <=10 && code == 'b') || (noPremiumChannel <=10 && code == 'B'))
    {
        noPremiumChannel = noPremiumChannel * 7.5;
        billingAmount = noPremiumChannel + 50.00 + 15.00;
        
         outputDialogBox = "Account Number: " + accountNumber + "\n" + 
                            "Billing Amount: " +String.format("%.2f",billingAmount);
        JOptionPane.showMessageDialog(null,outputDialogBox,"Theater Sales Data", JOptionPane.INFORMATION_MESSAGE);
    }
    else if ((noPremiumChannel >=11 && code == 'b') || (noPremiumChannel >=11 && code == 'B'))
    {
        noPremiumChannel = noPremiumChannel * 12.5;
        billingAmount = noPremiumChannel + 50.00 + 15.00;
        
         outputDialogBox = "Account Number: " + accountNumber + "\n" + 
                            "Billing Amount: " +String.format("%.2f",billingAmount);
        JOptionPane.showMessageDialog(null,outputDialogBox,"Customer Bill", JOptionPane.INFORMATION_MESSAGE);
    }
    else {
        JOptionPane.showMessageDialog(null,"Invalid Customer Code!","Invalid Input", JOptionPane.ERROR_MESSAGE);
    }
    }
}
