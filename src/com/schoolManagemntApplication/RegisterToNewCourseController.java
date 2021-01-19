package com.schoolManagemntApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import java.io.IOException;
import java.util.Optional;

public class RegisterToNewCourseController {

    @FXML
    public Button CancelButton;
    @FXML
    public Button OKButton;
    public TextField Ok;
    public TextField cardNumber;
    public TextField expDate;
    public TextField cvv;
    public TextField name;
    public Label label;
    private Node MainAnchorpane;

    public void onOk(ActionEvent event) {
    }

    public void onCancel(ActionEvent event) {

    }

    public void ok(MouseEvent mouseEvent) {

    }

    public void payAlert(MouseEvent mouseEvent) {
        if (name.getText().isBlank() || cardNumber.getText().isBlank() ||
                expDate.getText().isBlank() || cvv.getText().isBlank()) {
            if (name.getText().isBlank() || cardNumber.getText().isBlank() ||
                    expDate.getText().isBlank() || cvv.getText().isBlank()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Please enter your information");
                alert.setHeaderText(null);
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Account  successfully created ");
                alert.setHeaderText(null);
                alert.show();
            }
        }
    }

    public void showokwindow(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Test");
        alert.setHeaderText("Registration successfully created.");
        alert.setResizable(false);
        alert.setContentText("Select okay or cancel this alert.");

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);
        if (button == ButtonType.OK) {
            System.out.println("Ok pressed");
        } else {
            System.out.println("canceled");
        }
    }
}