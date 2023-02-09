package mutildimentionalarray;

import java.io.IOException;
import java.util.*;

public class MultiDimentionalArray{
    
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
    System.out.print("\t\t* * * * * \t\t     1. Students Marks\t\t\t\t  * * * * *\n\t\t* * * * *\t\t     2. Cities Temperature \t\t\t  * * * * *\n\t\t* * * * *\t\t     3. Sum Two Matrices\t\t\t  * * * * *\n\t\t* * * * *\t\t     4. Passing Two Dimensional \t\t  * * * * *\n\t\t* * * * *\t\t     5. Product of all Elements\t\t\t  * * * * *\n\t\t* * * * *\t\t     6. Mirror Multidimensional\t\t\t  * * * * *\n\t\t* * * * *\t\t     7. Exit\t\t\t\t\t  * * * * *\n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * $ $ $ $   $ $ $   $         $ $ $           $         $         $     $ * * * \n");
    System.out.print("\t\t* * *     $       $     $         $     $         $       $   $       $ $   $ * * * \n");
    System.out.print("\t\t* * *   $         $     $         $     $   $     $     $ $ $ $ $     $   $ $ * * * \n");
    System.out.print("\t\t* * * $ $ $ $   $ $ $   $ $ $ $   $ $ $     $ $ $ $   $           $   $     $ * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\nChoose Between [1-7]: ");
    option = enter.nextInt();
    
    switch(option){
            case 1:
                Students_Marks();
                break;
            case 2:
                Cities_Temperature();
                break;
            case 3:
                Sum_TwoMatrices();
                break;
            case 4:
                Passing_Two_Dimensional();
                break;
            case 5:
                Product_of_all_Elements();
                break;
            case 6:
                Mirror_Multidimensional();
                break;
            case 7:
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
    public static void Students_Marks(){
        
    int[] grades = new int[50];
    int poor=0,average=0,good=0,excellent=0,num;
    
    System.out.printf("\nYou've chosen Students Marks! \n\n");
   
        System.out.print
       ("Enter Number of Students in Class: ");
        num = enter.nextInt();
        for(int i=1; i<=num; i++){
            System.out.print(i+". Sample Input: ");
            grades[i] = enter.nextInt();
            
            if(grades[i]>=76&&grades[i]<=100){
                excellent++;
            }
            else if(grades[i]>=51&&grades[i]<=75){
                good++;
            }
             else if(grades[i]>=26&&grades[i]<=50){
                average++;
            }
            else{
                 poor++;
            }
        }
        System.out.println();
        System.out.println("Sample Output:");
        System.out.println("Group        Range          Student Count");
        System.out.println("Excellent    76-100         " + excellent);
        System.out.println("Good         51-75          " + good);
        System.out.println("Average      26-50          " + average);  
        System.out.println("Poor         0-25           " + poor);
        
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
    public static void Cities_Temperature(){
        
    int[][] arr = new int[2][7];
    
    System.out.printf("\nYou've chosen Cities Temperature! \n\n");
     for (int i=0;i<2;i++){
         for(int j=0;j<7;j++){
         System.out.printf("City %d, Day %d: ",i+1,j+1);
         arr[i][j] = enter.nextInt(); 
         }   
     }
     
     System.out.println();    
     System.out.println("Displaying values: \n");
     
     for(int i=0;i<2;i++){
         for (int j=0;j<7;j++){
          System.out.printf("City %d, Day %d: ",i+1,j+1);
          System.out.print(arr[i][j]);
          System.out.println();
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
    public static void Sum_TwoMatrices(){
        
    int row, coloumn;
    double [] []arr1 = new double [10][10];
    double [][] arr2 = new double [10][10];
    double [][] sum = new double [10][10];
    
    System.out.printf("\nYou've chosen Sum Two Matrices! \n\n");
     
    System.out.print("Enter Number of Rows and Column: ");
    row = enter.nextInt();
    coloumn = enter.nextInt();
        
    System.out.println("Enter elements of 1st matrix");
    for (int i=0;i< row;++i)
        for(int j=0;j<coloumn;++j){
         System.out.printf("Enter a%d%d: ",i+1,j+1);
         arr1[i][j] = enter.nextDouble();
        }
   
    System.out.println("Enter elements of 2nd matrix");
    for (int i=0;i<row;i++)
        for(int j=0;j<coloumn;j++){
         System.out.printf("Enter b%d%d: ",i+1,j+1);
         arr2[i][j] = enter.nextDouble();
        }
    
    System.out.println("Sum Of Matrix: ");
        for (int i=0;i<row;i++){
        for(int j=0;j<coloumn;j++){
         sum[i][j]= arr1[i][j]+arr2[i][j];
        }
    }
       for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.printf("%.1f\t",sum[i][j]);
            }
            System.out.println(); 
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
    public static void Passing_Two_Dimensional(){
        
        int[][] arr = new int [2][2];
        
        System.out.printf("\nYou've chosen Passing Two Dimensional! \n\n");
        System.out.print("Enter 4 numbers: ");
        for (int[] arr1 : arr) {
            for (int j = 0; j<arr.length; j++) {
                arr1[j] = enter.nextInt();
            }
        }
        Function_Call(arr);   
    }
    
    public static void Function_Call(int [][]arr)
    {
        System.out.println("Displaying: ");
        for (int[] arr1 : arr) {
            for (int j = 0; j<arr.length; j++) {
                System.out.println(arr1[j]);
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
    public static void Product_of_all_Elements(){
        
    int tables,row,col;
    
    System.out.printf("\nYou've chosen Product of all Elements! \n\n");
    System.out.print("Enter number of Tables: ");
    tables = enter.nextInt();
    System.out.print("Enter number of Rows: ");
    row = enter.nextInt();
    System.out.print("Enter number of columns: ");
    col = enter.nextInt();
    
    int[][][] sum = new int[tables][row][col];
    int[][][] arr = new int[tables][row][col];
    
    System.out.println();
    for (int i=0;i<tables;i++)
    {
        System.out.printf("Table %d\n",i);
       for (int j=0;j<row;j++)
        {
            for (int k=0;k<col;k++)
            {
                arr[i][j][k]= enter.nextInt();
            }
        }
    }
    for (int i=0;i<tables;i++)
    {
       for (int j=0;j<row;j++)
        {
            for (int k=0;k<col;k++)
            {
                 sum[i][j][k]= arr[i][j][k] + arr[i][j][k];
            }
        }
    }
    System.out.println("Sum: ");
     for (int i=0;i<tables-1;i++)
    {
       for (int j=0;j<row;j++)
        {
            for (int k=0;k<col;k++)
            {
                System.out.printf("%d\t",sum[i][j][k]);
            }
        System.out.println();
        }
    }
     for (int i=0;i<tables;i++)
    {
       for (int j=0;j<row;j++)
        {
            for (int k=0;k<col;k++)
            {
                 sum[i][j][k]= arr[i][j][k] *  arr[i][j][k];
            }
        }
    }
     System.out.println("Product: ");
     for (int i=0;i<tables-1;i++)
    {
       for (int j=0;j<row;j++)
        {
            for (int k=0;k<col;k++)
            {
                System.out.printf("%d\t",sum[i][j][k]);
            }
        System.out.println();
        }
        System.out.println();
    }
    System.out.print("Min element of the row ");
    smallRow(arr, row, col,tables);
    System.out.print("Min element of the col ");
    smallCol(arr, row, col,tables);
    System.out.println();
    System.out.print("Max element of the row ");
    maxRow(arr, row, col,tables); 
    System.out.print("Max element of the col ");
    maxCol(arr, row, col,tables);
    
    System.out.println();
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
    static void smallRow(int arr[][][], int row, int col,int tables){
        for (int i=0;i<tables;i++){   
            for (int j = 0; j < row; j++){
            int minr = arr[i][j][0];
            for (int k = 0; k < col; k++){
                if (arr[i][j][k] < minr){
                    minr = arr[i][j][k];
                }
            }
          System.out.print(minr + ", ");
            }
        }
        System.out.println();
    }
   
    static void smallCol(int arr[][][], int row, int col, int tables) {
        for (int i=0;i<tables;i++){
            for (int j = 0; j < col; j++){
            int minc = arr[0][0][j];
            for (int k = 1; k < row; k++){
                if (arr[i][k][j] < minc){
                    minc = arr[i][j][k];
                }
            }
            System.out.print(minc + ", ");
            }
        }
        System.out.println();
    }
    static void maxRow(int arr[][][], int row, int col,int tables) {
        for (int i=0;i<tables;i++){   
            for (int j = 0; j < row; j++){
            int maxr = arr[i][j][0];
            for (int k = 0; k < col; k++){
                if (arr[i][j][k] > maxr){
                    maxr = arr[i][j][k];
                }
            }
          System.out.print(maxr + ", ");
            }
        }
        System.out.println();
    }
    static void maxCol(int arr[][][], int row, int col, int tables) {
        for (int i=0;i<tables;i++){
        for (int j = 0; j < col; j++){
            int maxc = arr[0][0][j];
            for (int k = 1; k < row; k++) {
                if (arr[i][k][j] > maxc) {
                    maxc = arr[i][k][j];
                }
            }
            System.out.print(maxc + ", ");
        }
      }
    }
    public static void Mirror_Multidimensional(){
        
    System.out.printf("\nYou've chosen Mirror Multidimensional! \n\n");
    
    System.out.print("Enter the number of rows: ");
    int row = enter.nextInt();
    System.out.print("Enter the number of column: ");
    int col = enter.nextInt();
    
    int[][]arr = new int [row][col];
    
    for (int i=0;i< row;++i){
        for(int j=0;j<col;++j){
            arr[i][j] = enter.nextInt();
        }
     } 
        int out = 2;
        for(int i = 0; i < row; i++){
            for(int j = 0; j <col; j++){
                if(arr[i][0] == arr[i][col - 1]){
                    out = 1;
                }
            }
        }
        if(out == 1){
            System.out.println("mirror");
        }
        else{
            System.out.println("not");
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
}



