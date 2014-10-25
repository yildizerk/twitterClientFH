package edu.fh.twitterclient.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

/**
 * MainController class
 *
 * 
 * @author lennart-WOB
 * @version 1.0
 * 
 */
public class MainController implements Initializable {
            
    @FXML
    private AnchorPane layoutMain;
    
    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        
    }
    
    public void setLayout(Node node) {
        System.out.println("MainController Node node: " + node);
        layoutMain.getChildren().setAll(node);
    }

}

