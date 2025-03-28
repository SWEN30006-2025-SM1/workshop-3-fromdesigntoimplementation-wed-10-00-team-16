package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A class that represents all validation errors for a given
 * file, storing the errors as a key value mapping
 */
class Subject {
    private String name;
    private String subjectCode;
    private ArrayList<Assignment> assignments;

    /**
     * Constructor
     */
    public Subject(String name, String subjectCode) {
        this.name = name;
        this.subjectCode = subjectCode;
    }

    /**
     * creates assignment when called
     */
    public void createAssignment(String description, Date dueDate, int maxAttempts, String name){
        this.assignments.add(new Assignment(description, dueDate, maxAttempts, name));
    }

    /**
     * deletes passed in assignment
     */
    public void deleteAssignment(String name){
        for (Assignment assignment : assignments) {
            if (assignment.getName() == name) {
                assignments.remove(assignment);
            }
        }
    }


}
