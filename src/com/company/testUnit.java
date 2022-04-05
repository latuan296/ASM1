package com.company;



public class testUnit {
    public static void main(String[] args){
//      Sample data
        Student s1 = new Student("S3836290", "Le Anh Tuan","29/06/1998");
        Student s2 = new Student("S3836480","Nguyen Thuy Linh","25/11/2001");
        Course c1 = new Course("COSC2440", "Further Programming",12);
        Course c2 = new Course("MATH2081","MATH", 12);
        Course c3 = new Course("ISYS2101","SEPM",12);
        studentEnrolment test = new studentEnrolment();

//  test add student and course
        System.out.println(test.addStudent(s1));
        System.out.println(test.getStudentList());
//  test duplicate adding
        System.out.println(test.addStudent(s1));










    }



}
