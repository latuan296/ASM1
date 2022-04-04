package com.company;

import java.util.*;


public class Main {


    public static void main(String[] args) {
//  Sample Data
//  Sample students & course
        Student s1 = new Student("s3836290", "Le Anh Tuan","29/06/1998");
        Student s2 = new Student("s3836480","Nguyen Thuy Linh","25/11/2001");
        Course c1 = new Course("COSC2440", "Further Programming",12);
        Course c2 = new Course("MATH2081","MATH", 12);
        Course c3 = new Course("ISYS2101","SEPM",12);
        studentEnrolment systemDisplay = new studentEnrolment();

//  Create sample list
//  Add sample student list
        systemDisplay.addStudent(s1);
        systemDisplay.addStudent(s2);
//  Add sample course list
        systemDisplay.addCourse(c1);
        systemDisplay.addCourse(c2);
        systemDisplay.addCourse(c3);

//  Enroll sample list
////  SEM 2022A
        systemDisplay.enrol("s3836290","COSC2440","2022A");
        systemDisplay.enrol("s3836290","MATH2081","2022A");
        systemDisplay.enrol("s3836480","COSC2440","2022A");
        systemDisplay.enrol("s3836480","COSC2440","2022A");
////  SEM 2022B
        systemDisplay.enrol("s3836290","ISYS2101","2022B");
        systemDisplay.enrol("s3836480","ISYS2101","2022B");
        systemDisplay.enrol("s3836480","MATH2081","2022B");
        System.out.println(systemDisplay.getEnrollList());



        while (true) {
//  Create a menu function of Managing interactions
            Scanner scanner = new Scanner(System.in);
            System.out.println("**** Student Enrolment System ****");
            System.out.println("Please choose option you want to use: " + "\n" +
                    " + Press 1 to create new Student OR Course" + "\n" +
                    " + Press 2 to update Student OR Course data" + "\n" +
                    " + Press 3 to enroll for student" + "\n" +
                    " + Press 4 to get Data from system " + "\n" +
                    " + Press 5 to delete course for student: " + "\n" +
                    " + Press any button else to Exit System");
            System.out.print("Please enter option that you want: ");
            String optionNum = scanner.nextLine();
//  Create and Add new DATA
            if (optionNum.equals("1")) {
                System.out.print("Create new student press 1 OR create new course press 2: ");
                String option = scanner.nextLine();
                if (option.equals("1")){
                    System.out.println("Create New Student");
                    System.out.print("Input student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Input student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Input student birthday: ");
                    String studentBirthdate = scanner.nextLine();
                    Student s3 = new Student(studentID,studentName,studentBirthdate);
                    systemDisplay.addStudent(s3);
                    System.out.println(systemDisplay.getStudentList());
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                else if(option.equals("2")){
                    System.out.println("Create New Course");
                    System.out.print("Input course ID: ");
                    String courseID = scanner.nextLine();
                    System.out.print("Input course Credit point: ");
                    int courseCredit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Input course name: ");
                    String courseName = scanner.nextLine();
                    Course c4 = new Course(courseID,courseName,courseCredit);
                    systemDisplay.addCourse(c4);
                    System.out.println(systemDisplay.getCourseList());
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
//  Update DATA
            else if (optionNum.equals("2")) {
                System.out.print("Update student data press 1 OR update course data press 2: ");
                String option = scanner.nextLine();
                if (option.equals("1")){
                    System.out.println("Update student data");
                    System.out.print("Input student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Input 1 to update name OR 2 to update DOB: ");
                    String op = scanner.nextLine();
                    System.out.print("Input update data: ");
                    String updateData = scanner.nextLine();
                    systemDisplay.updateStudent(studentID,op,updateData);
                    System.out.println(systemDisplay.getStudentList());
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                else if (option.equals("2")){
                    System.out.println("Update Course data");
                    System.out.print("Input course ID: ");
                    String courseID = scanner.nextLine();
                    System.out.print("Input 1 to update course name OR 2 to update credit point: ");
                    String op = scanner.nextLine();
                    System.out.print("Input update data: ");
                    String updateData = scanner.nextLine();
                    systemDisplay.updateCourse(courseID,op,updateData);
                    System.out.println(systemDisplay.getCourseList());
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }

//  Enroll student
            else if (optionNum.equals("3")) {
                System.out.println("Please input follow structure to enroll !");
                System.out.print("Input student ID: ");
                String studentID = scanner.nextLine();
                System.out.print("Input course ID: ");
                String courseID = scanner.nextLine();
                System.out.print("Input semester: ");
                String semester = scanner.nextLine();
                System.out.println(systemDisplay.enrol(studentID,courseID,semester));
                System.out.println(systemDisplay.getEnrollList());
                System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                System.out.print("Enter your option: ");
                String exit = scanner.nextLine();
                if (exit.equals("1")){
                    continue;
                }
                else {
                    break;
                }
//  Get system DATA
            } else if (optionNum.equals("4")) {
                System.out.println("Please choose kind of DATA you want to get: " + "\n" +
                        " + Press 1 to get student information " + "\n" +
                        " + Press 2 to get course information" + "\n" +
                        " + Press 3 to get all Students in 1 semester" + "\n" +
                        " + Press 4 to get all Course for 1 student in 1 semester" + "\n" +
                        " + Press 5 to get all Students in 1 course in 1 semester" + "\n" +
                        " + Press 6 to get all Course in 1 semester ");
                System.out.print("Input your option: ");
                String option = scanner.nextLine();
                if (option.equals("1")){
                    System.out.println("Get student data base on student ID");
                    System.out.print("Enter student id: ");
                    String studentID = scanner.nextLine();
                    System.out.println(systemDisplay.getStudentInfor(studentID));
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();

                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                else if (option.equals("2")){
                    System.out.println("Get course data base on course ID");
                    System.out.print("Enter course id: ");
                    String courseID = scanner.nextLine();
                    System.out.println(systemDisplay.getCourseInfor(courseID));
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }

                else if (option.equals("3")){
                    System.out.println("Get all Students in 1 semester");
                    System.out.print("Input semester: ");
                    String semester = scanner.nextLine();
                    System.out.println(systemDisplay.getOne(semester));
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                else if (option.equals("4")) {
                    System.out.println("Get all Course for 1 student in 1 semester");
                    System.out.print("Input student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Input semester: ");
                    String semester = scanner.nextLine();
                    System.out.println(systemDisplay.getOneData(studentID,semester));
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                else if (option.equals("5")) {
                    System.out.println("Get all Students in 1 course in 1 semester");
                    System.out.println("Input follow structure to get student data");
                    System.out.print("Input semester : ");
                    String semester = scanner.nextLine();
                    System.out.print("Input courseID: ");
                    String courseID = scanner.nextLine();
                    System.out.println(systemDisplay.studentsInCourse(semester,courseID));
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                else if (option.equals("6")){
                    System.out.println("Get all Course in 1 semester");
                    System.out.print("Input semester: ");
                    String semester = scanner.nextLine();
                    System.out.println(systemDisplay.courseInSem(semester));
                    System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
                    System.out.print("Enter your option: ");
                    String exit = scanner.nextLine();
                    if (exit.equals("1")){
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
//  Delete function
            else if (optionNum.equals("5")) {
                System.out.println("Input follow structure to delete course data");
                System.out.print("Input student ID: ");
                String studentID = scanner.nextLine();
                System.out.print("Input semester want to delete: ");
                String semester = scanner.nextLine();
                System.out.print("Input course ID to delete: ");
                String courseID = scanner.nextLine();
                System.out.println(systemDisplay.deleteCourse(studentID,semester,courseID));
                System.out.println(systemDisplay.getEnrollList());
                System.out.println("Do you want to continue use system ? Press 1 to return menu option OR press any button to Exit");
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
            else {
                break;
            }
        }
    }
}














