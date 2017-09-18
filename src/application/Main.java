package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javafx.stage.Stage;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("JFXHamBurgerDemo.fxml"));
        primaryStage.setTitle("FXML Control Demo");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
