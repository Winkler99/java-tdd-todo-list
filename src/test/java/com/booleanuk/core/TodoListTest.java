package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void addTaskToListThatAlreadyExist() {
        TodoList todoList = new TodoList();
        String taskName = "clean";

        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        Assertions.assertFalse(todoList.add(taskName));
    }

    @Test
    public void addTaskToListThatDoesNotAlreadyExist() {
        TodoList todoList = new TodoList();
        String taskName = "run";

        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        Assertions.assertTrue(todoList.add(taskName));
    }

    @Test
    public void listAllTasksInTodolist() {
        TodoList todoList = new TodoList();
        List<String> strings = new ArrayList<String>() {};



        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        strings.addAll(todoList.tasks.keySet());

        Assertions.assertLinesMatch(strings, todoList.listTasks() );
    }

    @Test
    public void listAllTasksInTodolistWhenItIsEmpty() {
        TodoList todoList = new TodoList();
        List<String> strings = new ArrayList<String>() {};

        strings.add("Your todolist is empty");

        Assertions.assertLinesMatch(strings, todoList.listTasks() );
    }

    @Test
    public void updateTaskStatusWithExistingName(){
        TodoList todoList = new TodoList();
        String taskName = "clean";

        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        Assertions.assertTrue(todoList.updateTaskStatus(taskName , true));

    }

    @Test
    public void updateTaskStatusWithNonExistingName(){
        TodoList todoList = new TodoList();
        String taskName = "watch tv";

        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        Assertions.assertFalse(todoList.updateTaskStatus(taskName , true));

    }

    @Test
    public void getCompletedTasksWhenNotEmpty(){
        TodoList todoList = new TodoList();
        List<String> strings = new ArrayList<String>() {};

        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        todoList.updateTaskStatus("clean" , true);
        todoList.updateTaskStatus("wash" , true);

        strings.add("wash");
        strings.add("clean");

        Assertions.assertLinesMatch(strings, todoList.getCompletedTasks() );
    }

    @Test
    public void getCompletedTasksWhenEmpty(){
        TodoList todoList = new TodoList();
        List<String> strings = new ArrayList<String>() {};

        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        strings.add("You have no completed tasks");

        Assertions.assertLinesMatch(strings, todoList.getCompletedTasks() );
    }

    @Test
    public void getUnCompletedTasksWhenEmpty(){
        TodoList todoList = new TodoList();
        List<String> strings = new ArrayList<String>() {};

        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        todoList.updateTaskStatus("clean" , true);
        todoList.updateTaskStatus("wash" , true);
        todoList.updateTaskStatus("vacuum" , true);
        todoList.updateTaskStatus("walk the dog" , true);

        strings.add("You have no uncompleted tasks");

        Assertions.assertLinesMatch(strings, todoList.getUnCompletedTasks() );
    }

    @Test
    public void getUnCompletedTasksWhenNotEmpty(){
        TodoList todoList = new TodoList();
        List<String> strings = new ArrayList<String>() {};

        todoList.add("clean");
        todoList.add("wash");
        todoList.add("vacuum");
        todoList.add("walk the dog");

        todoList.updateTaskStatus("clean" , true);
        todoList.updateTaskStatus("wash" , true);

        strings.add("vacuum");
        strings.add("walk the dog");

        Assertions.assertLinesMatch(strings, todoList.getUnCompletedTasks() );
    }

}
