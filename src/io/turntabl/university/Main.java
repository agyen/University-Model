package io.turntabl.university;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Student> studentList = Arrays.asList(
                new Student("Isaac Agyen", "TLC111", StudentsLevel.FOURTH),
                new Student("Effa Dennis", "TLC112", StudentsLevel.SECOND),
                new Student("Dawud Ismail", "TLC113", StudentsLevel.FIRST),
                new Student("John Erbynn", "TLC114", StudentsLevel.FOURTH),
                new Student("Francis Billa", "TLC115", StudentsLevel.FIRST),
                new Student("Sammy Bartels", "TLC116", StudentsLevel.SECOND),
                new Student("Ali Mohammed", "TLC117", StudentsLevel.THIRD),
                new Student("Patricia Kasapa", "TLC118", StudentsLevel.THIRD),
                new Student("Christiana Asare", "TLC119", StudentsLevel.THIRD),
                new Student("Doreen Doodo", "TLC120", StudentsLevel.FOURTH),
                new Student("Yaa Nuamah", "TLC121", StudentsLevel.FIRST),
                new Student("Samuel Osei", "TLC122", StudentsLevel.SECOND),
                new Student("Alex Owusu", "TLC123", StudentsLevel.THIRD),
                new Student("Shadrack Amoako", "TLC124", StudentsLevel.THIRD),
                new Student("David Andoh", "TLC125", StudentsLevel.FOURTH),
                new Student("Franklin Luther", "TLC126", StudentsLevel.THIRD));

        List<Student> introToProgramming = new ArrayList<>();
        for (Student firstYearStudents: studentList) {
            if(firstYearStudents.getStudentsLevel() == StudentsLevel.FIRST){
                introToProgramming.add(firstYearStudents);
            }
        }
        printNamesofProgrammingStudents(introToProgramming);

        List<String> programmingStudentsList = new ArrayList<>();
        for(Student fys: introToProgramming ){
            programmingStudentsList.add(fys.getStudentsName());
        }

        List<Student> advancedGardeningClass = new ArrayList<>();
        for(Student advancedGardeningClassList : studentList){
            if(advancedGardeningClassList.getStudentsLevel() == StudentsLevel.THIRD ||
                    advancedGardeningClassList.getStudentsLevel() == StudentsLevel.FOURTH  ){
                advancedGardeningClass.add(advancedGardeningClassList);

            }
        }
        printNamesofGardeningClass(advancedGardeningClass);

        List<String> gardeningClass = new ArrayList<>();
        for(Student agcl : advancedGardeningClass){
            gardeningClass.add(agcl.getStudentsName());
        }

        List<Student> physicsCourse = new ArrayList<>();
        for (Student physicsCourseList: studentList){
            if(physicsCourseList.getStudentsLevel() == StudentsLevel.FOURTH &&
                    physicsCourseList.getStudentsName().matches("[aeiouAEIOU].*") ){
                physicsCourse.add(physicsCourseList);
            }
        }
        printNamesOfPhysicsStudent(physicsCourse);

        List<String> physicsClass = new ArrayList<>();
        for(Student pc : physicsCourse){
            physicsClass.add(pc.getStudentsName());
        }
    }

    private static void printNamesOfPhysicsStudent(List<Student> physicsCourse) {
        System.out.println("physics students with names starting with vowel: " + physicsCourse);
    }


    private static void printNamesofGardeningClass(List<Student> advancedGardeningClass) {
        System.out.println("Gardening Class: " + advancedGardeningClass);
    }


    private static void printNamesofProgrammingStudents(List<Student> introToProgramming) {
        System.out.println("All first year Students reading Intro prog are: " + introToProgramming);
    }


//



}
