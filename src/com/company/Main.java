package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("s3836290", "Le Anh Tuan","29/06/1998");
        Course c1 = new Course("COSC2440", "Further Programming",12);
        Student s2 = new Student("S123455","Nguyen Van A","11/1/1111");
        Course c2 = new Course("SYS1244","MATH", 12);
        studentEnrolment e1 = new studentEnrolment("SEM1",s1,c1);
//        studentEnrolment e1 = new studentEnrolment();


//        e1.addStudent(s1);
//        System.out.println(e1.getStudentList());
        c1.enroll(s1);
        e1.enroll(s1,c1);
        e1.enroll(s1,c1);
        e1.enroll(s2,c1);
        System.out.println(e1.getEnrolmentArrayList());



//        e1.enroll(s1,c1);

//        if (e1.enroll(s1,c1) == true){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }

//        e1.enroll(s1,c2);
//        if (e1.enroll(s1,c1) == true){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }

//        System.out.println(e1.getStudentEnrolmentArrayList());








//        System.out.println(s1.getCourseList());
//        System.out.println(c1.getStudentList());
//        System.out.println(s1.getCourseList());



    }
}
