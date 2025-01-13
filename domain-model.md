## Todo 

| Method                                        | Member Variable                | Scenario                                                   | Result                                   |
|-----------------------------------------------|--------------------------------|------------------------------------------------------------|------------------------------------------|
| add(String name)                              | HashMap<String, Boolean> tasks | Task with the provided name is not already in the todolist | true                                     |
|                                               |                                | Task with the provided name is already in the todolist     | false                                    |
|                                               |                                |                                                            |                                          |
| listTasks( )                                  |                                | There are tasks in the todolist                            | List<string> with all tasks              |
|                                               |                                | There are no tasks in the todolist                         | List<string> with error message          |
|                                               |                                |                                                            |                                          |
| updateTaskStatus(String name, Boolean status) |                                | There is a task with the provided name                     | true                                     |
|                                               |                                | There is no task with the provided name                    | false                                    |
|                                               |                                |                                                            |                                          |
| getCompletedTasks()                           |                                | There are completed tasks in the todolist                  | List<string> with all completed tasks    |
|                                               |                                | There are no completed tasks in the todolist               | List<string> with error message          |
|                                               |                                |                                                            |                                          |
| getNotCompletedTasks()                        |                                | There are uncompleted tasks in the todolist                | List<string> with all uncompleted tasks  |
|                                               |                                | There are no uncompleted tasks in the todolist             | List<string> with error message          |
|                                               |                                |                                                            |                                          |
| SearchTask(String)                            |                                | There was a task with the provided name                    | string with a message                    |
|                                               |                                | There was no task with the provided name                   | string with error message                |
|                                               |                                |                                                            |                                          |
| removeTask(String)                            |                                | Task with the provided name is not in the todolist         | true                                     |
|                                               |                                | Task with the provided name is in the todolist             | false                                    |
|                                               |                                |                                                            |                                          |
| taskDescending()                              |                                | There are tasks in the todolist                            | List<string> in descending order by name |
|                                               |                                | There are no tasks in the todolist                         | List<string> with error message          |
|                                               |                                |                                                            |                                          |
| taskAscending()                               |                                | There are tasks in the todolist                            | List<string> in ascending order by name  |
|                                               |                                | There are no tasks in the todolist                         | List<string> with error message          |



# Extension

## Todo

| Method                                       | Member Variable       | Scenario                                          | Result |
|----------------------------------------------|-----------------------|---------------------------------------------------|--------|
|                                              | ArrayList<Task> tasks |                                                   |        |
|                                              |                       |                                                   |        |
|                                              |                       |                                                   |        |
|                                              |                       |                                                   |        |
| getTaskById(int id)                          |                       | Search after a task with an existing ID           | String |
|                                              |                       | Search after a task with no existing ID           | String |
|                                              |                       |                                                   |        |
| updateTaskName(int id, String newName)       |                       | Update a task that exists with a new name         | true   |
|                                              |                       | Update a task that does not exist with a new name | false  |
|                                              |                       |                                                   |        |
| updateTaskStatusById(int id, Boolean status) |                       | Update a task that exists to wished status        | true   |
|                                              |                       | Update a task that exists to wished status        | false  |

## Task

| Method              | Member Variable      | Scenario | Result |
|---------------------|----------------------|----------|--------|
|                     | Static int idCounter |          |        |
|                     | int id               |          |        |
|                     | String name          |          |        |
|                     | Boolean complete     |          |        |
|                     | String details       |          |        |
| Getters and setters |                      |          |        |