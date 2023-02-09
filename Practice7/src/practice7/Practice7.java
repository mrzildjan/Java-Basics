/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice7;
import javax.swing.JOptionPane;
/**
 *
 * @author ZILD
 */
public class Practice7{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dialogBox, movieName, outputDialogBox;
        
        movieName= JOptionPane.showInputDialog("Movie Name: ");
        dialogBox = JOptionPane.showInputDialog("Adult Ticket Price : ");
        double adultPrice = Double.parseDouble(dialogBox);
        dialogBox = JOptionPane.showInputDialog("Child Ticket Price: ");
        double childPrice = Double.parseDouble(dialogBox);
        dialogBox = JOptionPane.showInputDialog("Adult Tickets Sold: ");
        double adultSold = Double.parseDouble(dialogBox);
        dialogBox = JOptionPane.showInputDialog("Child Tickets Sold: ");
        double childSold = Double.parseDouble(dialogBox);
        dialogBox = JOptionPane.showInputDialog("Enter Percentage of Gross Amount: ");
        double percentageGross = Double.parseDouble(dialogBox);
        
        double sold = adultSold +  childSold;
        double grossAmount = adultPrice * adultSold + childPrice * childSold;
        double amountDonated = grossAmount * percentageGross / 100;
        double netSales = grossAmount - amountDonated;
        
        
        outputDialogBox = "Movie Name: " + movieName + "\n" +
                            "Number of Ticket Sold: " + sold + "\n" +
                              "Gross Amount: $" +String.format("%.2f",grossAmount) + "\n" +
                                "Percentage of the Gross Amount Donated: " +String.format("%.2f",percentageGross) + "%" + "\n" +
                                  "Amount Donated: $" +String.format("%.2f",amountDonated) + "\n" +
                                    "Net Sales: $" + String.format("%.2f",netSales);
        
        JOptionPane.showMessageDialog(null,outputDialogBox,"Theater Sales Data", JOptionPane.INFORMATION_MESSAGE);
        
        
        // TODO code application logic here
    }
    
}