/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsu.ugahacksproject;

import java.io.File;
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
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JFileChooser;

/**
 * FXML Controller class
 *
 * @author Iwasaki
 */
public class AddVehicleController implements Initializable, GlobalValidator {
    final JFileChooser chooser = new JFileChooser();
    
    @FXML
    private TextField fronttext;
    @FXML
    private TextField backtext;
    @FXML
    private TextField passtext;
    @FXML
    private TextField drivertext;
    @FXML
    private Button frontbtn;
    @FXML
    private Button backbtn;
    @FXML
    private Button driverbtn;
    @FXML
    private Button passengerbtn;
    @FXML
    private Button submitbtn;
    @FXML
    private void OpenUpload(ActionEvent event) throws IOException {
        Stage stage; 
        if(event.getSource()== frontbtn){
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        fronttext.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
        System.out.println("No Selection ");
        }

        }
        else if(event.getSource()== backbtn){
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        backtext.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
        System.out.println("No Selection ");
        }

        }
        else if(event.getSource()== driverbtn){
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        drivertext.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
        System.out.println("No Selection ");
        }

        }
        else if(event.getSource()== passengerbtn){
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        passtext.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
        System.out.println("No Selection ");
        }

        }
        
    }
    @FXML
    private void ToDispute(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;
         PredictionVariables.frontURL = fronttext.getText();
         PredictionVariables.backURL = backtext.getText();
         PredictionVariables.driverURL = drivertext.getText();
         PredictionVariables.passURL = passtext.getText();
        
        PredictionVariables.frontstatus = validator.predict(PredictionVariables.frontURL);
        PredictionVariables.backstatus= validator.predict( PredictionVariables.backURL);
        PredictionVariables.driverstatus = validator.predict( PredictionVariables.driverURL);
        PredictionVariables.passstatus = validator.predict( PredictionVariables.passURL);
        
        
        stage=(Stage) submitbtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/fxml/Dispute.fxml"));

        
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }   

    private void openFile(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
