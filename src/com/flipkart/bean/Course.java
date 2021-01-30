package com.flipkart.bean;

import java.util.ArrayList;

public class Course {


    String id;
    String name;
    String professorId;
    double fee;


    ArrayList<Student> studentsEnrolled;

    public Course(String id, String name, double fee) {
        this.id = id;
        this.name = name;
        this.professorId = null;
        this.fee = fee;
        this.studentsEnrolled = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }




}
