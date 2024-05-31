package com.project.seminario.Classes;

public class Mark {

    private int id;
    private String description;
    private String status;
    private int projectId;

    public Mark(int id, String description, String status, int projectId) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.projectId = projectId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    
    
}
