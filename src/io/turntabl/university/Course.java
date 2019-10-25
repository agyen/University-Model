package io.turntabl.university;

import java.util.List;

public class Course {
    Lecturer courseLecturer;
    List<Student> courseStudents;
    CourseYear courseYear;

    public Course(Lecturer courseLecturer, List<Student> courseStudents, CourseYear courseYear) {
        this.courseLecturer = courseLecturer;
        this.courseStudents = courseStudents;
        this.courseYear = courseYear;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseLecturer=" + courseLecturer +
                ", courseStudents=" + courseStudents +
                ", courseYear=" + courseYear +
                '}';
    }

    public Lecturer getCourseLecturer() {
        return courseLecturer;
    }

    public void setCourseLecturer(Lecturer courseLecturer) {
        this.courseLecturer = courseLecturer;
    }

    public List<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(List<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public CourseYear getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(CourseYear courseYear) {
        this.courseYear = courseYear;
    }
}
