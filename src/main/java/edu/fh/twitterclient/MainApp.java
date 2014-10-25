package edu.fh.twitterclient;

import edu.fh.twitterclient.controller.MainController;
import edu.fh.twitterclient.controller.LayoutManager;
import java.io.IOException;
import javafx.scene.image.Image;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * MainApp class
 *
 * 
 * @author lennart-WOB
 * @version 1.0-alpha
 * 
 */
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final Image appImage = new Image("/pics/twitter.png");
        
        stage.setTitle("Twitter Client based on JavaFX");
        stage.getIcons().add(appImage);
        stage.setResizable(false);
        stage.setScene(createScene(loadMainPane()));
        stage.show();
    }
   
    private Pane loadMainPane() throws IOException {
        URL fxmlLocation = getClass().getResource(LayoutManager.MAIN);
        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        
        Pane mainPane = loader.load(); 
 
        MainController mainController = loader.getController(); 
 
        LayoutManager.setMainController(mainController);
        LayoutManager.loadLayout(LayoutManager.CHILDLOGIN);
        return mainPane;
    }
       
    private Scene createScene(Pane mainPane) {
        Scene scene = new Scene(mainPane, 545, 430);
        
        return scene;
    }
    
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
