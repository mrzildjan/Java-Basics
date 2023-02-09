/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice8;
import javax.swing.JOptionPane;
/**
 *
 * @author ZILD
 */
public class Practice8{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dialogBox, outputDialogBox;
        double fee = 0.015;
        double totalCharges, amountInvested, amountReceived, saleFee, purchaseFee, profit;
        
        dialogBox = JOptionPane.showInputDialog("Number Shares Sold: ");
        double shares  = Double.parseDouble(dialogBox);
        dialogBox = JOptionPane.showInputDialog("Purchase Price Each Shares: ");
        double purchase  = Double.parseDouble(dialogBox);
        dialogBox = JOptionPane.showInputDialog("Selling Price Each Shares: ");
        double selling  = Double.parseDouble(dialogBox);
        
        profit = purchase * shares;
        amountReceived = (shares * selling)- fee;
        amountInvested = shares * purchase + fee;
        saleFee = shares * selling  * fee;
        purchaseFee = shares  * purchase * fee;
        totalCharges = saleFee + purchaseFee;
        
        outputDialogBox = "Amount Invested: " +String.format("%.2f",amountInvested) + "\n" +
                            "Total Service Charge: " +String.format("%.2f",totalCharges) + "\n" +
                              "Amount Gained or Lost: " +String.format("%.2f",profit) + "\n" +
                                "Amount Receive after Selling Stocks: " +String.format("%.0f",amountReceived);
        
        JOptionPane.showMessageDialog(null,outputDialogBox,"Buy and Sell Stocks", JOptionPane.INFORMATION_MESSAGE);
        
        
        // TODO code application logic here
    }
    
}