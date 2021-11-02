/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class AppTest
{
    @Test
    public void AddNewTodoListTest()
    {
        // Create a new todoList with empty data
        // Get the size of the todolist list of the app
        // Run the AddEmptyTodoList() function in the app
        // Assert that the size of the todolist app is one greater than it was before
        // Assert that there exists an empty data todolist in the TodoList list
    }

    @Test
    public void RemoveTodoListTest() {
        // Create a new todolist with some default data (make sure it is not empty)
        // Add this todolist to the App list of todoLists
        // Run the RemoveTodoList function
        // Assert that the previously created todolist no longer exists in the todolist list in the app
    }

    @Test
    public void EditTodolistTitleTest() {
        // Create a new todolist with some empty data
        // Run the edit todolist title function using a String such as "TestTitle"
        // Assert that the todolist has this new title
    }

    @Test
    public void AddItemTest() {
        // Create a new todolist with some empty data
        // Create a new item with some default data
        // Add it to the apps list of todolists
        // Directly add the previously created item to the original todolist
        // Run the add item to current function
        // Assert that the current todolist has this item
    }

    @Test
    public void RemoveItemTest() {
        // Create a new todolist with some items and default data
        // Create a new item with default data
        // Remove the item using the function
        // Assert that the item is no longer within the todolist
    }
 }
