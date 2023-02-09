package filehandling02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling02 {
    public static void main(String[] args) throws IOException {
        
        Scanner scan;
        File myFile;
        
        myFile = new File("Data.txt");
        scan = new Scanner (myFile);
        while (scan.hasNextLine()){
            String lname = scan.next();
            String fname = scan.next();
            String ssn = scan.next();
            double hourrate = scan.nextDouble();
            double workhours = scan.nextDouble();
            double payroll = hourrate * workhours;
            System.out.println("Name: " + lname + fname );
            System.out.println("SSN: " +ssn);
            System.out.println("Gross Pay: " +String.format("%.2f", payroll));
            System.out.println();
        }
        scan.close();
    }
}
