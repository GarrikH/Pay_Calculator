package edu.citytech.midTerm;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class midTerm_Main extends Application {

	public static void main(String[] args) {
		Application.launch(midTerm_Main.class, args);

	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MidTerm_GUI.fxml"));
		stage.setTitle("Pay Calculator");
		stage.setScene(new Scene(root));
		
		stage.show();
	}

}
