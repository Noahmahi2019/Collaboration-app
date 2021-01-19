package com.schoolManagemntApplication;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentProfile {
    @FXML
    public Label LabelFirstName;
    @FXML
    public Label LabelLastName;
    @FXML
    public Label LabelId;
    @FXML
    public Label LabelEmail;
    @FXML
    public Label LabelAddress;
    @FXML
    public Label LabelCellPhone;


    public class StudentController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
       public void myFunction(String text){
        LabelFirstName.setText(text);
        LabelLastName.setText(text);
        LabelId.setText(text);
        LabelEmail.setText(text);
        LabelAddress.setText(text);
        LabelCellPhone.setText(text);


//        name.setText(Storage.getName());
//        age.setText(Storage.getAge());
//        gender.setText(Storage.getGender());
//        email.setText(Storage.getEmail());
//        contact.setText(Storage.getContact());
//        password.setText(Storage.getPassword());
//
//        if (Storage.getEmail() != null) {
//            //Disable everything
//            name.setDisable(true);
//            age.setDisable(true);
//            gender.setDisable(true);
//            email.setDisable(true);
//            contact.setDisable(true);
//            password.setDisable(true);
        }



    }
    }

//        private final String text_File_Location;
//        private long count;
//
//        public TextFileReader(String url)
//        {
//            this.text_File_Location = url;
//            List<String> lineList = new ArrayList<String>();
//            countLines();
//            initFontCodeList();
//        }
//        private void countLines()
//        {
//            try {
//                count = Files.lines(Paths.get(text_File_Location)).count();
//            } catch (IOException e1) { System.err.println("TextFileReader : Count Failed" +e1); }
//        }
//
//        private void initFontCodeList() {
//            try
//            {
//
//                Path path = Paths.get(text_File_Location);
//
//                for (int i = 0; i < count; i++)
//                {
//                    String line = Files.readAllLines(path).get(i);
//                    //Acording to format Name, Email, Password, Age, Gender
//                    String[] profile = line.split(",");
//                    String name = profile[0];
//                    String email = profile[1];
//                    String Password = profile[2];
//                    String age = profile[4];
//                    String gender =  profile[5];
//
//
//                }
//
//
//            }
//            catch (IOException e) {System.err.println("TextFileReader : ReadFile Failed");}
//        }
//
//
//
//    }
//
//}
//
//
////    public StudentProfile(String profileFirstName, String profileLastName, String profileStudentId, String profileEmailAddress, String profileCellPhone, String profileAddress) {
