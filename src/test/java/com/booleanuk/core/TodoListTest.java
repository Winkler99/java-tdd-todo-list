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

}
