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
public class AddVehicleController implements Initializable {
    
    final JFileChooser chooser = new JFileChooser();
    tagg validator = new tagg(System.getProperty("user.dir") + "/src/main/resources/python");
    
    @FXML
    private TextField fronttext;
    
    @FXML
    private TextField backtext;
    
    @FXML
    private TextField passtext;
    
    @FXML
    private TextField drivertext;
    
    
    @FXML
    private Button importbtn;
    
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
        fronttext.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
        System.out.println("No Selection ");
        }

        }
        else if(event.getSource()== driverbtn){
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
       fronttext.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
        System.out.println("No Selection ");
        }

        }
        else if(event.getSource()== passengerbtn){
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        fronttext.setText(chooser.getSelectedFile().getAbsolutePath());
        } else {
        System.out.println("No Selection ");
}

        }
        
    }

    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }   

    private void openFile(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
