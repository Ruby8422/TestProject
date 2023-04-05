package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("../View/Dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 337, 307);
        stage.setTitle("Inventory Management");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
