package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label seasonsLabel;

    @FXML
    void handleLoadButtonClicked() {

    }

    @FXML
    void handleClick() {
        System.out.println("Hello World!!!");
        if (seasonsLabel.getText().equals("Summer"))
            seasonsLabel.setText("Autumn");
        else
            seasonsLabel.setText("Summer");
    }

    @FXML
    private void initialize() {

    }
}
