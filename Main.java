package application;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            BorderPane root = loader.load(new FileInputStream("src/application/Panes.fxml")); 
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("RouteFinder");
			primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();  
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}