package com.unimelb.swen30006.workshops;
import java.util.Date;

// Sample private submission class to be replaced by your implementation
class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;

    public Assignment(String description, Date dueDate, int maxAttempts, String name) {
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.name = name;
    }

    public Submission[] invalidSubmissions(){
        // implement
        if(){

        }
    }

    /* check if submission is valid or not */
    public Submission[] validSubmissions(){
        // implement
    }

    public String getName() {
        return this.name;
    }
}

