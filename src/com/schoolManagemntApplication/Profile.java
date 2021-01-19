package com.schoolManagemntApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Profile {

    public Button CreateButton;
    @FXML
    public TextField FirstName;
    @FXML
    public TextField LastName;
    @FXML
    public TextField StudentId;
    @FXML
    public TextField EmailAddress;
    @FXML
    public TextField Address;
    @FXML
    public TextField CellPhone;

    @FXML
    public void StudentProfileWindow(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("schoolManagemntApplication/StudentProfile.fxml"));
            Parent root = (Parent) loader.load();

            StudentProfile.StudentController studentProfile = loader.getController();
            studentProfile.myFunction(FirstName.getText());
            studentProfile.myFunction(LastName.getText());
            studentProfile.myFunction(StudentId.getText());
            studentProfile.myFunction(EmailAddress.getText());
            studentProfile.myFunction(Address.getText());
            studentProfile.myFunction(CellPhone.getText());

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//     Parent home_page_parent = FXMLLoader.load(getClass().getResource("StudentProfile.fxml"));
//      Scene home_page_scene = new Scene(home_page_parent);
//      Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//      app_stage.hide();
//     app_stage.setScene(home_page_scene);
//      app_stage.show();


//        String nameText = firstName.getText();
//        String lastNameText = lastName.getText();
//        String studentIdText = studentId.getText();
//        String emailAddressText = emailAddress.getText();
//        String cellPhoneText = cellPhone.getText();
//        String addressText = address.getText();
//
//
//       Profile profile = new Profile(firstName, lastName, studentId, emailAddress, cellPhone, address);
//       ProfileService.getInstance().addProfile(newProfile);
//
//    }
//}
