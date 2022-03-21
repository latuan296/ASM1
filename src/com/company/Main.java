package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("s3836290", "Le Anh Tuan","29/06/1998");
        Course c1 = new Course("COSC2440", "Further Programming",12);

        c1.enroll(s1);

//        System.out.println(s1.getCourseList());
//        System.out.println(c1.getStudentList());
//        System.out.println(s1.getCourseList());

    }
}
