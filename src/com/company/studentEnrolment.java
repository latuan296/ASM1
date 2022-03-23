package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class studentEnrolment {

    private String Semester;
    private Student student;
    private Course course;
    private ArrayList<String> EnrolmentArrayList;
    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;



    public studentEnrolment(){
    }

    public studentEnrolment(String semester, Student student, Course course) {
        Semester = semester;
        this.student = student;
        this.course = course;
        this.EnrolmentArrayList = new ArrayList<String>();
        this.studentList = new ArrayList<Student>();
        this.courseList = new ArrayList<Course>();

    }


    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<String> getEnrolmentArrayList() {
        return EnrolmentArrayList;
    }

    public void setEnrolmentArrayList(ArrayList<String> enrolmentArrayList) {
        EnrolmentArrayList = enrolmentArrayList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }


    public boolean addStudent(Student student){
        if (studentList.contains(student)){
            return false;
        }
        else{
            studentList.add(student);
            return true;
        }
    }

    public boolean enroll(Student student, Course course){
        if (EnrolmentArrayList.contains(student.getStudentName()+ course.getCourseName())){
            return false;
        }
        else{
            EnrolmentArrayList.add(student.getStudentName() + course.getCourseName());
            return true;
        }
    }



    public String getOne(Student student, Course course){
        String result = null;
        for (int i = 0; i < EnrolmentArrayList.size(); i++) {
            if (EnrolmentArrayList.get(i).contains(student.getStudentName() + course.getCourseName())){
                result = EnrolmentArrayList.get(i);
                break;
            }
            else{result = "Not Found";}
        }
        return result;
    }



    @Override
    public String toString() {
        return student.getStudentName() + course.getCourseName();
    }

}


