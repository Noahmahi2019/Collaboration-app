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
<<<<<<< HEAD
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.setTitle("School Management Application");
        primaryStage.setScene(new Scene(root, 300, 275));
=======
        Parent root = FXMLLoader.load(getClass().getResource("Assignment.fxml"));
        primaryStage.setTitle("School management system");
        primaryStage.setScene(new Scene(root, 700, 500));
>>>>>>> 2fe5064bc0b9e38c3b77c504273d77a13f8bdeeb
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
