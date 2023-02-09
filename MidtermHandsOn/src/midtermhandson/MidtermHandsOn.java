/*
Program: Midterm Hands On
Name: Zildjan Leenor C. Luvindino
Description: Menu Driven Hands On
Date:May 18,2022
*/
package midtermhandson;

import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

public class MidtermHandsOn{
    
    static Scanner enter = new Scanner (System.in);
    static char codes;
    static String tell;
    static char c;
    
    public static void main(String[] args) {
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
    
    menu();
    }
    public static void menu(){
    int option;
    
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * M A I N * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * M E N U * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * * * \t\t     1. Vowels\t\t\t\t\t  * * * * *\n\t\t* * * * *\t\t     2. Square Root \t\t\t\t  * * * * *\n\t\t* * * * *\t\t     3. Age\t\t\t\t\t  * * * * *\n\t\t* * * * *\t\t     4. Modified Telephone Digit\t\t  * * * * *\n\t\t* * * * *\t\t     5. Telephone Digit\t\t\t\t  * * * * *\n\t\t* * * * *\t\t     6. Exit\t\t\t\t\t  * * * * *\n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * $ $ $ $   $ $ $   $         $ $ $           $         $         $     $ * * * \n");
    System.out.print("\t\t* * *     $       $     $         $     $         $       $   $       $ $   $ * * * \n");
    System.out.print("\t\t* * *   $         $     $         $     $   $     $     $ $ $ $ $     $   $ $ * * * \n");
    System.out.print("\t\t* * * $ $ $ $   $ $ $   $ $ $ $   $ $ $     $ $ $ $   $           $   $     $ * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\nChoose Between [1-6]: ");
    option = enter.nextInt();
    
    switch(option){
            case 1:
                Vowels();
                break;
            case 2:
                SquareRoot();
                break;
            case 3:
                Age();
                break;
            case 4:
                telephoneDigit();
                break;
            case 5:
                modified_telephoneDigit();
                break;
            case 6:
                System.exit(0);
                break;
            default: 
                System.out.print("Invalid option! Go back to Menu? (Y/N): ");
                c = enter.next().charAt(0);
                if(c=='y'||c=='Y')
                        {
                                 try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
                                menu();
                                }
                        else
                        {
                                System.exit(0);
                                }
    }
}
    public static void Vowels(){
         
    System.out.printf("\nYou've chosen Vowels! \n\n");
    System.out.print("Input any letters from A - Z: ");
    String let = enter.next();
    
    int count = 0;
    for (int i = 0; i < let.length(); i++) 
    {
        char character = let.charAt(i);
        if (isVowel(character) == true) 
        {
            count++;
        }
    if (isVowel(character)==true)
    {
        System.out.print("\nIs the Inputed Letter a Vowel?: ");
        System.out.println("True");
    }
    else 
    {
        System.out.print("\nIs the Inputed Letter a Vowel?: ");
        System.out.println("False");
    }
    }
    System.out.printf("\nGo back to Menu? (Y/N): ");
    c = enter.next().charAt(0);
            if(c=='y'||c=='Y')
            {
                 try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
                menu();
            }
            else
            {
                System.exit(0);
            }
  }
    public static boolean isVowel(char character){
    boolean result;
    result = character=='a'|| character== 'A' || character== 'E' || character=='e' || character== 'I' || character=='i' ||  character== 'O' ||character=='o' ||character== 'U' || character=='u';
      return result;
    }
    public static void SquareRoot(){
        
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25}; 
    
    System.out.printf("\nYou've chosen Square Root! \n\n");
    for (int i=0; i<25; i++)
    {
    System.out.printf("The Squareroot of %d is = %.2f\n",arr[i], Math.sqrt(arr[i])); 
    }
    
    System.out.printf("\nGo back to Menu? (Y/N): ");
    c = enter.next().charAt(0);
            if(c=='y'||c=='Y')
            {
                 try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
                menu();
            }
            else
            {
                System.exit(0);
            }
    }
    public static void Age(){
        
    int babyAge=0,schoolAge=0,adultAge=0;

    System.out.printf("\nYou've chosen Read Age! \n\n");
    for (int i=0;i<15;i++){
        System.out.printf("Enter Age %d: ",i+1);
        int age = enter.nextInt();

    if(age>=0 && age<=5)
    babyAge++;
    else if(age>=6 && age<=17)
    schoolAge++;
    else if (age>=18)
    adultAge++;
    }
    
    System.out.println();
    System.out.println("Total Baby age: " + babyAge);
    System.out.println("Total School age: " + schoolAge);
    System.out.println("Total Adult age: " + adultAge);
    
    System.out.printf("\nGo back to Menu? (Y/N): ");
    c = enter.next().charAt(0);
            if(c=='y'||c=='Y')
            {
                 try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
                menu();
            }
            else
            {
                System.exit(0);
            }
}
    public static void telephoneDigit(){
        tell=JOptionPane.showInputDialog("""
                                         Enter Letter from A to Z
                                         Use '#' to stop the Program""");
        codes= tell.charAt(0);
        
     while(codes != '#')
     {   
            switch (codes) {
                case 'A':
                case 'a':
                case 'b':
                case 'B':
                case 'c':
                case 'C':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 2","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    telephoneDigit();
                    break;
                case 'D':
                case 'd':
                case 'E':
                case 'e':
                case 'f':
                case 'F':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 3","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    telephoneDigit();
                    break;
                case 'G':
                case 'g':
                case 'h':
                case 'H':
                case 'i':
                case 'I':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 4","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    telephoneDigit();
                    break;
                case 'J':
                case 'j':
                case 'k':
                case 'K':
                case 'l':
                case 'L':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 5","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    telephoneDigit();
                    break;
                case 'M':
                case 'm':
                case 'n':
                case 'N':
                case 'o':
                case 'O':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 6","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    telephoneDigit();
                    break;
                case 'P':
                case 'p':    
                case 'q':
                case 'Q':
                case 'r':
                case 'R':
                case 's':
                case 'S':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 7","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    telephoneDigit();
                    break;
                case 'T':
                case 't':
                case 'u':
                case 'U':
                case 'v':
                case 'V':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 8","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    telephoneDigit();
                    break;
                case 'W':
                case 'w':
                case 'x':
                case 'X':
                case 'y':
                case 'Y':
                case 'z':
                case 'Z':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 9","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    telephoneDigit();
                    break;
                default:
                    break;
            }

     }
        
    }
    public static void modified_telephoneDigit(){
        tell=JOptionPane.showInputDialog("""
                                         Enter Letter from A to Z
                                         Use '#' to stop the Program""");
        codes= tell.charAt(0);
        
      while(codes != '#')
     {   
            switch (codes) {
                case 'A':
                case 'B':
                case 'C':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 2","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    modified_telephoneDigit();
                    break;
                case 'D':
                case 'E':
                case 'F':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 3","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    modified_telephoneDigit();
                    break;
                case 'G':
                case 'H':
                case 'I':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 4","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    modified_telephoneDigit();
                    break;
                case 'J':
                case 'K':
                case 'L':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 5","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    modified_telephoneDigit();
                    break;
                case 'M':
                case 'N':
                case 'O':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 6","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    modified_telephoneDigit();
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 7","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    modified_telephoneDigit();
                    break;
                case 'T':
                case 'U':
                case 'V':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 8","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    modified_telephoneDigit();
                    break;
                case 'W':
                case 'X':    
                case 'Y':
                case 'Z':
                    JOptionPane.showMessageDialog(null,"The letter you entered is: "+codes+
                            "\nThe corresponding telephone digit is: 9","Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
                    modified_telephoneDigit();
                    break;
                default:
                    break;
            }

     }
        
    }
}


