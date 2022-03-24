package com.company;

import java.util.ArrayList;

public class Student {

    private String studentID;
    private String studentName;
    private String studentBirthdate;
    private ArrayList<Course> courseList;
//    private ArrayList<Student> studentList;
//    private ArrayList<studentEnrolment> studentEnrolmentArrayList;

    public Student(){
        this.studentID = "Default";
        this.studentName = "Default";
        this.studentBirthdate = "Default";
//        this.studentList = new ArrayList<Student>();
    }

    public Student(String studentID, String studentName, String studentBirthdate) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentBirthdate = studentBirthdate;
        this.courseList = new ArrayList<Course>();
//        this.studentList = new ArrayList<Student>();
//        this.studentEnrolmentArrayList = new ArrayList<studentEnrolment>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBirthdate() {
        return studentBirthdate;
    }

    public void setStudentBirthdate(String studentBirthdate) {
        this.studentBirthdate = studentBirthdate;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

//    public ArrayList<Student> getStudentList() {
//        return studentList;
//    }
//
//    public void setStudentList(ArrayList<Student> studentList) {
//        this.studentList = studentList;
//    }


    //    get student data
    @Override
    public String toString() {
        return "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentBirthdate='" + studentBirthdate + '\'' +
                '}';
    }

}

