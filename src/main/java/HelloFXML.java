package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFXML extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml_example.fxml"));

        Scene scene = new Scene(root, 300, 275);
        stage.setTitle("Hello FXML");
        stage.setScene(scene);

        stage.show();
    }
}
