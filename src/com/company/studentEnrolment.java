package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class studentEnrolment {

    private String Semester;
    private Student student;
    private Course course;
    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;
    private HashMap<String,HashMap> EnrollList;
//    private ArrayList<String> studentCourse;



// CONSTRUCTOR
    public studentEnrolment(){
        this.student = student;
        this.course = course;
        this.studentList = new ArrayList<Student>();
        this.courseList = new ArrayList<Course>();
        this.EnrollList = new HashMap<String,HashMap>();
    }

    public studentEnrolment(String semester, Student student, Course course) {
        Semester = semester;
        this.student = student;
        this.course = course;

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

    public HashMap<String, HashMap> getEnrollList() {
        return EnrollList;
    }

    public void setEnrollList(HashMap<String, HashMap> EnrollList) {
        this.EnrollList = EnrollList;
    }


//  Interface
//  add student list
    public boolean addStudent(Student student){
        if (studentList.contains(student)){
            return false;
        }
        else{
            studentList.add(student);
            return true;
        }
    }

//  add course list
    public boolean addCourse(Course course){
        if (courseList.contains(course)){
            return false;
        }
        else{
           courseList.add(course);
           return true;
        }
    }

//  Enroll student & Course to each different semester
    public String enrol(Student student,Course course,String semester){
        String newCourse = " CourseID: " +course.getCourseID() + " CourseName: " + course.getCourseName();
        String key = "Student name: " + student.getStudentName() + ", StudentID: " +student.getStudentID();
        if (EnrollList.containsKey(semester)){
            HashMap<String,String> oldData = EnrollList.get(semester);
            String oldValue = oldData.get(key);
            if (oldData.containsKey(key) && oldValue.contains(newCourse)){
                return "You already enroll before";
            }
            else if (oldData.containsKey(key)){
                String value = oldValue +", " + newCourse;
                oldData.put(key,value);
                EnrollList.put(semester,oldData);
                return "Success";
            }
            else {
                oldData.put(key,newCourse);
                EnrollList.put(semester,oldData);
                return "Success";
            }
        }
        else {
            HashMap<String,String> newList = new HashMap<>();
            newList.put(key,newCourse);
            EnrollList.put(semester,newList);
            return "Success";
        }
    }

//  Update Student
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

//  update Course Data
    public boolean updateCourse(String idCourse,int a,String update){
        if (a == 1){
            for (Course i: courseList)
                if (i.getCourseID().equals(idCourse)){
                    i.setCourseName(update);
                    return true;
                }
        }
        else if (a == 2){
            int newCredit = Integer.parseInt(update);
            for (Course i: courseList)
                if (i.getCourseID().equals(idCourse)){
                    i.setCourseCredit(newCredit);
                    return true;
                }
        }
        return false;
}

//  Get all student data in one semester (wrong function)
//    public String getOne(String studentID, String semester){
//        String outputData = null;
//        if (EnrollList.containsKey(semester)) {
//            HashMap<String, String> studentData = EnrollList.get(semester);
//            if (studentData.containsKey(studentID)){
//                outputData = studentData.get(studentID);
//                return outputData;
//            } else
//                outputData = "Student invalid";
//                return outputData;
//        }
//        else {
//            outputData = "Semester invalid";
//            return outputData;
//        }
//    }

//  Get all student in one semester
    public ArrayList<String> getOne(String semester){
        ArrayList<String> outputData = new ArrayList<String>();
        if (EnrollList.containsKey(semester)){
            HashMap<String,String> studentData = EnrollList.get(semester);
            for (String i: studentData.keySet()){
                outputData.add(i);
            }
            return outputData;
        }
        else {
            outputData.add("Can not found semester [" + semester +"] in system!");
            return outputData;
        }

    }

//  Get all student in 1 course in 1 semester
    public ArrayList<String> studentsInCourse(String semester, String courseID){
        ArrayList<String> outputData = new ArrayList<String>();
        if (EnrollList.containsKey(semester)){
            HashMap<String, String> studentData = EnrollList.get(semester);
            for (String i : studentData.keySet()){
                if (studentData.get(i).contains(courseID)){
                    outputData.add(i);
                }
            }
            if (outputData.isEmpty()){
                String errorMessage = "Can not found courseID [" + courseID + "] in semester " + semester;
                outputData.add(errorMessage);
                return outputData;
            }
            return outputData;

        }
        else {
            String errorMessage = "Can not found semester [" + semester + "] in system data";
            outputData.add(errorMessage);
            return outputData;
        }
    }

//  Get all course in one semester (not done)
    public TreeSet<String> courseInSem(String semester){
        TreeSet<String> outputData = new TreeSet<String>();
        String data = null;
        if (EnrollList.containsKey(semester)){
            HashMap<String,String> courseData = EnrollList.get(semester);
            ArrayList<String> value = new ArrayList<String>();
//            String value = null;
            for (String i: courseData.keySet()) {
                value.add(courseData.get(i));
            }

            return outputData;
        }
        else {
            data = "Can not found semester [" + semester + "] in system data";
            outputData.add(data);
            return outputData;
        }
    }

//   Delete function
    public String deleteCourse(String studentName,String studentID, String semester,String courseName,String courseID){
        String result = null;
        String key = "Student name: " + studentName + ", StudentID: " +studentID;
        String deleteValue = " CourseID: " +courseID + " CourseName: " + courseName;
        if (EnrollList.containsKey(semester)){
            if (EnrollList.get(semester).containsKey(key)){
                HashMap <String,String> semesterData = EnrollList.get(semester);
                if (semesterData.get(key).contains(deleteValue)){
                    String newValue = semesterData.get(key).replace(deleteValue,"");
                    EnrollList.get(semester).put(key,newValue);
                    result = "Delete course success";
                    return result;
                }
                else {
                    result = "Wrong course data input";
                    return result;
                }
            }
            else{
                result = "Wrong student data input";
                return result;
            }
        }
        else{
            result = "Can not found semester [" + semester + "] in system data";
            return result;
        }
    }

    @Override
    public String toString() {
        return student.getStudentName() + course.getCourseName();
    }
}


