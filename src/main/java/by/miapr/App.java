package by.miapr;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = Loader.loadFXMLScene("scenes/main");
        primaryStage.setTitle("Вероятностный подход");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 850, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
