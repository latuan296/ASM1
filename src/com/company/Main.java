package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Main {

    public static void main(String[] args) {

//  Sample Data
        Student s1 = new Student("s3836290", "Le Anh Tuan","29/06/1998");
        Student s2 = new Student("S3836480","Nguyen Thuy Linh","25/11/2001");
        Course c1 = new Course("6666", "Further Programming",12);
        Course c2 = new Course("8888","MATH", 12);
        Course c3 = new Course("9999","SEPM",12);
        studentEnrolment systemDisplay = new studentEnrolment();
        Scanner scanner = new Scanner(System.in);


// create a menu function of Managing interactions
        System.out.println("Student Enrolment System");
        System.out.println("Please choose option you want to use: " + "\n" +
                " + Press 1 to create student OR course" + "\n" +
                " + Press 2 to enroll for student" + "\n" +
                " + Press 3 to update Student OR Course" + "\n" +
                " + Press 4 to get data from system " + "\n" +
                " + Press 5 to delete course for student: " + "\n" +
                " + Press 9 to stop exit");
        System.out.print("Please enter option that you want: ");
        int optionNum = scanner.nextInt();

        while (true) {
//  OPTION 1
            if (optionNum == 1) {
                System.out.print("Create new student press 1 OR create new course press 2: ");
                int option = scanner.nextInt();
                if (option == 1){
                    System.out.print("Input student ID: ");
                    String studentID = scanner.next();
                    System.out.print("Input student name: ");
                    String studentName = scanner.next();
                    scanner.nextLine();
                    System.out.print("Input student birthday: ");
                    String studentBirthdate = scanner.next();
                    Student s3 = new Student(studentID,studentName,studentBirthdate);
                    systemDisplay.addStudent(s3);
//                    System.out.println(systemDisplay.getStudentList());
                    System.out.println("Do you want to continue add new student or course? Press 1 to return menu option OR press any number to Exit");
                    System.out.print("Enter your option: ");
                    int exit = scanner.nextInt();
                    scanner.nextLine();
                    if (exit == 1){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                else if(option == 2){
                    System.out.print("Input course ID: ");
                    String courseID = scanner.next();
                    System.out.print("Input course name: ");
                    String courseName = scanner.next();
                    System.out.print("Input course Credit point: ");
                    int courseCredit = scanner.nextInt();
                    Course c4 = new Course(courseID,courseName,courseCredit);
                    systemDisplay.addCourse(c4);
                    System.out.println(systemDisplay.getCourseList());
                    System.out.println("Do you want to continue add new student or course? Press 1 to continue OR press any number to Exit");
                    System.out.print("Enter your option: ");
                    int exit = scanner.nextInt();
                    scanner.nextLine();
                    if (exit == 1){
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
//  OPTION 2
            else if (optionNum == 2) {
                System.out.println("Please input follow structure to enroll !");
                scanner.nextLine();
                System.out.print("Input student name: ");
                String studentName = scanner.nextLine();
                System.out.print("Input student ID: ");
                String studentID = scanner.nextLine();
                System.out.print("Input course name: ");
                String courseName = scanner.nextLine();
                System.out.print("Input course ID: ");
                String courseID = scanner.nextLine();
                System.out.print("Input semester: ");
                String semester = scanner.nextLine();
                System.out.println(systemDisplay.enrol(studentName,studentID,courseID,courseName,semester));
                System.out.println(systemDisplay.getEnrollList());
                System.out.println("Do you want to continue enroll ? Press 1 to continue OR press any number to Exit");
                System.out.print("Enter your option: ");
                int exit = scanner.nextInt();
                scanner.nextLine();
                if (exit == 1){
                    continue;
                }
                else {
                    break;
                }


//  Option 3
            } else if (optionNum == 3) {
                break;
            } else if (optionNum == 4) {
                break;
            }
            else if (optionNum == 9) {
                break;
            }
            else {
                break;
            }
        }











//  ADD STUDENT LIST
//        System.out.print("Input student ID: ");
//        String studentID = scanner.nextLine();
//        System.out.print("Input student name: ");
//        String studentName = scanner.nextLine();
//        System.out.print("Input student birthday: ");
//        String studentBirthdate = scanner.nextLine();
//        Student s3 = new Student(studentID,studentName,studentBirthdate);
//        systemDisplay.addStudent(s1);

//        systemDisplay.addStudent(s1);
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

//        systemDisplay.addCourse(c1);
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
//        systemDisplay.enrol("Le Anh Tuan","s3836290","6666","Further Programming","2020A");
//        systemDisplay.enrol("Le Anh Tuan","s3836290","7777","Math","2020A");
//        systemDisplay.enrol("Le Anh Tuan","s3836290","7777","Math","2020A");
//        System.out.println(systemDisplay.getEnrollList());


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


////  Get all Student in semester
//        System.out.print("Input semester: ");
//        String semester = scanner.nextLine();
//        System.out.println(systemDisplay.getOne(semester));


//  Get all course from 1 student in 1 semester

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
//        System.out.print("Input semester : ");
//        String semester = scanner.nextLine();
//        System.out.print("Input courseID: ");
//        String courseID = scanner.nextLine();
//        System.out.println(systemDisplay.studentsInCourse(semester,courseID));


// Get all courses in one sem
//        System.out.print("Input semester: ");
//        String semester = scanner.nextLine();
//        System.out.println(systemDisplay.courseInSem(semester));


//  Delete function (drop course)
//        System.out.println("Input follow structure to delete course data");
//
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
//        System.out.println(systemDisplay.deleteCourse("Le Anh Tuan","s3836290","2020A","Math","7777"));
//        System.out.println(systemDisplay.getEnrollList());


    }
}














