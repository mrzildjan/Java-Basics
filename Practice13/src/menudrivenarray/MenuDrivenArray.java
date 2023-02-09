package menudrivenarray;

import java.io.IOException;
import java.util.*;

public class MenuDrivenArray {
    static Scanner enter = new Scanner (System.in);
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
    System.out.print("\t\t* * * * * \t\t     1. Negative Elements\t\t\t  * * * * *\n\t\t* * * * *\t\t     2. Odd and Even\t\t\t\t  * * * * *\n\t\t* * * * *\t\t     3. Copy Elements\t\t\t\t  * * * * *\n\t\t* * * * *\t\t     4. Reversing a One-Dimensional Array\t  * * * * *\n\t\t* * * * *\t\t     5. Student IDs & Grades\t\t\t  * * * * *\n\t\t* * * * *\t\t     6. Largest and Second Element\t\t  * * * * *\n\t\t* * * * *\t\t     7. Insert an element\t\t\t  * * * * *\n\t\t* * * * *\t\t     8. Exit\t\t\t\t\t  * * * * *\n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * $ $ $ $   $ $ $   $         $ $ $           $         $         $     $ * * * \n");
    System.out.print("\t\t* * *     $       $     $         $     $         $       $   $       $ $   $ * * * \n");
    System.out.print("\t\t* * *   $         $     $         $     $   $     $     $ $ $ $ $     $   $ $ * * * \n");
    System.out.print("\t\t* * * $ $ $ $   $ $ $   $ $ $ $   $ $ $     $ $ $ $   $           $   $     $ * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n");
    System.out.print("\nChoose Between [1-8]: ");
    option = enter.nextInt();
    
    switch(option){
            case 1:
                NegativeElements();
                break;
            case 2:
                EvenOdd();
                break;
            case 3:
                CopyElements();
                break;
            case 4:
                ReversingaOneDimensionalArray();
                break;
            case 5:
                StudentIDsGrades();
                break;
            case 6:
                LargestSecondElement();
                break;
            case 7:
                InsertElement();
                break;
            case 8:
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
    public static void NegativeElements(){
          
    int[] arr = new int[100];

    System.out.printf("\nYou've chosen Negative Elements! \n\n");
    System.out.print("Array Sized: ");
    int num = enter.nextInt();
  
    for (int i=0;i<num;i++)
    {
        System.out.printf("%d. Enter Positive or Negative Numbers: ", i+1);
        arr[i] = enter.nextInt();
    }

    for (int i=0;i<num;i++)
    {
      if(arr[i]<=-1)
        {
            System.out.println("Negative Elements: " + arr[i]);
        }
      else
      {
            System.out.println("\nNo Negative Elements!");
      }
    }
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
    public static void EvenOdd(){
        
    int[] arr = new int [100];
    int e=0, o=0;

    System.out.printf("\nYou've chosen Even Odds! \n\n");
    System.out.print("Array Size: ");
    int num = enter.nextInt();

    for(int i=0; i<num; i++){
        System.out.printf("%d. Enter elements: ", i+1);
          arr[i] = enter.nextInt();
    }
    for(int i=0; i<num; i++)
    {
        if(arr[i]%2==0)
        {
            e++;
        }
        else
        {
            o++;
        }
    }
    System.out.println("Total even Elements: " + e);
    System.out.println("Total odd Elements: " + o);
    
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
    public static void CopyElements(){
        
    int[] arr = new int [100];

    System.out.printf("\nYou've chosen Copy Elements! \n\n");
    System.out.printf("Array Size: ");
    int num = enter.nextInt();

    for (int i=0; i<num; i++)
    {
        System.out.printf("%d. Enter Elements: ", i+1);
        arr[i] = enter.nextInt();
    }
    System.out.printf("Elements of source array are :\n");
    for (int i=0; i<num; i++)
    {
       System.out.printf("%d\t",arr[i]);
    }
    System.out.printf("\nElements of dest array are :\n");
    for (int i=0; i<num; i++)
    {
        System.out.printf("%d\t",arr[i]);
    }
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
    public static void ReversingaOneDimensionalArray(){
        
        int[] arr = new int[100];
        
        System.out.printf("\nYou've chosen Reversing One-Dimensional Array! \n\n");
        System.out.print("Array Size: ");
        int size = enter.nextInt();
        
        for(int i=1; i<=size; i++)
        {
            System.out.printf("%d. Enter elements: ", i);
            arr[i]= enter.nextInt();

        }
        System.out.println("Elements after reversed: ");
        for(int i=size; i>=1; i--)
        {
           System.out.print(arr[i] + " ");
        }
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
    public static void StudentIDsGrades(){
        
        int[] id = new int[100];
        double[] grades = new double[100];
        double[] lowGrades = new double[100];
        double sum = 0;
        
        System.out.printf("\nYou've chosen StudentIDs & Grades! \n\n");
        System.out.print("How many students: ");
        int student = enter.nextInt();
        
        System.out.print("How many subject: ");
        int subject = enter.nextInt();
        
        for(int i=1; i<=student; i++)
        {
            System.out.printf("[%d] Enter 4 digit Student ID: ",i);
            id[i] = enter.nextInt();
            
            for(int j=0; j<subject; j++)
            {
                System.out.printf("%d. Enter Grade: ",j+1);
                grades[j] = enter.nextInt();  
                sum = sum + grades[j];
            }
            lowGrades[i] = sum;
                sum=0;
        }
        
        System.out.println();
        System.out.print("Student ID:            Average:\n");
        for(int i=1; i<=student; i++)
        {
            System.out.print(id[i]);
            for(int j=1; j<=1; j++)
            {
                     System.out.printf("%24.2f\n",lowGrades[i]/subject);
                     
            }
        }
        System.out.println();
        System.out.println("Students ID and Grades got grades below the average");
        System.out.print("Student ID:            Average:\n");
        for(int i=1; i<=student; i++)
        {
            for(int j=1; j<=1; j++)
            {
                     if(lowGrades[i]/subject<75)
                     {
                         System.out.printf(id[i]+ "%24.2f\n",lowGrades[i]/subject);
                     }
            }
        }
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
    public static void LargestSecondElement(){
        
    int[] arr = new int[100];

    System.out.printf("\nYou've chosen Largest & Second Elements! \n\n");
    System.out.printf("Array Size: ");
    int num = enter.nextInt();

    for (int i=0; i<num; i++)
    {
        System.out.printf("%d. Enter Element: ", i+1);
        arr[i] = enter.nextInt();
    }
    int l1=arr[0];
    for (int i=0; i<num; i++)
    {
        if(arr[i]>l1)
        {
            l1=arr[i];
        }
    }
    int l2=arr[0];
    for (int i=0; i<num; i++)
    {
        if(arr[i]>l2 && arr[i]<l1)
        {
            l2=arr[i];
        }
    }
    System.out.printf("The First Largest is %d then the Second %d", l1,l2);
    
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
    public static void InsertElement(){
    
    System.out.printf("\nYou've chosen Insert Element! \n\n");
    System.out.print("Array Size: ");
    int size = enter.nextInt();
    int[] arr = new int[size +1];

    for(int i=0; i <size; i++)
    {
        System.out.printf("%d. Enter elements: ", i+1);
        arr[i]=enter.nextInt();
    }
    System.out.print("Enter the location where you want to insert an element: ");
    int location = enter.nextInt();
    System.out.println();
    System.out.print("Enter the value to insert: ");
    int value = enter.nextInt();
    
    for (int i=size-1; i>=location-1; i--)
    {
        arr[i+1]= arr[i];
    }
  
    arr[location-1]=value;
    System.out.println();
    System.out.print("Inserted Element: ");
    for(int i=0; i <size; i++)
    {
        System.out.print(arr[i] + " ");
    }
    System.out.print(arr[size]);
    
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
}

