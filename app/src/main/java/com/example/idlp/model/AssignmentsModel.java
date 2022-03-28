package com.example.idlp.model;

public class AssignmentsModel {
    String subjectName,status,startTime,endTime,backgroundColor;

    public AssignmentsModel() {
    }

    public AssignmentsModel(String subjectName) {
        this.subjectName = subjectName;
    }

    public AssignmentsModel(String subjectName, String backgroundColor) {
        this.subjectName = subjectName;
        this.backgroundColor = backgroundColor;
    }

    public AssignmentsModel(String subjectName, String status, String startTime, String endTime) {
        this.subjectName = subjectName;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
