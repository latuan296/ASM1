package com.company;

import java.util.ArrayList;

public class Student {

    private String studentID;
    private String studentName;
    private String studentBirthdate;
    private ArrayList<Course> courseList;


    public Student(){
        this.studentID = "Default";
        this.studentName = "Default";
        this.studentBirthdate = "Default";
    }

    public Student(String studentID, String studentName, String studentBirthdate) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentBirthdate = studentBirthdate;
        this.courseList = new ArrayList<Course>();
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


    @Override
    public String toString() {
        return "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentBirthdate='" + studentBirthdate + '\'' +
                '}';
    }

}

