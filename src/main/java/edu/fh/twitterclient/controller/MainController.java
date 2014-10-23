package edu.fh.twitterclient.controller;

import javafx.fxml.FXML;
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
public class MainController {
            
    @FXML
    private AnchorPane layout;
    
    public void setLayout(Node node) {
        layout.getChildren().setAll(node);
    }

}

