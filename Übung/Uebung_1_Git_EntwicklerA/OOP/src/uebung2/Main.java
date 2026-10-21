package uebung2;

import javafx.application.Application;
import javafx.stage.Stage;
import oop.AnwendungssystemControl;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		new AnwendungssystemControl(primaryStage);
	}
}
