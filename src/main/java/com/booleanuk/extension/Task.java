package com.booleanuk.extension;

public class Task {

    private int id = 0;
    private String name;
    private Boolean complete;
    private String details;

    public Task(String name, String details){
        id++;
        this.details = details;
        complete = false;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
