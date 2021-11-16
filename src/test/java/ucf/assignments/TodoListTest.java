/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class TodoListTest
{
    @Test
    public void ClearItemsTest() {

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

    @Test
    public void GetAllItemsTest() {
        // Create a new todolist
        // Create a list of items with random sets of data
        // Add that list to the todolist
        // Run get all items in the todolist
        // Assert that the originally made list of items is equal to the accessed items
    }

    @Test
    public void GetIncompleteItemsTest() {
        // Create a new todolist
        // Create a list of items with random sets of data
        // Remove any items that are complete
        // Add that list to the todolist
        // Run the GetIncompleteItems function
        // Assert that the originally made list of items is equal to the accessed items
    }

    @Test
    public void GetCompletedItemsTest() {
        // Create a new todolist
        // Create a list of items with random sets of data
        // Remove any items that are incomplete
        // Add that list to the todolist
        // Run the GetCompleteItems function
        // Assert that the originally made list of items is equal to the accessed items
    }
}
