/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;


public class App extends Application {

    static ArrayList<TodoList> todolists = new ArrayList<>();
    static TodoList currentTodoList = null;

    public static void AddEmptyTodoList() {
        // Create new TodoList with default data
        // Add new todolist to todolist list
        // Update UI list of todos
    }

    public static void DeleteCurrentList() {
        // Remove currentTodoList from todoLists list
        // Update UI list of todos
        // Update UI of current list display
        // Set currentTodoList = null
    }

    public static void SelectTodoList(TodoList listToSelect) {
        // set currentTodoList to listToSelect
        // Update UI related to currently displaying list
    }

    public static void EditCurrentListTitle(String newTitle) {
        // Access currentTodoList title variable and set it to newTitle
        // Update currentTodoList display UI to reflect change of title
    }

    public static void AddItemToCurrent() {
        // Create a new default item with empty data
        // Add the item to the currentTodoList set of items
        // Update currentTodoList display UI with new item
    }

    public static void RemoveItemFromCurrent(Item item) {
        // Removes item from item list in current todoList
        // Updates currentTodoList display UI to reflect removal of item
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("Todo List App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
