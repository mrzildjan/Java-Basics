package filehandling03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling03 {
    public static void main(String[] args) throws IOException {
        
        Scanner scan;
        File myFile;
        
        myFile = new File("Data.txt");
        scan = new Scanner (myFile);
        
        System.out.print("Part Number \t\t" + "Current Balance \t\t" + "Minimum Amount Need \t\t");
        while (scan.hasNextLine()){
            String inventory = scan.nextLine();
            String partNumber = scan.next();
            int initialAmount = scan.nextInt();
            int quantitySold = scan.nextInt();
            int minimumAmount = scan.nextInt();
            
            int currentBalance = initialAmount - quantitySold;
            int minimumLevel =  minimumAmount - currentBalance;
            
            System.out.println();
            System.out.print(partNumber + "\t\t\t");
            System.out.print(currentBalance + "\t\t\t\t");
            System.out.print(minimumLevel);
        }
        System.out.println();
        
        scan.close();
    }
}
