package com.schoolManagemntApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
    public Button Previous;
    public Button Next;
    private Node MainAnchorpane;

    public void onOk(ActionEvent event) {
    }

    public void onCancel(ActionEvent event) {
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }

    public void ok(MouseEvent mouseEvent) {

    }

    public void payAlert(MouseEvent mouseEvent) {
            if (name.getText().isBlank() || cardNumber.getText().isBlank() ||
                    expDate.getText().isBlank() || cvv.getText().isBlank()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Please enter your information");
                alert.setHeaderText(null);
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("successfully paid");
                alert.setHeaderText(null);
                alert.show();
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

    public void previousButtonClicks(MouseEvent actionEvent)  throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Courses.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void nextButtonClicks(MouseEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Resources.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    }
