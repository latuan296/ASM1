package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("s3836290", "Le Anh Tuan","29/06/1998");
        Student s2 = new Student("S3836480","Nguyen Thuy Linh","25/11/2001");
        Course c1 = new Course("COSC2440", "Further Programming",12);
        Course c2 = new Course("SYS1244","MATH", 12);
        studentEnrolment e1 = new studentEnrolment("SEM1",s1,c1);
//        studentEnrolment e1 = new studentEnrolment();


//        e1.addStudent(s1);
//        System.out.println(e1.getStudentList());
//        c1.enroll(s1);
//        e1.enroll(s1,c1);
//        e1.enroll(s1,c1);
//        e1.enroll(s2,c1);
//        System.out.println(e1.getEnrolmentArrayList());


//        ADD STUDENT LIST
        e1.addStudent(s1);
        e1.addStudent(s1);
        e1.addStudent(s2);
//        System.out.println(e1.getStudentList());



//  ENROLL STUDENT TO STUDENT ENROLMENT

        e1.enroll(s1,c1);
        e1.enroll(s1,c1);
        e1.enroll(s1,c2);
        e1.enroll(s1,c2);
        e1.enroll(s2,c1);

        System.out.println(e1.getEnrolmentArrayList());


//  GET ONE FUNCTION
//        System.out.println(e1.getOne(s1,c1));









    }
}
