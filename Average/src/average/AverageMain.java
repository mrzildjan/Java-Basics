package average;

import java.util.*;

public class AverageMain {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int n1 = enter.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = enter.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = enter.nextInt();
        
        Average result = new Average(n1,n2,n3);
        
        System.out.println(result.getAverage(n1, n2, n3));
       
    }
}
