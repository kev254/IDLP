package com.example.idlp.model;

public class liveClassesModel {
    String subjectName,status,startTime,endTime;

    public liveClassesModel() {
    }

    public liveClassesModel(String subjectName) {
        this.subjectName = subjectName;
    }

    public liveClassesModel(String subjectName, String status, String startTime, String endTime) {
        this.subjectName = subjectName;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
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
