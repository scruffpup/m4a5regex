/*
 *
 *  Project    :  m4a5regex
 *  Assignment :
 *  File       :  RegEx.java
 *  Name       :  Kelly Tidwell
 *  Date       :  Mar 9, 2018
 *
 *  Description : (Narrative desciption, not code)
 *
 *   this app displays a gui that validates text that is typed into the boxes
 *   it uses regular expressions to validate the data
 *
 ********************************************************/
package m4a5regex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegExApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("RegEx.fxml"));

		Scene scene = new Scene(root); // attach scene graph to scene
		stage.setTitle("RegEx--Kelly Tidwell"); // displayed in window's title bar
		stage.setScene(scene); // attach scene to stage
		stage.show(); // display the stage
	}

	public static void main(String[] args) {
		launch(args);
	
	}
}
