package areas;

import java.util.*;

public class AreasMain {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        double length = enter.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = enter.nextDouble();
        
        Areas result = new Areas();
        
        System.out.println(result.getArea(length, breadth));
    }
}

