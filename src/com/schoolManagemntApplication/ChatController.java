package com.schoolManagemntApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.fxml.Initializable;

// Add image
public class ChatController implements Initializable {
    public AnchorPane chatAnchorPane;
    public ImageView imageView;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("src/img/logos.jpg");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
    }



    public ChatController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Chat.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
    }


    public void handleButtonClicks(ActionEvent actionEvent) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(chatAnchorPane.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Chat.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }
        catch (IOException e) {
            System.out.println("IOException: Could not load New Students Dialog ");
            e.printStackTrace();
        }
        Optional<ButtonType> result = dialog.showAndWait();
    }

    public void nextButtonClicks(ActionEvent actionEvent)  throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Student.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    public void previousButtonClicks(ActionEvent actionEvent)  throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
}
