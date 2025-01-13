package com.booleanuk.extension;

public class Task {

    public static int idCounter = 0;
    private int id;
    private String name;
    private Boolean complete;
    private String details;

    public Task(String name, String details){
        id = idCounter++;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
