package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label seasonsLabel;

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
