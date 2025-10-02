package org.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.model.Model;
import org.example.model.SubModel;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //View
        var loader = new FXMLLoader(getClass().getResource("main.fxml"));
        //Model
        Model model = new SubModel();
        //Contorller
        MainController controller = (MainController) loader.getController();
        controller.setModel(model);

        var scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("New titler");
        //Some comment added
        //abc
        stage.show();
    }

}
