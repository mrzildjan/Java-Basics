/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice12;

import javax.swing.JOptionPane;

/**
 *
 * @author ZILD
 */
public class Practice12 {
    
    public static void main(String[] args) {
    
    String dialogBox, outputDialogBox;
    int number1, number2, result;

    dialogBox = JOptionPane.showInputDialog("Choose an operator: +, -, *, or /: ");
    char operator = dialogBox.charAt(0);
    
    dialogBox = JOptionPane.showInputDialog("Enter first number: ");
    number1 = Integer.parseInt(dialogBox);

    dialogBox = JOptionPane.showInputDialog("Enter second number: ");
    number2 = Integer.parseInt(dialogBox);

    switch (operator) {
        
      case '+' -> {
          result = number1 + number2;
          outputDialogBox = number1 + " + " + number2 + " = " + result;
          JOptionPane.showMessageDialog(null,outputDialogBox,"Addition", JOptionPane.INFORMATION_MESSAGE);
            }


      case '-' -> {
          result = number1 - number2;
          outputDialogBox = number1 + " - " + number2 + " = " + result;
          JOptionPane.showMessageDialog(null,outputDialogBox,"Subtraction", JOptionPane.INFORMATION_MESSAGE);
            }


      case '*' -> {
          result = number1 * number2;
          outputDialogBox = number1 + " * " + number2 + " = " + result;
          JOptionPane.showMessageDialog(null,outputDialogBox,"Multiplication", JOptionPane.INFORMATION_MESSAGE);
            }


      case '/' -> {
          result = number1 / number2;
          outputDialogBox = number1 + " / " + number2 + " = " + result;
          JOptionPane.showMessageDialog(null,outputDialogBox,"Division", JOptionPane.INFORMATION_MESSAGE);
            }

      default -> JOptionPane.showMessageDialog(null,"Invalid Operator!","Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
    }
 }   
