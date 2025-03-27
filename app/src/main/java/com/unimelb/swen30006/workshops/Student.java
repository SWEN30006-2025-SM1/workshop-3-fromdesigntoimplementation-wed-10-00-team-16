package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Student extends Person {
    private String email;
    private String studentID;

    public Student(String address, Date dob, String name, String email, String studentID) {
        super(address, dob, name);
        this.email = email;
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void sendEmailMsg(String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }

    public float totalGrade() {
        return 0.0f;
    }
}

