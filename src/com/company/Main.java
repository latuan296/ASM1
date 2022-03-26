package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("s3836290", "Le Anh Tuan","29/06/1998");
        Student s2 = new Student("S3836480","Nguyen Thuy Linh","25/11/2001");
        Course c1 = new Course("COSC2440", "Further Programming",12);
        Course c2 = new Course("SYS1244","MATH", 12);
        Course c3 = new Course("SYS999","SEPM",12);
//        studentEnrolment e1 = new studentEnrolment("SEM1",s1,c1);
        studentEnrolment e1 = new studentEnrolment();
        Student studentSystem = new Student();



//        ADD STUDENT LIST
        e1.addStudent(s1);
        e1.addStudent(s1);
        e1.addStudent(s2);
//        System.out.println(e1.getStudentList());



//        ADD COURSE

        e1.addCourse(c1);
        e1.addCourse(c2);
        e1.addCourse(c2);
//        System.out.println(e1.getCourseList());



//  ENROLL STUDENT TO STUDENT ENROLMENT


//        check it again duplicate course
//        e1.enroll(s1,c1);


        e1.enroll(s1,c1);
        e1.enroll(s1,c1);
        e1.enroll(s1,c2);
        e1.enroll(s2,c1);
        e1.enroll(s2,c2);
        e1.enroll(s1,c3);


        System.out.println(e1.getEnrolmentArrayList());


//  Update student
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input 1 to update name and 2 to update DOB: ");
//        int a = scanner.nextInt();
        e1.updateStudent("s3836290",2,"123");
//        System.out.println(e1.getStudentList());




//  GET ONE FUNCTION
//        System.out.println(e1.getOne(s1,c1));









    }
}
