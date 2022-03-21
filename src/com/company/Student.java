package com.company;

import java.util.ArrayList;

public class Student {

    private String studentID;
    private String studentName;
    private String studentBirthdate;

    public Student(String studentID, String studentName, String studentBirthdate) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentBirthdate = studentBirthdate;
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
}
