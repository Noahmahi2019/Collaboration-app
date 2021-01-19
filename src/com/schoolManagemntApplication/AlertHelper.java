package com.schoolManagemntApplication;

import javafx.scene.control.Alert;

public class AlertHelper {
    public static void showAlert(Alert.AlertType alertType, String error, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.setHeaderText(null);
        alert.show();


    }
}
