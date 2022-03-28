package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("s3836290", "Le Anh Tuan","29/06/1998");
        Student s2 = new Student("S3836480","Nguyen Thuy Linh","25/11/2001");
        Course c1 = new Course("6666", "Further Programming",12);
        Course c2 = new Course("8888","MATH", 12);
        Course c3 = new Course("9999","SEPM",12);
        studentEnrolment systemDisplay = new studentEnrolment();
//        Student studentSystem = new Student();



//        ADD STUDENT LIST
//        systemDisplay.addStudent(s1);
//        systemDisplay.addStudent(s1);
//        systemDisplay.addStudent(s2);
//        System.out.println(e1.getStudentList());



//        ADD COURSE
//        systemDisplay.addCourse(c1);
//        systemDisplay.addCourse(c2);
//        systemDisplay.addCourse(c2);
//        systemDisplay.addCourse(c3);
//        System.out.println(systemDisplay.getCourseList());



//  ENROLL STUDENT TO STUDENT ENROLMENT
////  sem 2020A
        systemDisplay.enrol(s1,c1,"2020A");
//        systemDisplay.enrol(s1,c1,"2020A");
        systemDisplay.enrol(s1,c2,"2020A");
//        systemDisplay.enrol(s2,c1,"2020A");
//        systemDisplay.enrol(s2,c3,"2020A");
//        systemDisplay.enroll(s2,c3,"2020A");
//
////  sem 2021B
//        systemDisplay.enrol(s2,c3,"2021B");
//        systemDisplay.enrol(s2,c3,"2021B");
//        systemDisplay.enrol(s2,c1,"2021B");
//        systemDisplay.enrol(s1,c2,"2021B");
//// sem 2022C
//        systemDisplay.enrol(s1,c3,"2022C");
//        systemDisplay.enrol(s1,c1,"2022C");
//        systemDisplay.enrol(s2,c2,"2022C");
//        systemDisplay.enrol(s2,c3,"2022C");
//        System.out.println(systemDisplay.enrol(s2,c1,"2022C"));
//
        System.out.println(systemDisplay.getEnrollList());



//  Update student
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input 1 to update name OR 2 to update DOB: ");
//        int a = scanner.nextInt();
//        systemDisplay.updateStudent("s3836290",2,"123");
//        System.out.println(systemDisplay.getStudentList());


////  Update course
////        add function verify user input
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input 1 to update course name OR 2 to update credit point: ");
//        int a = scanner.nextInt();
//
//        systemDisplay.updateCourse("COSC2440",a,"123");
//        System.out.println(systemDisplay.getCourseList());


////  Get one Student in semester
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input semester: ");
//        String semester = scanner.nextLine();
//        System.out.println(systemDisplay.getOne(semester));


////  Get all student in 1 course 1 sem
//        System.out.println("Input follow structure to get student data");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input semester : ");
//        String semester = scanner.nextLine();
//        System.out.print("Input courseID: ");
//        String courseID = scanner.nextLine();
//        System.out.println(systemDisplay.studentsInCourse(semester,courseID));




//  Delete function
//        System.out.println("Input follow structure to delete course data");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input student name: ");
//        String studentName = scanner.nextLine();
//
//        System.out.print("Input student ID: ");
//        String studentID = scanner.nextLine();
//
//        System.out.print("Input semester want to delete: ");
//        String semester = scanner.nextLine();
//
//        System.out.print("Input course name to delete: ");
//        String courseName = scanner.nextLine();
//
//        System.out.print("Input course ID to delete: ");
//        String courseID = scanner.nextLine();
//
//        System.out.println(systemDisplay.deleteCourse(studentName,studentID,semester,courseName,courseID));
//        System.out.println(systemDisplay.deleteCourse("Le Anh Tuan","s3836290","2020A","Further Programming","6666"));
//        System.out.println(systemDisplay.getEnrollList());


//  Get all courses in one sem
//        System.out.println(systemDisplay.courseInSem("2020A"));











    }
}
