/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ItemTest
{
    // Create a new item
    // Create a new string for the new description
    // Run the edit description function
    // Assert that the current description is equal to the new description
    @Test
    public void EditDescTest() {
        Item item = new Item("test", new GregorianCalendar(2020, Calendar.DECEMBER, 7).getTime(), false);
        item.SetDescription("testtest");
        Assertions.assertEquals("testtest", item.description.get());
    }

    // Create new item
    // Create a new date for the new date
    // Run the edit due date function
    // Assert that the current date is equal to the new date
    @Test
    public void EditDueDateTest() {
        Item item = new Item("test", new GregorianCalendar(2020, Calendar.DECEMBER, 7).getTime(), false);
        var newDate = new GregorianCalendar(2021, Calendar.MARCH, 14).getTime();
        item.SetDueDate(newDate);
        Assertions.assertEquals(newDate, item.dueDate);
    }

    // Create a new item
    // Create a boolean for the new complete status
    // Run the mark complete function
    // Assert that the current status is equal to the new complete status
    @Test
    public void MarkCompleteTest() {
        Item item = new Item("test", new GregorianCalendar(2020, Calendar.DECEMBER, 7).getTime(), false);
        item.SetIsComplete(true);
        Assertions.assertEquals(true, item.isComplete.get());
    }
}
