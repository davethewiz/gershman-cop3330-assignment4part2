/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.*;
import java.util.Date;

public class Item {
    public SimpleStringProperty description;
    public Date dueDate;
    public SimpleBooleanProperty isComplete;

    public Item(String description, Date dueDate, Boolean isComplete) {
        this.description = new SimpleStringProperty(description);
        this.dueDate = dueDate;
        this.isComplete = new SimpleBooleanProperty(isComplete);
    }

    public String getDescription() {
        return description.get();
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Boolean getIsComplete() {
        return isComplete.get();
    }
}