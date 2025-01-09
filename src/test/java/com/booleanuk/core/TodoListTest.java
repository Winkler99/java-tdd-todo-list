package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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


}
