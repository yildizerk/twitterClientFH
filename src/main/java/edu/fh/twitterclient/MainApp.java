package edu.fh.twitterclient;

import edu.fh.twitterclient.controller.LoginController;
import java.io.IOException;
import javafx.scene.image.Image;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * MainApp class
 *
 * 
 * @author lennart-WOB
 * @version 1.0-alpha
 * 
 * Diverse Anpassungen noch ausstehend:
 * Es muessen noch Methoden fuer das Laden der AnchorPane
 * und dem Erstellen der Scene bereitgestellt werden!
 * Sollte Freitag im Laufe des Tages erledigt sein.
 * 
 */
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        /* nicht fertig! */
        final URL fxmlLocation = getClass().getResource("/fxml/Login.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
        fxmlLoader.setController(new LoginController());
        final Parent root = fxmlLoader.load();
        final Image appImage = new Image("/pics/twitter.png");
        /*                      */
        
        Scene scene = new Scene(root, 545, 430); // nicht fertig!
        stage.setTitle("Twitter Client based on JavaFX");
        stage.getIcons().add(appImage);
        stage.setResizable(false);
        stage.setScene(scene); //nicht fertig!
        stage.show();
    }

    /* to-do
    private AnchorPane loadMainAnchorPane() throws IOException {
        return mainAnchorPane;
    }
    */
    
    /* to-do
    private Scene createScene(AnchorPane mainAnchorPane) {
        return scene;
    }
    */
    
    /**
     * main() Methode wird ignoriert, da es sich um eine JavaFX Anwendung handelt.
     * Nur fuer den Fall, dass unerwartete Fehler auftreten und das Programm
     * nicht startet.
     *
     * @param args Kommandozeilen Parameter
     */
    public static void main(String[] args) {
        launch(args);
    }

}
