package mvc2.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import mvc2.business.FreizeitbaederModel;
import mvc2.ownUtil.MeldungsfensterAnzeiger;

public class FreizeitbaederView {
	
	
	
	
	 public Pane getPane() {
		return pane;
	}


	public void setPane(Pane pane) {
		this.pane = pane;
	}


	public Label getLblEingabe() {
		return lblEingabe;
	}


	public void setLblEingabe(Label lblEingabe) {
		this.lblEingabe = lblEingabe;
	}


	public Label getLblAnzeige() {
		return lblAnzeige;
	}


	public void setLblAnzeige(Label lblAnzeige) {
		this.lblAnzeige = lblAnzeige;
	}


	public Label getLblName() {
		return lblName;
	}


	public void setLblName(Label lblName) {
		this.lblName = lblName;
	}


	public Label getLblGeoeffnetVon() {
		return lblGeoeffnetVon;
	}


	public void setLblGeoeffnetVon(Label lblGeoeffnetVon) {
		this.lblGeoeffnetVon = lblGeoeffnetVon;
	}


	public Label getLblGeoeffnetBis() {
		return lblGeoeffnetBis;
	}


	public void setLblGeoeffnetBis(Label lblGeoeffnetBis) {
		this.lblGeoeffnetBis = lblGeoeffnetBis;
	}


	public Label getLblBeckenlaenge() {
		return lblBeckenlaenge;
	}


	public void setLblBeckenlaenge(Label lblBeckenlaenge) {
		this.lblBeckenlaenge = lblBeckenlaenge;
	}


	public Label getLblWassTemperatur() {
		return lblWassTemperatur;
	}


	public void setLblWassTemperatur(Label lblWassTemperatur) {
		this.lblWassTemperatur = lblWassTemperatur;
	}


	public TextField getTxtName() {
		return txtName;
	}


	public void setTxtName(TextField txtName) {
		this.txtName = txtName;
	}


	public TextField getTxtGeoeffnetVon() {
		return txtGeoeffnetVon;
	}


	public void setTxtGeoeffnetVon(TextField txtGeoeffnetVon) {
		this.txtGeoeffnetVon = txtGeoeffnetVon;
	}


	public TextField getTxtGeoeffnetBis() {
		return txtGeoeffnetBis;
	}


	public void setTxtGeoeffnetBis(TextField txtGeoeffnetBis) {
		this.txtGeoeffnetBis = txtGeoeffnetBis;
	}


	public TextField getTxtBeckenlaenge() {
		return txtBeckenlaenge;
	}


	public void setTxtBeckenlaenge(TextField txtBeckenlaenge) {
		this.txtBeckenlaenge = txtBeckenlaenge;
	}


	public TextField getTxtWassTemperatur() {
		return txtWassTemperatur;
	}


	public void setTxtWassTemperatur(TextField txtWassTemperatur) {
		this.txtWassTemperatur = txtWassTemperatur;
	}


	public TextArea getTxtAnzeige() {
		return txtAnzeige;
	}


	public void setTxtAnzeige(TextArea txtAnzeige) {
		this.txtAnzeige = txtAnzeige;
	}


	public Button getBtnEingabe() {
		return btnEingabe;
	}


	public void setBtnEingabe(Button btnEingabe) {
		this.btnEingabe = btnEingabe;
	}


	public Button getBtnAnzeige() {
		return btnAnzeige;
	}


	public void setBtnAnzeige(Button btnAnzeige) {
		this.btnAnzeige = btnAnzeige;
	}


	public MenuBar getMnbrMenuLeiste() {
		return mnbrMenuLeiste;
	}


	public void setMnbrMenuLeiste(MenuBar mnbrMenuLeiste) {
		this.mnbrMenuLeiste = mnbrMenuLeiste;
	}


	public Menu getMnDatei() {
		return mnDatei;
	}


	public void setMnDatei(Menu mnDatei) {
		this.mnDatei = mnDatei;
	}


	public MenuItem getMnItmCsvExport() {
		return mnItmCsvExport;
	}


	public void setMnItmCsvExport(MenuItem mnItmCsvExport) {
		this.mnItmCsvExport = mnItmCsvExport;
	}


	public MenuItem getMnItmTxtExport() {
		return mnItmTxtExport;
	}


	public void setMnItmTxtExport(MenuItem mnItmTxtExport) {
		this.mnItmTxtExport = mnItmTxtExport;
	}


	public FreizeitbaederControl getFreizeitbaederControl() {
		return freizeitbaederControl;
	}


	public void setFreizeitbaederControl(FreizeitbaederControl freizeitbaederControl) {
		this.freizeitbaederControl = freizeitbaederControl;
	}


	public FreizeitbaederModel getFreizeitbaederModel() {
		return freizeitbaederModel;
	}


	public void setFreizeitbaederModel(FreizeitbaederModel freizeitbaederModel) {
		this.freizeitbaederModel = freizeitbaederModel;
	}

	//---Anfang Attribute der grafischen Oberflaeche---
    private Pane pane     				= new  Pane();
    private Label lblEingabe    	 	= new Label("Eingabe");
    private Label lblAnzeige   	 	    = new Label("Anzeige");
    private Label lblName 				= new Label("Name:");
    private Label lblGeoeffnetVon   	= new Label("Ge�ffnet von:");
    private Label lblGeoeffnetBis  	 	= new Label("Ge�ffnet bis:");
    private Label lblBeckenlaenge   	= new Label("Beckenl�nge:");
    private Label lblWassTemperatur  	= new Label("Wassertemperatur:");
    private TextField txtName 	 		= new TextField();
    private TextField txtGeoeffnetVon	= new TextField();
    private TextField txtGeoeffnetBis	= new TextField();
    private TextField txtBeckenlaenge	= new TextField();
    private TextField txtWassTemperatur	= new TextField();
    private TextArea txtAnzeige  		= new TextArea();
    private Button btnEingabe 		 	= new Button("Eingabe");
    private Button btnAnzeige 		 	= new Button("Anzeige");
    private MenuBar mnbrMenuLeiste  	= new MenuBar();
    private Menu mnDatei             	= new Menu("Datei");
    private MenuItem mnItmCsvExport 	= new MenuItem("csv-Export");
    private MenuItem mnItmTxtExport 	= new MenuItem("txt-Export");
	
	//
    //objekte
    //
    //
	private FreizeitbaederControl freizeitbaederControl;
    private FreizeitbaederModel freizeitbaederModel;
	
    
    //einfach aus anfwendder kopieren und  Klasse mit attribe rheinfolge für paramter also in den klammern
    // control , Stage primaryStage für das Programm und dann Moddel
	 public FreizeitbaederView(FreizeitbaederControl freizeitbaederControl,Stage primaryStage,FreizeitbaederModel freizeitbaederModel){
		 
		 //
		 //hier control erstmal erstellen dan model  in control model zuerst und rest kopiert lassen in dem konstruktur
		 //
		 this.freizeitbaederControl = freizeitbaederControl;
	     this.freizeitbaederModel = freizeitbaederModel;
		 
		 
	    	Scene scene = new Scene(this.pane, 560, 340);
	    	primaryStage.setScene(scene);
	    	primaryStage.setTitle("Verwaltung von Freizeitb�dern");
	    	primaryStage.show();
	    	this.initKomponenten();
			this.initListener();
	    }
	 
	 
	 private void initKomponenten(){
	       	// Labels
	    	lblEingabe.setLayoutX(20);
	    	lblEingabe.setLayoutY(40);
	    	Font font = new Font("Arial", 24); 
	    	lblEingabe.setFont(font);
	    	lblEingabe.setStyle("-fx-font-weight: bold;"); 
	    	lblAnzeige.setLayoutX(310);
	    	lblAnzeige.setLayoutY(40);
	      	lblAnzeige.setFont(font);
	       	lblAnzeige.setStyle("-fx-font-weight: bold;"); 
	       	lblName.setLayoutX(20);
	    	lblName.setLayoutY(90);
	    	lblGeoeffnetVon.setLayoutX(20);
	    	lblGeoeffnetVon.setLayoutY(130);
	    	lblGeoeffnetBis.setLayoutX(20);
	    	lblGeoeffnetBis.setLayoutY(170);
	    	lblBeckenlaenge.setLayoutX(20);
	    	lblBeckenlaenge.setLayoutY(210);
	    	lblWassTemperatur.setLayoutX(20);
	    	lblWassTemperatur.setLayoutY(250);    	
	       	pane.getChildren().addAll(lblEingabe, lblAnzeige, 
	       		lblName, lblGeoeffnetVon, lblGeoeffnetBis,
	       		lblBeckenlaenge, lblWassTemperatur);
	    
	    	// Textfelder
	     	txtName.setLayoutX(130);
	    	txtName.setLayoutY(90);
	    	txtGeoeffnetVon.setLayoutX(130);
	    	txtGeoeffnetVon.setLayoutY(130);
	    	txtGeoeffnetBis.setLayoutX(130);
	    	txtGeoeffnetBis.setLayoutY(170);
	      	txtBeckenlaenge.setLayoutX(130);
	    	txtBeckenlaenge.setLayoutY(210);
	    	txtWassTemperatur.setLayoutX(130);
	    	txtWassTemperatur.setLayoutY(250);
	     	pane.getChildren().addAll( 
	     		txtName, txtGeoeffnetVon, txtGeoeffnetBis,
	     		txtBeckenlaenge, txtWassTemperatur);
	     	
	        // Textbereich	
	        txtAnzeige.setEditable(false);
	     	txtAnzeige.setLayoutX(310);
	    	txtAnzeige.setLayoutY(90);
	     	txtAnzeige.setPrefWidth(220);
	    	txtAnzeige.setPrefHeight(185);
	       	pane.getChildren().add(txtAnzeige); 
	       	
	        // Buttons
	        btnEingabe.setLayoutX(20);
	        btnEingabe.setLayoutY(290);
	        btnAnzeige.setLayoutX(310);
	        btnAnzeige.setLayoutY(290);
	        pane.getChildren().addAll(btnEingabe, btnAnzeige); 
	        
	 		// Menu
	   	    this.mnbrMenuLeiste.getMenus().add(mnDatei);
	  	    this.mnDatei.getItems().add(mnItmCsvExport);
	  	    this.mnDatei.getItems().add(mnItmTxtExport);
	 	    pane.getChildren().add(mnbrMenuLeiste);
	   }
	 
	 private void initListener() {
		    btnEingabe.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent e) {
	            	// 
	            	//freizeitbaederControl.   
	            	//
	        	    freizeitbaederControl.nehmeFreizeitbadAuf();
	            }
		    });
		    btnAnzeige.setOnAction(new EventHandler<ActionEvent>() {
		    	@Override
		        public void handle(ActionEvent e) {
		            zeigeFreizeitbaederAn();
		        } 
	   	    });  
	    }
	 
	 
	  void zeigeInformationsfensterAn(String meldung){
	    	new MeldungsfensterAnzeiger(AlertType.INFORMATION,
	    		"Information", meldung).zeigeMeldungsfensterAn();
	    }	
	    
	    void zeigeFehlermeldungsfensterAn(String fehlertyp, String meldung){
	       	new MeldungsfensterAnzeiger(AlertType.ERROR,
	        	fehlertyp + "Fehler", meldung).zeigeMeldungsfensterAn();
	    }
	   

	    
	    //
	    //das muss auswendig gelernt werden ist nicht kompliziert zu verstheen, aber braucht zeit
	    //
	    
private void zeigeFreizeitbaederAn() {

    if (freizeitbaederModel.getFreizeitbad() != null) {
        txtAnzeige.setText(
            freizeitbaederModel.getFreizeitbad()
                .gibFreizeitbadZurueck(' ')
        );
    }
    else {
        zeigeInformationsfensterAn(
            "Bisher wurde kein Freizeitbad aufgenommen!"
        );
    }
}

	    
	 
}
