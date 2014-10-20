package edu.fh.twitterclient.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * LoginController class
 *
 * 
 * @author lennart-WOB
 * @version 1.0
 * 
 */
public class LoginController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private TextField name;
    @FXML
    private PasswordField password;
            
    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        loginButton.setOnAction(this::handleLoginButtonAction);
    }    
    
    protected void handleLoginButtonAction(ActionEvent e) {
        System.out.println("Login Button pressed! "
                + "name: " + name.getText()
                + "password: " + password.getText());
    }
}
