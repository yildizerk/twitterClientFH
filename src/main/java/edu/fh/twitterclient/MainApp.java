package edu.fh.twitterclient;

import edu.fh.twitterclient.controller.LoginController;
import javafx.scene.image.Image;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

/**
 * MainApp class
 *
 * 
 * @author lennart-WOB
 * @version 1.0
 * 
 */
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final URL fxmlLocation = getClass().getResource("/fxml/Login.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
        fxmlLoader.setController(new LoginController());
        final Parent root = fxmlLoader.load();
        final Image appImage = new Image("/pics/twitter.png");

        Scene scene = new Scene(root, 545, 430);
        //scene.getStylesheets().add("/styles/Login.css");
        
        stage.setTitle("Twitter Client based on JavaFX");
        stage.getIcons().add(appImage);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * main() Methode wird ignoriert, da es sich um eine JavaFX Anwendung handelt.
     * Nur für den Fall, dass unerwartete Fehler auftreten und das Programm
     * nicht startet.
     *
     * @param args Kommandozeilen Parameter
     */
    public static void main(String[] args) {
        launch(args);
    }

}
