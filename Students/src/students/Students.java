package students;

class Students {
    int numStudents;
    int[] studentsAge, studentsYear;
    String[] firstName, middleName, lastName, studentSex, studentsSection;
    
    Students(int numStudents, String[] firstName, String[] middleName,String[] lastName, int[] studentsAge, String[] studentSex, String[] studentsSection, int[] studentsYear){
        this.numStudents = numStudents;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.studentsAge = studentsAge;
        this.studentSex = studentSex;
        this.studentsYear = studentsYear;
        this.studentsSection = studentsSection;
    }
}
