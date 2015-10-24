/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsu.ugahacksproject;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
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
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
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
    private Hyperlink fronthyper;
    @FXML
    private Object primaryStage;
    private Object imageView;
    
    @FXML
    private void OpenUpload(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        Stage stage; 
        Parent root;

        stage=(Stage) frontbtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/fxml/text.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }   

    
}
