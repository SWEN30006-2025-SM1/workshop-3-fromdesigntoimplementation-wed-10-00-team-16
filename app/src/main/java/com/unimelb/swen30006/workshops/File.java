package com.unimelb.swen30006.workshops;
import java.util.Date;

// Sample private file class to be replaced by your implementaiton
public class File {
    private Date createdDate;
    private String fileData;
    private String fileName;

    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }

    /* calculate file size */
    public int fileSize(){
        // implement
    }

    /* prints out the content in the file */
    public String content(){
        // implement
    }
}