package teppich;

import javafx.application.Application;
import javafx.stage.Stage;

public class Mainnnn extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		new TeppichControl(primaryStage);
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
