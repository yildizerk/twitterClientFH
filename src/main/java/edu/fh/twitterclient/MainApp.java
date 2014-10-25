package edu.fh.twitterclient;

import edu.fh.twitterclient.controller.MainController;
import edu.fh.twitterclient.controller.LayoutManager;
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
        
        
        //final URL fxmlLocation = getClass().getResource("/fxml/ChildLogin.fxml");
        //final FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
        //fxmlLoader.setController(new ChildLoginController());
        //final Parent root = fxmlLoader.load();
        final Image appImage = new Image("/pics/twitter.png");
                             
        
        /*Scene scene = new Scene(root, 545, 430); 
        stage.setTitle("Twitter Client based on JavaFX");
        stage.getIcons().add(appImage);
        stage.setResizable(false);
        stage.setScene(scene); 
        stage.show();*/
        

        stage.setTitle("Twitter Client based on JavaFX");
        stage.getIcons().add(appImage);
        stage.setResizable(false);
        stage.setScene(createScene(loadMainAnchorPane()));
        stage.show();
    }
   
    private AnchorPane loadMainAnchorPane() throws IOException {
        URL fxmlLocation = getClass().getResource(LayoutManager.MAIN);
        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        
        AnchorPane mainAnchorPane = loader.load(); 
 
        System.out.println("fxmlLocation MainApp: " + fxmlLocation);
        System.out.println("loadMainAnchor erreicht -> " + LayoutManager.MAIN);
        MainController mainController = loader.getController(); 
 
        LayoutManager.setMainController(mainController);
        System.out.println("ChildLogin erreicht");
        LayoutManager.loadLayout(LayoutManager.CHILDLOGIN);
        System.out.println("ChildLogin2 erreicht");
        return mainAnchorPane;
    }
       
    private Scene createScene(AnchorPane mainAnchorPane) {
        Scene scene = new Scene(mainAnchorPane, 545, 430);
        
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
