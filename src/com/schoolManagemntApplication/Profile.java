package com.schoolManagemntApplication;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class Profile {

    public Button CreateButton;
    @FXML
    private TextField FirstName;
    @FXML
    private TextField LastName;
    @FXML
    private TextField StudentId;
    @FXML
    private TextField EmailAddress;
    @FXML
    private TextField Address;
    @FXML
    private TextField CellPhone;

    @FXML
    public void StudentProfileWindow(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/schoolManagemntApplication/StudentProfile"));
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

//
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("second.fxml"));
//        AnchorPane frame = fxmlLoader.load();
//        StudentProfile.StudentController c = (StudentProfile.StudentController) fxmlLoader.getController();
//        StudentProfile.StudentController studentProfile = loader.getController();
//        studentProfile.myFunction(FirstName.getText());
//        studentProfile.myFunction(LastName.getText());
//        studentProfile.myFunction(StudentId.getText());
//        studentProfile.myFunction(EmailAddress.getText());
//        studentProfile.myFunction(Address.getText());
//        studentProfile.myFunction(CellPhone.getText());
//
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root));
//        stage.show();
//    } catch(
//    IOException e)
//
//    {
//        e.printStackTrace();
//    }
//}
////    }
//
////     Parent home_page_parent = FXMLLoader.load(getClass().getResource("StudentProfile.fxml"));
////      Scene home_page_scene = new Scene(home_page_parent);
////      Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
////      app_stage.hide();
////     app_stage.setScene(home_page_scene);
////      app_stage.show();
//
//
////        String nameText = firstName.getText();
////        String lastNameText = lastName.getText();
////        String studentIdText = studentId.getText();
////        String emailAddressText = emailAddress.getText();
////        String cellPhoneText = cellPhone.getText();
////        String addressText = address.getText();
////
////
////       Profile profile = new Profile(firstName, lastName, studentId, emailAddress, cellPhone, address);
////       ProfileService.getInstance().addProfile(newProfile);
////
////    }
////}

    public void CreateButtonClicked(MouseEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("StudentProfile.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/schoolManagemntApplication/StudentProfile"));
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