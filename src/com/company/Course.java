package com.company;

public class Course {
    private String courseID;
    private String courseName;
    private int courseCredit;

    public Course(String courseID, String courseName, int courseCredit) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
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
}
