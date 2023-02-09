package employees;

import java.util.*;

public class EmployeesMain {

    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        
        System.out.print("How many Employees to be Enter: ");
        int employee = enter.nextInt();
        
        String[] name = new String[employee];
        int[] year = new int[employee];
        String[] address = new String[employee];
       
        for (int i=0; i<employee; i++){
        System.out.print(i+1+". Enter Name: ");
        name[i] = enter.next();
        
        System.out.print("Enter Year: ");
        year[i] = enter.nextInt();
        
        System.out.print("Enter Address: ");
        address[i] = enter.next();
        
        System.out.println();
        }
        
        Employees result = new Employees(name, year, address);
        
        System.out.println("Name \t\tYear of Joining \tAddress");
        for(int i=0; i<employee; i++){
            System.out.println(result.name[i]+ "\t\t" +
                               result.year[i] + "\t\t\t"+
                               result.address[i] + "\t\t");
        }
   }
}

 

