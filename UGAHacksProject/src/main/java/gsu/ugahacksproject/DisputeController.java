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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iwasaki
 */
public class DisputeController implements Initializable, GlobalValidator {
    String expected;
    String dent = "dent";
    String perfect = "perfect";
    String fstate = "";
    String bstate = "";
    String dstate = "";
    String pstate = "";
    
    String fstatefinal;
    String bstatefinal;
    String dstatefinal;
    String pstatefinal;
    
    @FXML
    private CheckBox frontdent;
    @FXML
    private CheckBox frontgood;
    @FXML
    private CheckBox backdent;
    @FXML
    private CheckBox backgood;
    @FXML
    private CheckBox driverdent;
    @FXML
    private CheckBox drivergood;
    @FXML
    private CheckBox passdent;
    @FXML
    private CheckBox passgood;
    @FXML
    private Button confirmbtn;

    
    
    @FXML
    private void ToHome(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;
        
        if(PredictionVariables.frontstatus.equals(dent))
        {
            fstatefinal+= "dent";
        }
        else
        {
            fstatefinal += "perfect";
        }
        if(PredictionVariables.backstatus.equals(dent))
        {
            bstatefinal += "dent";
        }
        else
        {
            bstatefinal += "perfect";
        }
        if(PredictionVariables.driverstatus.equals(dent))
        {
            dstatefinal += "dent";
        }
        else
        {
            dstatefinal += "perfect";
        }
        if(PredictionVariables.passstatus.equals(dent))
        {
            pstatefinal += "dent";
        }
        else
        {
            pstatefinal += "perfect";
        }
        
        
        
        
        
        if(fstate.equals(fstatefinal))
        {
            validator.trainNew(PredictionVariables.frontURL, PredictionVariables.frontstatus);
        }
        else
        {
            validator.dispute(PredictionVariables.frontURL, PredictionVariables.frontstatus, fstate);
        }
        if(bstate.equals(bstatefinal))
        {
            validator.trainNew(PredictionVariables.backURL, PredictionVariables.backstatus);
        }
        else
        {
            validator.dispute(PredictionVariables.backURL, PredictionVariables.backstatus, bstate);
        }
        if(dstate.equals(dstatefinal))
        {
            validator.trainNew(PredictionVariables.driverURL, PredictionVariables.driverstatus);
        }
        else
        {
            validator.dispute(PredictionVariables.driverURL, PredictionVariables.driverstatus, dstate);
        }
        if(pstate.equals(pstatefinal))
        {
            validator.trainNew(PredictionVariables.passURL, PredictionVariables.passstatus);
        }
        else
        {
            validator.dispute(PredictionVariables.passURL, PredictionVariables.passstatus, pstate);
        }
        
            
        
        
        
        stage=(Stage) confirmbtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/fxml/Home.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(PredictionVariables.frontstatus.equals("dent"))
        {
            frontdent.setSelected(true);
            fstate += "dent";
        }
        else
        {
            frontgood.setSelected(true);
            fstate += "perfect";
        }
        if(PredictionVariables.backstatus.equals("dent"))
        {
            backdent.setSelected(true);
            bstate += "dent";
        }
        else
        {
            backgood.setSelected(true);
            bstate += "perfect";
        }
        if(PredictionVariables.driverstatus.equals("dent"))
        {
            driverdent.setSelected(true);
            dstate += "dent";
        }
        else
        {
            drivergood.setSelected(true);
            dstate += "perfect";
        }
        if(PredictionVariables.passstatus.equals("dent"))
        {
            passdent.setSelected(true);
            pstate += "dent";
        }
        else
        {
            passgood.setSelected(true);
            pstate += "perfect";
        }
            
    }    
    
}
