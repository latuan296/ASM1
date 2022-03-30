package com.company;

import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseName;
    private int courseCredit;
    private ArrayList<Student> studentList;

    public Course(String courseID, String courseName, int courseCredit) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.studentList = new ArrayList<Student>();
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public boolean enroll(Student student){
        if (studentList.contains(student)){
            return false;
        }
        studentList.add(student);
        student.getCourseList().add(this);
        return true;
    }


    @Override
    public String toString() {
        return "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseCredit=" + courseCredit +
                '}';
    }
}
