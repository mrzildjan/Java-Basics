/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prelim2;

import javax.swing.JOptionPane;
/**
 *
 * @author ZILD
 */
public class Prelim2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dialogBox, outputDialogBox;
        double serviceCharge, Interest, newBalance;
        char[] AccountType;
        
        String customerCode = JOptionPane.showInputDialog("Account Type: Type 'S' Saving and 'C' Checking");
        AccountType = customerCode.toCharArray();
        dialogBox = JOptionPane.showInputDialog("Enter your account number");
        double accountNumber = Integer.parseInt(dialogBox);
        dialogBox = JOptionPane.showInputDialog("Enter the minimum balance");
        double minimumBalance = Double.parseDouble(dialogBox);
        dialogBox = JOptionPane.showInputDialog("Enter the current balance");
        double currentBalance = Double.parseDouble(dialogBox);      
        
        newBalance = currentBalance;
        
        switch(AccountType[0]){
            case 's', 'S' -> {
                if(currentBalance < minimumBalance){
                    serviceCharge = 10.0;
                    newBalance = newBalance - serviceCharge;
                } else {
                    Interest = 0.04;
                    newBalance = newBalance + (currentBalance * Interest);
                }
                
                outputDialogBox = "Account Number: " + accountNumber + "\n" +
                        "Account Type: Savings account" + "\n" +
                        "Current Balance: " + currentBalance +"\n "+
                        "New Balance: " + newBalance;
                
                JOptionPane.showMessageDialog(null,outputDialogBox,"Bank", JOptionPane.INFORMATION_MESSAGE);
            }
            case 'c', 'C' -> {
                if(currentBalance < minimumBalance){
                    serviceCharge = 25.0;
                    newBalance = newBalance - serviceCharge;
                } else if(currentBalance - minimumBalance >= 5000){
                    Interest = 0.03;
                    newBalance = newBalance + (currentBalance * Interest);
                } else if(currentBalance - minimumBalance < 5000){
                    Interest = 0.05;
                    newBalance = newBalance + (currentBalance * Interest);
                }
                outputDialogBox = "Account Number: " + accountNumber +"\n"+
                        "Account Type: Checking account" + "\n " +
                        "Current Balance: " + currentBalance + "\n" +
                        "New Balance: " + newBalance;
                
                JOptionPane.showMessageDialog(null,outputDialogBox,"Bank", JOptionPane.INFORMATION_MESSAGE);
            }
                
            default -> JOptionPane.showMessageDialog(null,"Invalid AccountType!","Bank", JOptionPane.ERROR_MESSAGE);
        } 
    }
}