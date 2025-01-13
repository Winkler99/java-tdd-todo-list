package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TodoListExtensionTest {


    @Test
    public void getTaskByUniqueId(){
        TodoListExtension todoList = new TodoListExtension();
        Task task1 = new Task("Clean", "Vacuum");
        Task task2 = new Task("Wash", "Wash clothes");
        Task task3 = new Task("Dishes", "Empty the dishwasher");
        Task task4 = new Task("Garbage", "Take out the garbage");

        todoList.extensionTask.add(task1);
        todoList.extensionTask.add(task2);
        todoList.extensionTask.add(task3);
        todoList.extensionTask.add(task4);

        String output = "ID: " + task2.getId() + ", Name: " + task2.getName() + ", Complete: " + task2.getComplete() + ", Details: " + task2.getDetails();

        Assertions.assertEquals(output, todoList.getTaskByID(1));

    }

    @Test
    public void updateNameWithTaskId(){
        TodoListExtension todoList = new TodoListExtension();
        Task task1 = new Task("Clean", "Vacuum");
        Task task2 = new Task("Wash", "Wash clothes");
        Task task3 = new Task("Dishes", "Empty the dishwasher");
        Task task4 = new Task("Garbage", "Take out the garbage");

        todoList.extensionTask.add(task1);
        todoList.extensionTask.add(task2);
        todoList.extensionTask.add(task3);
        todoList.extensionTask.add(task4);

        Assertions.assertTrue(todoList.updateTaskName(2, "Dishwasher"));

    }

    @Test
    public void changeStatusWithTaskId(){
        TodoListExtension todoList = new TodoListExtension();
        Task task1 = new Task("Clean", "Vacuum");
        Task task2 = new Task("Wash", "Wash clothes");
        Task task3 = new Task("Dishes", "Empty the dishwasher");
        Task task4 = new Task("Garbage", "Take out the garbage");

        todoList.extensionTask.add(task1);
        todoList.extensionTask.add(task2);
        todoList.extensionTask.add(task3);
        todoList.extensionTask.add(task4);

        Assertions.assertTrue(todoList.updateTaskStatusById(3, true));
    }
}
