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
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iwasaki
 */
public class AddVehicleController implements Initializable {

    @FXML
    private Button frontbtn;
    
    @FXML
    private Button uploadbtn;
    
    @FXML
    private Button backbtn;
    
    @FXML
    private Button driverbtn;
    
    @FXML
    private Button passengerbtn;
    
    
    
    @FXML
    private void OpenUpload(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;
        if(event.getSource()== frontbtn){
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("/fxml/URL.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(frontbtn.getScene().getWindow());
        stage.showAndWait();
        }
        if(event.getSource()== backbtn){
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("/fxml/URL.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(backbtn.getScene().getWindow());
        stage.showAndWait();
        }
        if(event.getSource()== driverbtn){
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("/fxml/URL.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(driverbtn.getScene().getWindow());
        stage.showAndWait();
        }
        if(event.getSource()== passengerbtn){
        stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("/fxml/URL.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(passengerbtn.getScene().getWindow());
        stage.showAndWait();
        }
        else{
        stage = (Stage) uploadbtn.getScene().getWindow();
        stage.close();
        }
        
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }   
    
}
