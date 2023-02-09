package students;

public class StudentsSubject {
    String[] studentsSubject,subjectDay;
    int[] subjectUnits, roomNumber;
    
    StudentsSubject(String[] studentsSubject, String[] subjectDay, int[] subjectUnits, int[] roomNumber){
        this.studentsSubject = studentsSubject;
        this.subjectDay = subjectDay;
        this.subjectUnits = subjectUnits;
        this.roomNumber = roomNumber;
    }
}
