package com.project.seminario.Classes;

public class Project {

    private int id;
    private int userRegistration;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private String status;

    public Project(int id, String name, String description, String startDate, String endDate, String status, int userRegistration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.userRegistration = userRegistration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(int userRegistration) {
        this.userRegistration = userRegistration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

}
