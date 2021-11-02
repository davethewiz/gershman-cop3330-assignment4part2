/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class TodoListFileTest
{
    @Test
    public void SaveSingleTodoListTest() {
        // Create a new todolist with some set of random data
        // Save the todolist to a file
        // Assert that there exists a file with the same title as the todolist
        // Assert that the file contains the correct data
    }

    @Test
    public void SaveMultipleTodoListsTest() {
        // Create a set of todolists with random datas
        // Save the todolists to a directory
        // Assert that all the files exist in the directory
        // Assert that each file contains the correct data
    }

    @Test
    public void LoadSingleTodoListTest() {
        // Make a todolist with some set of data
        // Convert todolist to a file
        // Create a json dataset of a single todolist that was not made by the file
        // Read the newly created json dataset and load it into a todolist
        // Assert that the original todolist is equal to the loaded one
    }

    @Test
    public void LoadMultipleTodoListTest() {
        // Make multiple todolists with some set of datas
        // Convert each todolist to a file
        // Create a json dataset of each todolist that was not made by the file
        // Read the newly created json datasets and load each into todolists
        // Assert that each of the original todolists is equal to the loaded ones
    }
}
