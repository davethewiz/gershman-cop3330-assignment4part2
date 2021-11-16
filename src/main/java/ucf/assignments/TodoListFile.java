/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TodoListFile {
    public static TodoList GetTodoList(String path) {
        // Read a special json file containing TodoList data from the path
        // Deseralize the json file into a TodoList
        // return deserialized TodoList object
        return new TodoList();
    }

    public static void ExportTodoList(TodoList todoList, String dir) {
        // Serialize the todoList into a json string
        // Locate the directory provided in 'dir'
        // Create a new json file with the json string in the directory
        // Title this file the same title as the todolist
    }
}
