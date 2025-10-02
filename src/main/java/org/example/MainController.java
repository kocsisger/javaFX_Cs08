package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.model.Model;
import org.example.model.SubModel;

public class MainController {

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

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
