package com.example.idlp.model;

public class OngoingModel {
    String subjectName;
    boolean started;
    int progress;

    public OngoingModel() {
    }

    public OngoingModel(String subjectName, boolean started, int progress) {
        this.subjectName = subjectName;
        this.started = started;
        this.progress = progress;
    }

    public OngoingModel(String subjectName, boolean started) {
        this.subjectName = subjectName;
        this.started = started;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public boolean hasStarted() {
        return started;
    }

    public void setHasStarted(boolean started) {
        this.started = started;
    }
}
