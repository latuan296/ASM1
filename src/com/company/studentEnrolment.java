package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class studentEnrolment {

    private String Semester;
    private Student student;
    private Course course;
    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;
    private HashMap<String,HashMap> EnrollList;




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
//  Add student list
    public boolean addStudent(Student student){
        if (studentList.contains(student)){
            System.out.println("Student already in");
            return false;
        }
        else{
            studentList.add(student);
            return true;
        }
    }

//  Add course list
    public boolean addCourse(Course course){
        if (courseList.contains(course)){
            System.out.println("Course already in");
            return false;
        }
        else{
           courseList.add(course);
           return true;
        }
    }

//  Enroll student & Course to each different semester
    public String enrol(String studentID, String courseID, String semester){
        String newCourse = "";
        for (Course i: courseList){
            if (i.getCourseID().equals(courseID)){
                newCourse = i.toString();
            }
        }
        if (newCourse.equals("")){
            return "Course not exist";
        }

        String key = "";
        for (Student i: studentList){
            if (i.getStudentID().equals(studentID)){
                key = i.toString();
            }
        }
        if (key.equals("")){
            return "Student not exist";
        }
        if (EnrollList.containsKey(semester)){
            HashMap<String,String> oldData = EnrollList.get(semester);
            String oldValue = oldData.get(key);
            if (oldData.containsKey(key) && oldValue.contains(newCourse)){
                return "You already enroll before";
            }
            else if (oldData.containsKey(key)){
                String value = oldValue + newCourse;
                oldData.put(key,value);
                EnrollList.put(semester,oldData);
                return "Enroll more course success";
            }
            else {
                oldData.put(key,newCourse);
                EnrollList.put(semester,oldData);
                return "Enroll Success";
            }
        }
        else {
            HashMap<String,String> newList = new HashMap<>();
            newList.put(key,newCourse);
            EnrollList.put(semester,newList);
            return "Enroll Success";
        }
    }

//  Update Student
    public boolean updateStudent(String idStudent,String a,String update){
        if (a.equals("1")){
            for (Student i: studentList)
                if (i.getStudentID().equals(idStudent)){
                    i.setStudentName(update);
                    System.out.println("Update name success: ");
                    return true;
                }
        }
        else if (a.equals("2")){
            for (Student i: studentList)
                if (i.getStudentID().equals(idStudent)){
                    i.setStudentBirthdate(update);
                    System.out.println("Update birthday success");
                    return true;
                }
        }
        System.out.println("Invalid Data");
        return false;
    }

//  Update Course Data
    public boolean updateCourse(String idCourse,String a,String update){
        if (a.equals("1")){
            for (Course i: courseList)
                if (i.getCourseID().equals(idCourse)){
                    i.setCourseName(update);
                    System.out.println("Update course name success");
                    return true;
                }
        }
        else if (a.equals("2")){
            int newCredit = Integer.parseInt(update);
            for (Course i: courseList)
                if (i.getCourseID().equals(idCourse)){
                    i.setCourseCredit(newCredit);
                    System.out.println("Update course credit point success");
                    return true;
                }
        }
        System.out.println("Invalid data");
        return false;
}

//  Get all student DATA in one semester (optional)
    public String getOneData(String studentID, String semester){
        String outputData = null;
        String key = "";
        for (Student i: studentList){
            if (i.getStudentID().equals(studentID)){
                key = i.toString();
            }
        }
        if (key.equals("")){
            return "Student not exist";
        }

        if (EnrollList.containsKey(semester)) {
            HashMap<String, String> studentData = EnrollList.get(semester);
            if (studentData.containsKey(key)){
                outputData = studentData.get(key);
                return outputData;
            } else
                outputData = "Can not found student name studentID [" + studentID + "] in system data";
                return outputData;
        }
        else {
            outputData = "Can not found semester [" + semester + "] in system data";
            return outputData;
        }
    }

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

//  Get all course in one semester
    public HashSet<String> courseInSem(String semester){
        HashSet<String> outputData = new HashSet<>();
        String data = "";
        if (EnrollList.containsKey(semester)){
            HashMap <String,String> courseData = EnrollList.get(semester);
            for (String i: courseData.keySet()) {
                data += courseData.get(i);
            }
            String[] value = data.split(",");
            for (int i = 0; i < value.length; i++) {
                outputData.add(value[i]);
            }
            return outputData;
        }
        else {
            data = "Can not found semester [" + semester + "] in system data";
            outputData.add(data);
            return outputData;
        }
    }

//  Get one student data
    public String getStudentInfor(String studentID){
        String outputData = null;
        for (Student i : studentList){
            if (i.getStudentID().equals(studentID)){
                outputData = i.toString();
                return outputData;
            }
        }
        outputData = "Can not found student id : " + studentID;
        return outputData;
    }

//  Get one course data
    public String getCourseInfor(String courseID){
        String outputData = null;
        for (Course i : courseList){
            if (i.getCourseID().equals(courseID)){
                outputData = i.toString();
                return outputData;
            }
        }
        outputData = "Can not found course id : " + courseID;
        return outputData;
    }

//  Delete course of 1 student in 1 semester
    public String deleteCourse(String studentID, String semester,String courseID){
        String result = null;
        String deleteCourse = "";
        for (Course i: courseList){
            if (i.getCourseID().equals(courseID)){
                deleteCourse = i.toString();
            }
        }
        if (deleteCourse.equals("")){
            return "Course not exist";
        }

        String key = "";
        for (Student i: studentList){
            if (i.getStudentID().equals(studentID)){
                key = i.toString();
            }
        }
        if (key.equals("")){
            return "Student not exist";
        }
        if (EnrollList.containsKey(semester)){
            if (EnrollList.get(semester).containsKey(key)){
                HashMap <String,String> semesterData = EnrollList.get(semester);
                if (semesterData.get(key).contains(deleteCourse)){
                    String newValue = semesterData.get(key).replace(deleteCourse,"");
                    EnrollList.get(semester).put(key,newValue);
                    result = "Delete course success";
                    return result;
                }
                else {
                    result = "Course does not exist in enroll data";
                    return result;
                }
            }
            else{
                result = "Student does not in enroll course data";
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


