## Todo 

| Method                                        | Member Variable                | Scenario                                                   | Result                                  |
|-----------------------------------------------|--------------------------------|------------------------------------------------------------|-----------------------------------------|
| add(String name)                              | HashMap<String, Boolean> tasks | Task with the provided name is not already in the todolist | true                                    |
|                                               |                                | Task with the provided name is already in the todolist     | false                                   |
|                                               |                                |                                                            |                                         |
| listTasks( )                                  |                                | There are tasks in the todolist                            | List<string> with all tasks             |
|                                               |                                | There are no tasks in the todolist                         | List<string> with error message         |
|                                               |                                |                                                            |                                         |
| updateTaskStatus(String name, Boolean status) |                                | There is a task with the provided name                     | true                                    |
|                                               |                                | There is no task with the provided name                    | false                                   |
|                                               |                                |                                                            |                                         |
| getCompletedTasks()                           |                                | There are completed tasks in the todolist                  | List<string> with all completed tasks   |
|                                               |                                | There are no completed tasks in the todolist               | List<string> with error message         |
|                                               |                                |                                                            |                                         |
| getNotCompletedTasks()                        |                                | There are uncompleted tasks in the todolist                | List<string> with all uncompleted tasks |
|                                               |                                | There are no uncompleted tasks in the todolist             | List<string> with error message         |
|                                               |                                |                                                            |                                         |
| SearchTask(String)                            |                                | There was a task with the provided name                    | string with a message                   |
|                                               |                                | There was no task with the provided name                   | string with error message               |
|                                               |                                |                                                            |                                         |
| removeTask(String)                            |                                | Task with the provided name is not in the todolist         | true                                    |
|                                               |                                | Task with the provided name is in the todolist             | false                                   |
|                                               |                                |                                                            |                                         |
| taskDescending()                              |                                | There are tasks in the todolist                            | List<string> in descending order by name      |
|                                               |                                | There are no tasks in the todolist                         | List<string> with error message               |
|                                               |                                |                                                            |                                         |
| taskAscending()                               |                                | There are tasks in the todolist                            | List<string> in ascending order by name       |
|                                               |                                | There are no tasks in the todolist                         | List<string> with error message               |



# Extension

## Todo

| Method                                       | Member Variable       | Scenario | Result |
|----------------------------------------------|-----------------------|----------|--------|
| add(String name)                             | ArrayList<Task> tasks |          |        |
|                                              | id                    |          |        |
| listTasks( )                                 |                       |          |        |
| updateTaskStatus(Task task, Boolean state)   |                       |          |        |
|                                              |                       |          |        |
| getCompletedTasks()                          |                       |          |        |
| getNotCompletedTasks()                       |                       |          |        |
| SearchTask(Task task)                        |                       |          |        |
| removeTask(Task task)                        |                       |          |        |
| taskDescending()                             |                       |          |        |
| taskAscending()                              |                       |          |        |
| getTaskById(int id)                          |                       |          |        |
| updateTaskName(int id, String newName)       |                       |          |        |
| updateTaskStatusById(int id, Boolean status) |                       |          |        |
|                                              |                       |          |        |

## Task

| Method | Member Variable  | Scenario | Result |
|--------|------------------|----------|--------|
|        |                  |          |        |
|        | Boolean complete |          |        |
|        | String name      |          |        |