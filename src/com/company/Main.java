package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Main {

    public static void main(String[] args) {

//  System data
        Student s1 = new Student("s3836290", "Le Anh Tuan","29/06/1998");
        Student s2 = new Student("S3836480","Nguyen Thuy Linh","25/11/2001");
        Course c1 = new Course("6666", "Further Programming",12);
        Course c2 = new Course("8888","MATH", 12);
        Course c3 = new Course("9999","SEPM",12);
        studentEnrolment systemDisplay = new studentEnrolment();
//        Student studentSystem = new Student();
        Scanner scanner = new Scanner(System.in);




//  ADD STUDENT LIST
//        System.out.print("Input student ID: ");
//        String studentID = scanner.nextLine();
//        System.out.print("Input student name: ");
//        String studentName = scanner.nextLine();
//        System.out.print("Input student birthday: ");
//        String studentBirthdate = scanner.nextLine();
//        Student s3 = new Student(studentID,studentName,studentBirthdate);
//        systemDisplay.addStudent(s1);

        systemDisplay.addStudent(s1);
//        systemDisplay.addStudent(s1);
//        systemDisplay.addStudent(s2);
//        System.out.println(systemDisplay.getStudentList());


//        ADD COURSE
//        System.out.print("Input course ID: ");
//        String courseID = scanner.nextLine();
//        System.out.print("Input course name: ");
//        String courseName = scanner.nextLine();
//        System.out.print("Input course Credit point: ");
//        int courseCredit = scanner.nextInt();
//        Course c4 = new Course(courseID,courseName,courseCredit);
//        systemDisplay.addCourse(c4);

        systemDisplay.addCourse(c1);
//        systemDisplay.addCourse(c2);
//        systemDisplay.addCourse(c2);
//        systemDisplay.addCourse(c3);
//        System.out.println(systemDisplay.getCourseList());


//  ENROLL STUDENT TO STUDENT ENROLMENT
//        System.out.print("Input student name: ");
//        String studentName = scanner.nextLine();
//        System.out.print("Input student ID: ");
//        String studentID = scanner.nextLine();
//        System.out.print("Input course name: ");
//        String courseName = scanner.nextLine();
//        System.out.print("Input course ID: ");
//        String courseID = scanner.nextLine();
//        System.out.print("Input semester: ");
//        String semester = scanner.nextLine();
//        systemDisplay.enrol(studentName,studentID,courseID,courseName,semester);
//        System.out.println(systemDisplay.getEnrollList());
        systemDisplay.enrol("Le Anh Tuan","s3836290","6666","Further Programming","2020A");
        systemDisplay.enrol("Le Anh Tuan","s3836290","7777","Math","2020A");
        systemDisplay.enrol("Le Anh Tuan","s3836290","7777","Math","2020A");

//  Update student
//        System.out.print("Input student ID: ");
//        String studentID = scanner.nextLine();
//        System.out.print("Input 1 to update name OR 2 to update DOB: ");
//        int option = scanner.nextInt();
//        System.out.print("Input update data: ");
//        String updateData = scanner.next();
//        systemDisplay.updateStudent(studentID,option,updateData);

//        systemDisplay.updateStudent("s3836290",2,"123");
//        System.out.println(systemDisplay.getStudentList());


////  Update course
//        System.out.print("Input course ID: ");
//        String courseID = scanner.nextLine();
//        System.out.print("Input 1 to update course name OR 2 to update credit point: ");
//        int option = scanner.nextInt();
//        System.out.print("Input update data: ");
//        String updateData = scanner.next();
//        systemDisplay.updateCourse(courseID,option,updateData);
//        systemDisplay.updateCourse("6666",2,"123");

//        System.out.println(systemDisplay.getCourseList());


////  Get one Student in semester
//        System.out.print("Input semester: ");
//        String semester = scanner.nextLine();
//        System.out.println(systemDisplay.getOne(semester));


//  Get all course from 1 student in 1 semester
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input student name: ");
//        String studentName = scanner.nextLine();
//        System.out.print("Input student ID: ");
//        String studentID = scanner.nextLine();
//        System.out.print("Input semester: ");
//        String semester = scanner.nextLine();
//
//        System.out.println(systemDisplay.getOneData(studentName,studentID,semester));
//        System.out.println(systemDisplay.getOneData("Le Anh Tuan","s3836290","2020A"));



////  Get all student in 1 course 1 sem
//        System.out.println("Input follow structure to get student data");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input semester : ");
//        String semester = scanner.nextLine();
//        System.out.print("Input courseID: ");
//        String courseID = scanner.nextLine();
//        System.out.println(systemDisplay.studentsInCourse(semester,courseID));


// Get all courses in one sem
//        System.out.println(systemDisplay.courseInSem("2022C"));


//  Delete function (drop course)
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





//  Sort data to write

//  Create CSV File
//        try {
//            File myObj = new File("default.csv");
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        }
//
//        catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }


//  Write file

//        try {
//            FileWriter myWriter = new FileWriter("default.csv");
//
//            myWriter.write("test" + "\n");
//            myWriter.write("test2");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        }
//
//        catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }


    }
}














