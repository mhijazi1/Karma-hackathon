/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsu.ugahacksproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iwasaki
 */
public class LogInController implements Initializable {

    @FXML
    private Button submitbtn;
    @FXML
    private Hyperlink reglink;
    
    @FXML
    private void ToHome(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;

        stage=(Stage) submitbtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/fxml/Home.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    @FXML
    private void ToRegistration(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;

        stage=(Stage) reglink.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/fxml/Registration.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
