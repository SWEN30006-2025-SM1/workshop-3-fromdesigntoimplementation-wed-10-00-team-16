package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
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
     * creates assignment when called
     */
    public void createAssignment(){
        this.assignments.add(new Assignment());
    }

    /**
     * deletes passed in assignment
     */
    public void deleteAssignment(String name){
        //implement function
    }


}
