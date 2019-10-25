package io.turntabl.university;

public class Student {
    String studentsName;
    String studentsID;
    StudentsLevel studentsLevel;

    public Student(String studentsName, String studentsID, StudentsLevel studentsLevel) {
        this.studentsName = studentsName;
        this.studentsID = studentsID;
        this.studentsLevel = studentsLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentsName='" + studentsName + '\'' +
                ", studentsID='" + studentsID + '\'' +
                ", studentsLevel=" + studentsLevel +
                '}';
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public String getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(String studentsID) {
        this.studentsID = studentsID;
    }

    public StudentsLevel getStudentsLevel() {
        return studentsLevel;
    }

    public void setStudentsLevel(StudentsLevel studentsLevel) {
        this.studentsLevel = studentsLevel;
    }
}
