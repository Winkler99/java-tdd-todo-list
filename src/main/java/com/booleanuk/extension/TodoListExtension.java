package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TodoListExtension {

    public ArrayList<Task> extensionTask = new ArrayList<>();

    public String getTaskByID(int id){
        String output = "No task with that ID was found";
        for(Task task : extensionTask){
            if(id == task.getId()){
                output = "ID: " + task.getId() + ", Name: " + task.getName() + ", Complete: " + task.getComplete() + ", Details: " + task.getDetails();
            }
        }

        return output;
    }

    public Boolean updateTaskName(int id, String newName){
        for(Task task : extensionTask){
            if(id == task.getId()){
                task.setName(newName);
            }
        }

        for(Task task : extensionTask){
            if(task.getName() == newName){
                task.setName(newName);
                return true;
            }
        }

        return false;
    }

    public Boolean updateTaskStatusById(int id, Boolean status){
        for(Task task : extensionTask){
            if(id == task.getId()){
                task.setComplete(status);
            }
        }

        for(Task task : extensionTask){
            if(id == task.getId()){
                if(task.getComplete() == status){
                    return true;
                }
            }
        }
        return false;
    }
}
