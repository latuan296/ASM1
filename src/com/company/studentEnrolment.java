package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class studentEnrolment {

    private String Semester;
    private Student student;
    private Course course;
    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;
    private HashMap<String,String> EnrolmentList;
    private HashMap<String,HashMap> finalEnrollList;


//    private ArrayList<String> studentCourse;



// CONSTRUCTOR
    public studentEnrolment(){
        this.student = student;
        this.course = course;
        this.EnrolmentList = new HashMap<String, String>();
        this.studentList = new ArrayList<Student>();
        this.courseList = new ArrayList<Course>();
        this.finalEnrollList = new HashMap<String, HashMap>();
    }

    public studentEnrolment(String semester, Student student, Course course) {
        Semester = semester;
        this.student = student;
        this.course = course;
        this.EnrolmentList = new HashMap<String, String>();
        this.studentList = new ArrayList<Student>();
        this.courseList = new ArrayList<Course>();

    }


// GET & SET
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

    public HashMap<String,String> getEnrolmentList() {
        return EnrolmentList;
    }

    public void setEnrolmentList(HashMap<String,String> enrolmentList) {
        EnrolmentList = enrolmentList;
    }

    public HashMap<String, HashMap> getFinalEnrollList() {
        return finalEnrollList;
    }

    public void setFinalEnrollList(HashMap<String, HashMap> finalEnrollList) {
        this.finalEnrollList = finalEnrollList;
    }


    //    Interface
    //    STUDENT LIST
    public boolean addStudent(Student student){
        if (studentList.contains(student)){
            return false;
        }
        else{
            studentList.add(student);
            return true;
        }
    }


//   COURSE LIST
    public boolean addCourse(Course course){
        if (courseList.contains(course)){
            return false;
        }
        else{
           courseList.add(course);
           return true;
        }
    }



// Enroll student & Course
    public String enroll(Student student,Course course,String semester){
        String oldValue = EnrolmentList.get(student.getStudentID());
        String newCourse = course.getCourseName();

        if (finalEnrollList.containsKey(semester)){

            if (EnrolmentList.containsKey(student.getStudentID()) && oldValue.contains(newCourse)){
                return "You already enroll before";
            }
            else if (EnrolmentList.containsKey(student.getStudentID())){
                String value = oldValue +", " +newCourse;
                EnrolmentList.put(student.getStudentID(),value);
            }
            else {
                EnrolmentList.put(student.getStudentID(),course.getCourseName());
            }

            finalEnrollList.put(semester,EnrolmentList);
            return "Success";
        }

        else {
            HashMap<String,String> newList = new HashMap<>();
            newList.put(student.getStudentID(),newCourse);
            finalEnrollList.put(semester,newList);
            return "Success";
        }

    }


//    Update Student

    public boolean updateStudent(String idStudent,int a,String update){
        if (a == 1){
            for (Student i: studentList)
                if (i.getStudentID().equals(idStudent)){
                    i.setStudentName(update);
                    return true;
                }
        }
        else if (a == 2){
            for (Student i: studentList)
                if (i.getStudentID().equals(idStudent)){
                    i.setStudentBirthdate(update);
                    return true;
                }
        }
        return false;
    }



//    public String getOne(Student student, Course course){
//        String result = null;
//        for (int i = 0; i < EnrolmentArrayList.size(); i++) {
//            if (EnrolmentArrayList.get(i).contains(student.getStudentName() + course.getCourseName())){
//                result = EnrolmentArrayList.get(i);
//                break;
//            }
//            else{result = "Not Found";}
//        }
//        return result;
//    }



    @Override
    public String toString() {
        return student.getStudentName() + course.getCourseName();
    }

}


