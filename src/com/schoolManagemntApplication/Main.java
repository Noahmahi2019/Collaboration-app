package com.schoolManagemntApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Assignment.fxml"));
        primaryStage.setTitle("School management system");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
