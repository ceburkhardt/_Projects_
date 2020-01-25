package model;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Student {
    int ID;
    String name;
    HashMap<Integer, Double> grades;
    List<Course> enrolledCourses;

    public Student(int ID, String name){
        this.ID = ID;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void displayCourses(){
        System.out.println(enrolledCourses);
    }

    public double calculateGPA(){
        double gpa;
        gpa = enrolledCourses.
        return gpa;
    }

    public void enrollCourse(Course course){
        enrolledCourses.add(course);
    }

    public boolean setGrade(Course course, double grade){
        if(enrolledCourses.contains(course)){
            grades.put(course.getID(), grade);
            return true;
        }else {
            return false;
        }
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}
