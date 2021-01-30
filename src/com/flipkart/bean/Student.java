package com.flipkart.bean;

public class Student extends User{

    String branch;
    boolean approved;

    public Student(String id, String name, String email, String role,String branch, boolean approved) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.branch = branch;
        this.approved = approved;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

}
