/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodoListTest
{
    public TodoList GetSampleTodoList() {
        var todoList = new TodoList();
        todoList.items.add(new Item("Explore the seven seas", new GregorianCalendar(2030, Calendar.DECEMBER, 18).getTime(), false));
        todoList.items.add(new Item("watch an entire baseball without falling asleep", new GregorianCalendar(2049, Calendar.JANUARY, 20).getTime(), true));
        todoList.items.add(new Item("Understand the meaning of life", new GregorianCalendar(2042, Calendar.FEBRUARY, 11).getTime(), false));
        todoList.items.add(new Item("Finish this assignment", new GregorianCalendar(2021, Calendar.NOVEMBER, 16).getTime(), true));
        return todoList;
    }

    // Create a new todolist with some sample data
    // Clear all items
    // Assert that there are no items left in the list
    @Test
    public void ClearItemsTest() {
        var sample = GetSampleTodoList();
        sample.ClearItems();
        Assertions.assertEquals(0, sample.items.size());
    }

    // Create an empty todolist
    // Create a new item with sample data
    // Add that item to the todolist
    // Assert that the item exists with in the todolist items
    @Test
    public void AddItemTest() {
        TodoList newTodoList = new TodoList();
        Item item = new Item("Explore the seven seas", new GregorianCalendar(2030, Calendar.DECEMBER, 18).getTime(), false);

        newTodoList.AddItem(item);
        Assertions.assertTrue(newTodoList.items.contains(item));
    }

    // Create a new todolist with some items and default data
    // Create a new item with default data
    // Remove the item using the function
    // Assert that the item is no longer within the todolist
    @Test
    public void RemoveItemTest() {
        var sample = GetSampleTodoList();
        Item item = new Item("Explore the seven seas", new GregorianCalendar(2030, Calendar.DECEMBER, 18).getTime(), false);
        sample.RemoveItem(item);
        Assertions.assertFalse(sample.items.contains(item));
    }

    // Create a new todolist
    // Create a list of items with random sets of data
    // Remove any items that are complete
    // Add that list to the todolist
    // Run the GetIncompleteItems function
    // Assert that the originally made list of items is equal to the accessed items
    @Test
    public void GetIncompleteItemsTest() {
        var sample = GetSampleTodoList();

        var incompleteItems = new ArrayList<>();
        for (Item item : sample.items) {
            if (!item.isComplete.get())
                incompleteItems.add(item);
        }

        Assertions.assertEquals(incompleteItems, sample.GetIncompleteItems());
    }

    // Create a new todolist
    // Create a list of items with random sets of data
    // Remove any items that are incomplete
    // Add that list to the todolist
    // Run the GetCompleteItems function
    // Assert that the originally made list of items is equal to the accessed items
    @Test
    public void GetCompletedItemsTest() {
        var sample = GetSampleTodoList();

        var completeItems = new ArrayList<>();
        for (Item item : sample.items) {
            if (item.isComplete.get())
                completeItems.add(item);
        }

        Assertions.assertEquals(completeItems, sample.GetCompletedItems());
    }
}
