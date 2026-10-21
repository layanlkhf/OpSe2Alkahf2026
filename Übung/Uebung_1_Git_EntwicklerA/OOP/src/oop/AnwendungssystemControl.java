package oop;

import javafx.stage.Stage;

public class AnwendungssystemControl {

	
	private AnwendungssystemModel anwModel;
	private AnwendungssystemView anwView;
	
	public AnwendungssystemControl(Stage primaryStage) {
		this.anwModel = new AnwendungssystemModel();
		this.anwView = new AnwendungssystemView(this, primaryStage, this.anwModel);
		
	}
	
}
