/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<Item> items;

    // INITIALIZE the list of items
    public TodoList() {
        items = new ArrayList<>();
    }

    public void ClearItems() {
        items.clear();
    }

    // REMOVE given item from item list
    public void RemoveItem(Item item) {
        items.remove(item);
    }

    // INITIALIZE new list of items
    // FOR each item in items
    //      IF item is completed add to list
    // RETURN the new list
    public ArrayList<Item> GetCompletedItems() {
        ArrayList<Item> completedItems = new ArrayList<>();
        for (Item item : items) {
            if (item.isComplete.get())
                completedItems.add(item);
        }

        return completedItems;
    }

    // INITIALIZE new list of items
    // FOR each item in items
    //      IF item is not completed add to list
    // RETURN the new list
    public ArrayList<Item> GetIncompleteItems() {
        ArrayList<Item> incompleteItems = new ArrayList<>();
        for (Item item : items) {
            if (!item.isComplete.get())
                incompleteItems.add(item);
        }

        return incompleteItems;
    }
}
