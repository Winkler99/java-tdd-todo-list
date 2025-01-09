package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TodoList {

    public HashMap<String, Boolean> tasks = new HashMap<>();

    public boolean add(String taskName){
        if(tasks.containsKey(taskName)){
            return false;
        }
        tasks.put(taskName, false);
        return true;
    }

    public List<String> listTasks(){
        List<String> strings = new ArrayList<String>() {};
        String errorMsg = "Your todolist is empty";


        strings.addAll(tasks.keySet());


        if(strings.isEmpty()) {
            strings.add(errorMsg);
            return strings;
        }

        return strings;
    }

    public boolean updateTaskStatus(String taskName, Boolean taskCompletion){
        if(tasks.containsKey(taskName)){
            tasks.replace(taskName, taskCompletion);
            return true;
        }
        return false;
    }

    public List<String> getCompletedTasks(){
        List<String> strings = new ArrayList<String>() {};
        String errorMsg = "You have no completed tasks";


        for (String task : tasks.keySet()){
            if(tasks.get(task)){
                strings.add(task);

            }
        }

        if(strings.isEmpty()) {
            strings.add(errorMsg);
            return strings;
        }

        return strings;
    }
}
