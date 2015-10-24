package gsu.ugahacksproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iwasaki
 */
public class HomeController implements Initializable {

    @FXML
    private Hyperlink avlink;
    @FXML
    private Hyperlink logoutlink;
    
    @FXML
    private void ToAddVehicle(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;

        stage=(Stage) avlink.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/fxml/AddVehicle.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void LogOut(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;

        stage=(Stage) logoutlink.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/fxml/LogIn.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
