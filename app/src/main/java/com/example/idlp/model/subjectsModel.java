package com.example.idlp.model;

public class subjectsModel {
    String subjectName;
    boolean enrolled;

    public subjectsModel() {


    }

    public subjectsModel(String subjectName, boolean status) {
        this.subjectName = subjectName;
        this.enrolled = status;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }
}
