/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dave Gershman
 */

package ucf.assignments;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller implements Initializable {

    @FXML
    private ChoiceBox choiceBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceBox.getItems().removeAll(choiceBox.getItems());
        choiceBox.getItems().addAll("All", "Complete", "Incomplete");
        choiceBox.getSelectionModel().select("All");
    }
}