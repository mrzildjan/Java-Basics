package filehandling01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling01 {
    public static void main(String[] args) throws IOException {
        
        Scanner scan;
        File myFile;
        
        myFile = new File("Data.txt");
        scan = new Scanner (myFile);
        while (scan.hasNextLine()){
            String lname = scan.next();
            String fname = scan.next();
            String add1 = scan.next();
            String add2 = scan.next();
            String add3 = scan.next();
            String city = scan.nextLine();
            System.out.println("Name: "+lname + fname);
            System.out.println("Address: "+ add1 + " " + add2+ " "+add3);
            System.out.println("City, State: "+ city);
            System.out.println();
        }
        scan.close();
    }
}
