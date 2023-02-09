package searching;

import java.util.*;

public class Searching {   
    public static void main(String[] args) {
       Scanner op = new Scanner (System.in);
       
       System.out.println("Welcome to Linear and Binary Search Menu Driven Program\nPlease input the Size and elements of array\nAlso Please Input the Search Method you want.");
       System.out.print("Enter the Size of the array: ");
       int num= op.nextInt();
       int[] arr = new int [num];
       
       System.out.print("Enter the Element of the Array: ");
       for(int i=0;i<num;i++)
       {
           arr[i]= op.nextInt();
       }
       
       System.out.print("Enter the number to be searched: ");
       int search = op.nextInt();
       
       System.out.print("Please Select the Type of Search Method you want (1) Linear Search (2) Binary Search: ");
       int ch = op.nextInt();
       switch(ch){
           case 1:
              int result= linSearch(arr,search);
               if(result ==-1)
               {
                   System.out.println("Element Cannot be Found");
               }
               else{
                   result+=1;
                   System.out.println("Element is present at location # " + result);
               }
                
           break;
           case 2 : 
               int result1 = biSearch(arr,search);
             if(result1 ==-1)
               {
                   System.out.println("Element Cannot be Found");
               }
               else{
                  
                   System.out.println("Element is present at location # " + result1);
               }
               
       }
    }
     public static int linSearch(int[] arr, int search) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == search)
                return j;
        }

        return -1;
    }
     public static int biSearch(int[] arr, int search) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (search < arr[middle]) {
                right = middle - 1;
            } else if (search > arr[middle]) {
                left = middle + 1;
            } else
                return middle;
                System.out.println(middle);

        }return -1;
    }
}