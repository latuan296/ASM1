package com.company;


import java.util.HashMap;
import java.util.HashSet;

public class testUnit {
    public static void main(String[] args){
//      Sample data
        Student s1 = new Student("S001", "Tuan","29/06/1998");
        Student s2 = new Student("S002","Linh","25/11/2001");
        Course c1 = new Course("C001", "Further Programming",12);
        Course c2 = new Course("C002","MATH", 12);
        Course c3 = new Course("C003","SEPM",12);
        studentEnrolment test = new studentEnrolment();

//  test add student and course
        System.out.println("adding function");
        System.out.println(test.addStudent(s1));
        System.out.println(test.addStudent(s2));
        System.out.println(test.getStudentList());
        System.out.println(test.addCourse(c1));
        System.out.println(test.addCourse(c2));
        System.out.println(test.addCourse(c3));
        System.out.println(test.getCourseList());

//  test duplicate adding
        System.out.println("test false adding");
        System.out.println(test.addStudent(s1));
        System.out.println(test.addCourse(c1));

//  test enroll function
        System.out.println("enroll function");
        System.out.println(test.enrol("S001", "C001", "2022A"));
        System.out.println(test.enrol("S002", "C002", "2022A"));
        System.out.println(test.enrol("S002", "C003", "2022A"));


        System.out.println(test.enrol("S001","C003","2022B"));
        System.out.println(test.enrol("S002","C003","2022B"));

        System.out.println(test.enrol("S001","C003","2022C"));


//  test false enroll
        System.out.println("test false enroll");
        System.out.println(test.enrol("S001", "C001", "2022A"));
        System.out.println(test.enrol("S2","C001","2022A"));
        System.out.println(test.enrol("S001","C1","2022A"));

//  test get all student data in one sem (getStudentDataOneSem)
        System.out.println("test getStudentDataOneSem ");
        System.out.println(test.getStudentDataOneSem("S002","2022A"));

//  test wrong getStudentDataOneSem
        System.out.println("test wrong getStudentDataOneSem");
        System.out.println(test.getStudentDataOneSem("S2","2022A"));
        System.out.println(test.getStudentDataOneSem("S002","1"));

//  test Get all student in one semester (getStudentOneSem)
        System.out.println("Get all student in one semester (getStudentOneSem)");
        System.out.println(test.getStudentOneSem("2022A"));

//  test wrong getStudentOneSem
        System.out.println("test wrong getStudentOneSem ");
        System.out.println(test.getStudentOneSem("2"));

//  test get all student in 1 course in 1 semester (studentsInCourse)
        System.out.println("test get all student in 1 course in 1 semester (studentsInCourse)");
        System.out.println(test.studentsInCourse("2022A","C001"));

//  test wrong studentsInCourse
        System.out.println("test wrong studentsInCourse");
        System.out.println(test.studentsInCourse("1","C001"));
        System.out.println(test.studentsInCourse("2022A","1"));
        System.out.println(test.studentsInCourse("2022A","C003"));

//  test get all course in one semester (courseInSem)
        System.out.println("test get all course in one semester (courseInSem)");
        System.out.println(test.courseInSem("2022A"));

//  test wrong courseInSem
        System.out.println("test wrong courseInSem");
        System.out.println(test.courseInSem("2"));

//  test get one student & course data (getStudentInfor,getCourseInfor )
        System.out.println("test get one student & course data");
        System.out.println(test.getStudentInfor("S001"));
        System.out.println(test.getCourseInfor("C002"));

//  test wrong function
        System.out.println("test wrong function");
        System.out.println(test.getStudentInfor("S1"));
        System.out.println(test.getCourseInfor("C2"));


//  test delete course of 1 student in 1 semester (deleteCourse)
        System.out.println("test delete course of 1 student in 1 semester (deleteCourse)");
        System.out.println(test.deleteCourse("S001","2022A","C001"));

//  test wrong function
        System.out.println("test wrong function");
        System.out.println(test.deleteCourse("S1","2022A","C001"));
        System.out.println(test.deleteCourse("S001","A","C001"));
        System.out.println(test.deleteCourse("S001","2022A","1"));
//  test delete course duplicate ( check previous delete is work or not )
        System.out.println(test.deleteCourse("S001","2022A","C001"));

//  test student delete course that does not exist
        System.out.println(test.deleteCourse("S001","2022A","C003"));

//  test student does not exist in true course
        System.out.println(test.deleteCourse("S002","2022C","C003"));


    }
}
