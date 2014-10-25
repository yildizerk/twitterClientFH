package edu.fh.twitterclient.controller;

import edu.fh.twitterclient.controller.MainController;
import edu.fh.twitterclient.controller.MainController;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;


/**
 * LayoutManager class
 *
 * 
 * @author lennart-WOB
 * @version 1.0
 * 
 */
public class LayoutManager {
            
    public static final String MAIN = "/fxml/Main.fxml";
    public static final String CHILDLOGIN = "/fxml/ChildLogin.fxml";
    private static MainController mainController;

    public static void setMainController(MainController mainController) {
        LayoutManager.mainController = mainController;
    }
    
    public static void loadLayout(String fxml) throws IOException{
        /*try {
            mainController.setLayout((Node) FXMLLoader.load(LayoutManager.class.getResource(fxml)));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        System.out.println("LayoutManager String fxml: " + fxml);
                mainController.setLayout((Node) FXMLLoader.load(LayoutManager.class.getResource(fxml)));
    }
}