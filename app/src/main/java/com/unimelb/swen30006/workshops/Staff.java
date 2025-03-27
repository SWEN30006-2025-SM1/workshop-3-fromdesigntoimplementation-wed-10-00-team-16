package com.unimelb.swen30006.workshops;

import java.util.Date;
import java.util.List;

public class Staff extends Person {
    private List<String> roles;
    private String staffID;

    public Staff(String address, Date dob, String name, List<String> roles, String staffID) {
        super(address, dob, name);
        this.roles = roles;
        this.staffID = staffID;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
}

