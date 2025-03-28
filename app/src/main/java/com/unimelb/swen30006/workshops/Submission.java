package com.unimelb.swen30006.workshops;

private int attemptNum;
private File[] files;
private int numFiles;

public Submission(int attemptNum, File[] files, int numFiles){
    this.attemptNum = attemptNum;
    this.files = files;
    this.numFiles = numFiles;
}

class Submission {
    // Return two fake files
    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        return files;
    }
}
