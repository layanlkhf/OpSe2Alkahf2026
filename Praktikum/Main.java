package mvc2.main;

import mvc2.gui.FreizeitbaederAnwendersystem;
import mvc2.gui.FreizeitbaederControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		
		//
		//nur name ändern von anwender zu control
		//
		new FreizeitbaederControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
