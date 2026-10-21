package oop;

import javafx.stage.Stage;

public class AnwendungssystemView {

	private AnwendungssystemControl anwControl;
	private AnwendungssystemModel anwModel;
	
	public AnwendungssystemView(AnwendungssystemControl anwControl, Stage primaryStage,
			AnwendungssystemModel anwModel) {
		
		this.anwControl = anwControl;
		this.anwModel = anwModel;
	}
	
	
}
