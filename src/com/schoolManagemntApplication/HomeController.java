package com.schoolManagemntApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button chatView;
    @FXML
    private AnchorPane mainAnchorPane;
    @FXML
    private ImageView imageView;

    public Controller() {
    }

    public void initialize () {

        System.out.println("testing");
    }



    public void showChatWindow(ActionEvent actionEvent) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainAnchorPane.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Chat.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("IOException: Couldn't load Chat Window");
            e.printStackTrace();
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);


        // display the dialog
        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            ChatWindowController controller = fxmlLoader.getController();
            System.out.println("New Chat Created");
        }
        else {
            System.out.println("New Chat canceled!");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("src/img/logos.jpg");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
    }

    public void handleButtonClicks(ActionEvent actionEvent) {
    }
}
