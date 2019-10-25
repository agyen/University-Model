package io.turntabl.university;

public class Lecturer {
    String lecturersName;
    LecturersSubject lecturersSubject;

    public Lecturer(String lecturersName, LecturersSubject lecturersSubject) {
        this.lecturersName = lecturersName;
        this.lecturersSubject = lecturersSubject;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecturersName='" + lecturersName + '\'' +
                ", lecturersSubject=" + lecturersSubject +
                '}';
    }

    public String getLecturersName() {
        return lecturersName;
    }

    public void setLecturersName(String lecturersName) {
        this.lecturersName = lecturersName;
    }

    public LecturersSubject getLecturersSubject() {
        return lecturersSubject;
    }

    public void setLecturersSubject(LecturersSubject lecturersSubject) {
        this.lecturersSubject = lecturersSubject;
    }
}
