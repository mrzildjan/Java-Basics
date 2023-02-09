package students;

import java.util.*;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        System.out.print("Enter Number of Students: ");
        int numStudents = enter.nextInt();
        System.out.println();
        
        String[] firstName = new String[numStudents];
        String[] middleName = new String[numStudents];
        String[] lastName = new String[numStudents];
        int[] studentsAge = new int[numStudents];
        String[] studentSex = new String[numStudents];
        String[] studentsSection = new String[numStudents];
        int[] studentsYear = new int[numStudents];
        String[] studentsSubject = new String[numStudents];
        String[] subjectDay = new String[numStudents];
        int[] subjectUnits = new int[numStudents];
        int[] roomNumber = new int[numStudents];
        
        for(int i=0; i<numStudents; i++){
            System.out.print(i+1 + ". " + "Enter Students Name: ");
            firstName[i] = enter.next();
            middleName[i] = enter.next();
            lastName[i] = enter.next();
            System.out.print("Enter Students Age: ");
            studentsAge[i] = enter.nextInt();
            System.out.print("Enter Students Sex : ");
            studentSex[i] = enter.next();
            System.out.print("Enter Students Year: ");
            studentsYear[i] = enter.nextInt();
            System.out.print("Enter Students Section: ");
            studentsSection[i] = enter.next();
            System.out.println();
            System.out.print("Enter Subject: ");
            studentsSubject[i] = enter.next();
            System.out.print("Enter Day: ");
            subjectDay[i] = enter.next();
            System.out.print("Enter Number of Units: ");
            subjectUnits[i] = enter.nextInt();
            System.out.print("Enter Room Number: ");
            roomNumber[i] = enter.nextInt();
            System.out.println();
        }
        
        Students classStudents = new Students(numStudents,firstName,middleName,lastName,studentsAge,studentSex,studentsSection,studentsYear);
        StudentsSubject classSubject = new StudentsSubject(studentsSubject,subjectDay,subjectUnits,roomNumber);
        System.out.println();
        
        System.out.println("Number of Students: " + classStudents.numStudents + "\n");
        for(int i=0; i<numStudents; i++){
            System.out.println("Names: " + classStudents.firstName[i]+ " " + classStudents.middleName[i] + " " + classStudents.lastName[i]+ "\n" +
                               "Age: " + classStudents.studentsAge[i] + "\n"+
                               "Sex: " + classStudents.studentSex[i] + "\n"+
                               "Year & Section: " + classStudents.studentsYear[i] + " - " + classStudents.studentsSection[i] + "\n" +
                               "Subject: " + classSubject.studentsSubject[i]+ "\n" +
                               "Day: " + classSubject.subjectDay[i] + "\n"+
                               "Units: " + classSubject.subjectUnits[i] + "\n"+
                               "Room Number: " + classSubject.roomNumber[i] + "\n\n");
        }
    }
}
