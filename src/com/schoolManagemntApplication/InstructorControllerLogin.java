package com.schoolManagemntApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class InstructorControllerLogin {
    @FXML
    private AnchorPane mainAnchorPane;
    @FXML
    private TextField newUserUserNameTextFiled;
    @FXML
    private TextField newUserPasswordTextFiled;
    @FXML
    private GridPane mainBorderPane;

    public void showloginwindow(ActionEvent actionEvent) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainAnchorPane.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Instructor.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("IOException: Could not load New Students Dialog ");
            e.printStackTrace();
        }

        Optional<ButtonType> result = dialog.showAndWait();

    }


    public void showSignUpwindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("InstructorSignUp.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void showInstructorForgetPasswindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("InstructorForgetPass.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    public void showResetPasswindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("InstructorResetPass.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void showInstructorwindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Instructor.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
}
