package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TodoListExtension {

    public ArrayList<Task> extensionTask = new ArrayList<>();

    public String getTaskByID(int id){

        return "s";
    }

    public Boolean updateTaskName(int id, String newName){
        return true;
    }

    public Boolean updateTaskStatusById(int id, Boolean status){
        return true;
    }
}
