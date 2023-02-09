package fileio;

import java.util.*;
import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        
        Scanner scan;
        FileWriter file;
        File myFile;
        
        scan = new Scanner (System.in);
        file = new FileWriter("Numbers.txt");
        
        int[][] arr = new int [2][2];
        
        System.out.print("Enter 4 numbers: ");
        for (int[] arr1 : arr) {
            for (int j = 0; j<arr.length; j++) {
                arr1[j] = scan.nextInt();
            }
        }
        System.out.println();
        file.write("Displaying: \n");
        for (int[] arr1 : arr) {
            for (int j = 0; j<arr.length; j++) {
               file.write("Numbers: " + arr1[j]);
               file.write("\n");
            } 
        }
        file.close();
        
        myFile = new File("Numbers.txt");
        scan = new Scanner (myFile);
        while (scan.hasNextLine()){
            String content = scan.nextLine();
            System.out.println(content);
        }
        scan.close();
    }
}
