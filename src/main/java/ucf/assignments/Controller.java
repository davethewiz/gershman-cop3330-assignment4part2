/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class Controller implements Initializable {

    @FXML private ChoiceBox filterBox;
    @FXML private TextField newItemDescription;
    @FXML private DatePicker newItemDueDate;

    @FXML private TableView<Item> tableView;
    @FXML private TableColumn<Item, Boolean> isCompletedColumn;
    @FXML private TableColumn<Item, String> descriptionColumn;
    @FXML private TableColumn<Item, Date> dueDateColumn;

    private TodoList todoList;

    public void ClearTableItems() {
        todoList.ClearItems();
        UpdateTable();
    }

    public void DeleteSelectedItems() {
        var selectedItems = tableView.getSelectionModel().getSelectedItems();

        for (Item item : selectedItems)
            todoList.RemoveItem(item);

        UpdateTable();
    }

    public void AddNewItemToTable() {
        LocalDate newLocalDate = newItemDueDate.getValue();
        Date newDate = new GregorianCalendar(newLocalDate.getYear(), newLocalDate.getMonth().getValue()-1, newLocalDate.getDayOfMonth()).getTime();
        Item newItem = new Item(newItemDescription.getText(), newDate, false);

        todoList.items.add(newItem);
        UpdateTable();
    }

    public void UpdateTable() {
        ObservableList<Item> items = FXCollections.observableArrayList();

        String filterBoxVal = filterBox.getValue().toString();
        if (filterBoxVal.equals("All")) {
            items.addAll(todoList.items);
        }
        else if (filterBoxVal.equals("Complete")) {
            items.addAll(todoList.GetCompletedItems());
        }
        else if (filterBoxVal.equals("Incomplete")) {
            items.addAll(todoList.GetIncompleteItems());
        }

        tableView.setItems(items);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        todoList = new TodoList();

        filterBox.getItems().addAll("All", "Complete", "Incomplete");
        filterBox.getSelectionModel().select("All");

        isCompletedColumn.setCellValueFactory(cellData -> cellData.getValue().isComplete);
        isCompletedColumn.setCellFactory(cf -> new CheckBoxTableCell<>());
        isCompletedColumn.setOnEditCommit(
                (TableColumn.CellEditEvent<Item, Boolean> t) -> {
                    t.getTableView().getItems().get(t.getTablePosition().getRow()).isComplete = new SimpleBooleanProperty(t.getNewValue());
                    UpdateTable();
                }
        );

        descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().description);
        descriptionColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        descriptionColumn.setOnEditCommit(
                (TableColumn.CellEditEvent<Item, String> t) -> {
                    t.getTableView().getItems().get(t.getTablePosition().getRow()).description = new SimpleStringProperty(t.getNewValue());
                    UpdateTable();
                }
        );

        dueDateColumn.setCellValueFactory(new PropertyValueFactory<Item, Date>("dueDate"));
        dueDateColumn.setCellFactory(cf -> new DateEditingCell());
        dueDateColumn.setOnEditCommit(
                (TableColumn.CellEditEvent<Item, Date> t) -> {
                    t.getTableView().getItems().get(t.getTablePosition().getRow()).dueDate = t.getNewValue();
                    UpdateTable();
                }
        );

        tableView.setEditable(true);
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}