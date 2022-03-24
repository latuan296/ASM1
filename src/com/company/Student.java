package com.company;

import java.util.ArrayList;

public class Student {

    private String studentID;
    private String studentName;
    private String studentBirthdate;
    private ArrayList<Course> courseList;
//    private ArrayList<studentEnrolment> studentEnrolmentArrayList;

    public Student(String studentID, String studentName, String studentBirthdate) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentBirthdate = studentBirthdate;
        this.courseList = new ArrayList<Course>();
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

//    public ArrayList<studentEnrolment> getStudentEnrolmentArrayList() {
//        return studentEnrolmentArrayList;
//    }
//
//    public void setStudentEnrolmentArrayList(ArrayList<studentEnrolment> studentEnrolmentArrayList) {
//        this.studentEnrolmentArrayList = studentEnrolmentArrayList;
//    }


    //    get student data

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentBirthdate='" + studentBirthdate + '\'' +
                '}' + '\n';
    }
}
