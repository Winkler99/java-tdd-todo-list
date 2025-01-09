package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    public HashMap<String, Boolean> tasks = new HashMap<>();

    public boolean add(String taskName){
        if(tasks.containsKey(taskName)){
            return false;
        }
        tasks.put(taskName, false);
        return true;
    }
}
