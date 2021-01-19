
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class Controller {
    @FXML
    private AnchorPane mainAnchorPane;
    @FXML
    private TextField newUserUserNameTextFiled;
    @FXML
    private TextField newUserPasswordTextFiled;
    @FXML
    private GridPane mainBorderPane;

    //Student Login Button
    public void showloginwindow(ActionEvent actionEvent) throws IOException {

        if (newUserUserNameTextFiled == null) {
            Alert alert1 = new Alert(Alert.AlertType.ERROR);
            alert1.setTitle("Error");
            alert1.setContentText("Please enter your UserName");
            alert1.setHeaderText(null);
            alert1.show();

        } else if (newUserPasswordTextFiled == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Please enter your Password");
            alert.setHeaderText(null);
            alert.show();

        } else {
            System.out.println("UserName: " + newUserUserNameTextFiled.getText());
            System.out.println("UserName: " + newUserPasswordTextFiled.getText());

        }
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Students.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();


    }

      /*  Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainAnchorPane.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(".fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("IOException: Could not load New Students Dialog ");
            e.printStackTrace();
        }

        Optional<ButtonType> result = dialog.showAndWait(); */

    public void showsignupwindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void showForgetPasswindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("StudentForgetPass.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void showResetPasswindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("StudentResetPass.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    public void showStudentwindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Students.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void ShowStudentswindow(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Students.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }


}


