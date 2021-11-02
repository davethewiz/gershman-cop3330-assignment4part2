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

    public static ArrayList<TodoList> GetTodoLists(String dir) {
        // Create a new list of TodoLists
        // Iterate through all files in given directory path
        //      Find any json files containing TdooList data
        //      Deseralize them into TodoList objects
        //      Add these objects to the new list of TodoLists
        // Return the new list of TodoLists
        return new ArrayList<>();
    }

    public static void ExportTodoList(TodoList todoList, String dir) {
        // Serialize the todoList into a json string
        // Locate the directory provided in 'dir'
        // Create a new json file with the json string in the directory
        // Title this file the same title as the todolist
    }

    public static void ExportTodoLists(ArrayList<TodoList> todoLists, String dir) {
        // Iterate through all todoList in TodoLists
        //      Execute the above ExportTodoList(...) on each todolist in the same directory
    }
}
