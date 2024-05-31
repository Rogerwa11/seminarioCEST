package com.project.seminario.Classes;

public class Task {

    private int taskId;
    private String description;
    private String priority;
    private String startDate;
    private String endDate;
    private String status;
    private int markId;
    private int responsibleRegistration;

    public Task(int taskId, String description, String priority, String startDate, String endDate, String status, int markId, int responsibleRegistration) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.markId = markId;
        this.responsibleRegistration = responsibleRegistration;

    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public int getResponsibleRegistration() {
        return responsibleRegistration;
    }

    public void setResponsibleRegistration(int responsibleRegistration) {
        this.responsibleRegistration = responsibleRegistration;
    }

}
