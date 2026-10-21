package bahnhof;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import bahnhof.MeldungsfensterAnzeiger;
import bahnhof.Bahnhof;

import bahnhof.BahnhofControl;
import bahnhof.BahnhofModel;

public class BahnhofView {
	
	
	private Bahnhof bahnhof;
	private BahnhofControl bahnhofControl;
	private BahnhofModel bahnhofModel;
	
	

public BahnhofView(Stage primaryStage, BahnhofModel bahnhofModel, BahnhofControl bahnhofControl ){
    	
    	this.bahnhofControl = bahnhofControl;
    	this.bahnhofModel = bahnhofModel;
    	Scene scene = new Scene(this.pane, 700, 340);
    	primaryStage.setScene(scene);
    	primaryStage.setTitle("Verwaltung von Bürgerämtern");
    	primaryStage.show();
    	this.initKomponenten();
		this.initListener();
    }



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

	public Label getLblOrt() {
		return lblOrt;
	}

	public void setLblOrt(Label lblOrt) {
		this.lblOrt = lblOrt;
	}

	public Label getLblAnzGleisen() {
		return lblAnzGleisen;
	}

	public void setLblAnzGleisen(Label lblAnzGleisen) {
		this.lblAnzGleisen = lblAnzGleisen;
	}

	public Label getLblLetzteRenovierung() {
		return lblLetzteRenovierung;
	}

	public void setLblLetzteRenovierung(Label lblLetzteRenovierung) {
		this.lblLetzteRenovierung = lblLetzteRenovierung;
	}

	public Label getLblZugarten() {
		return lblZugarten;
	}

	public void setLblZugarten(Label lblZugarten) {
		this.lblZugarten = lblZugarten;
	}

	public TextField getTxtName() {
		return txtName;
	}

	public void setTxtName(TextField txtName) {
		this.txtName = txtName;
	}

	public TextField getTxtOrt() {
		return txtOrt;
	}

	public void setTxtOrt(TextField txtOrt) {
		this.txtOrt = txtOrt;
	}

	public TextField getTxtAnzGleisen() {
		return txtAnzGleisen;
	}

	public void setTxtAnzGleisen(TextField txtAnzGleisen) {
		this.txtAnzGleisen = txtAnzGleisen;
	}

	public TextField getTxtLetzteRenovierung() {
		return txtLetzteRenovierung;
	}

	public void setTxtLetzteRenovierung(TextField txtLetzteRenovierung) {
		this.txtLetzteRenovierung = txtLetzteRenovierung;
	}

	public TextField getTxtZugarten() {
		return txtZugarten;
	}

	public void setTxtZugarten(TextField txtZugarten) {
		this.txtZugarten = txtZugarten;
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

	public MenuItem getMnItmCsvImport() {
		return mnItmCsvImport;
	}

	public void setMnItmCsvImport(MenuItem mnItmCsvImport) {
		this.mnItmCsvImport = mnItmCsvImport;
	}

	public MenuItem getMnItmTxtImport() {
		return mnItmTxtImport;
	}

	public void setMnItmTxtImport(MenuItem mnItmTxtImport) {
		this.mnItmTxtImport = mnItmTxtImport;
	}

	public MenuItem getMnItmCsvExport() {
		return mnItmCsvExport;
	}

	public void setMnItmCsvExport(MenuItem mnItmCsvExport) {
		this.mnItmCsvExport = mnItmCsvExport;
	}

	//---Anfang Attribute der grafischen Oberflaeche---
    private Pane pane     					= new  Pane();
    private Label lblEingabe    	 		= new Label("Eingabe");
    private Label lblAnzeige   	 	    	= new Label("Anzeige");
    private Label lblName 					= new Label("Name:");
    private Label lblOrt            		= new Label("Ort:");
    private Label lblAnzGleisen      		= new Label("Anzahl Gleisen:");
    private Label lblLetzteRenovierung		= new Label("Letzte Renovierung:");
    private Label lblZugarten   			= new Label("Zugarten:");
    private TextField txtName 	 			= new TextField();
    private TextField txtOrt         		= new TextField();
    private TextField txtAnzGleisen  		= new TextField();
    private TextField txtLetzteRenovierung	= new TextField();
    private TextField txtZugarten	        = new TextField();
    private TextArea txtAnzeige  			= new TextArea();
    private Button btnEingabe 		 		= new Button("Eingabe");
    private Button btnAnzeige 		 		= new Button("Anzeige");
    private MenuBar mnbrMenuLeiste  		= new MenuBar();
    private Menu mnDatei             		= new Menu("Datei");
    private MenuItem mnItmCsvImport 		= new MenuItem("csv-Import");
    private MenuItem mnItmTxtImport 		= new MenuItem("txt-Import");
    private MenuItem mnItmCsvExport 		= new MenuItem("csv-Export");    
    //-------Ende Attribute der grafischen Oberflaeche-------
    
    
    public BahnhofView(Stage primaryStage, BahnhofControl bahnhofControl, BahnhofModel bahnhofModel){
    	
    	this.bahnhofControl = bahnhofControl;
    	this.bahnhofModel = bahnhofModel;
    	
    	Scene scene = new Scene(this.pane, 700, 340);
    	primaryStage.setScene(scene);
    	primaryStage.setTitle("Verwaltung von Bahnhöfen");
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
    	lblAnzeige.setLayoutX(400);
    	lblAnzeige.setLayoutY(40);
      	lblAnzeige.setFont(font);
       	lblAnzeige.setStyle("-fx-font-weight: bold;"); 
       	lblName.setLayoutX(20);
    	lblName.setLayoutY(90);
    	lblOrt.setLayoutX(20);
    	lblOrt.setLayoutY(130);
    	lblAnzGleisen.setLayoutX(20);
    	lblAnzGleisen.setLayoutY(170);
    	lblLetzteRenovierung.setLayoutX(20);
    	lblLetzteRenovierung.setLayoutY(210);
    	lblZugarten.setLayoutX(20);
    	lblZugarten.setLayoutY(250);    	
       	pane.getChildren().addAll(lblEingabe, lblAnzeige, 
       		lblName, lblOrt, lblAnzGleisen,
       		lblLetzteRenovierung, lblZugarten);
    
    	// Textfelder
     	txtName.setLayoutX(170);
    	txtName.setLayoutY(90);
    	txtName.setPrefWidth(200);
    	txtOrt.setLayoutX(170);
    	txtOrt.setLayoutY(130);
    	txtOrt.setPrefWidth(200);
    	txtAnzGleisen.setLayoutX(170);
    	txtAnzGleisen.setLayoutY(170);
    	txtAnzGleisen.setPrefWidth(200);
      	txtLetzteRenovierung.setLayoutX(170);
      	txtLetzteRenovierung.setLayoutY(210);
      	txtLetzteRenovierung.setPrefWidth(200);
    	txtZugarten.setLayoutX(170);
    	txtZugarten.setLayoutY(250);
    	txtZugarten.setPrefWidth(200);
      	pane.getChildren().addAll( 
     		txtName, txtOrt, txtAnzGleisen,
     		txtLetzteRenovierung, txtZugarten);
     	
        // Textbereich	
        txtAnzeige.setEditable(false);
     	txtAnzeige.setLayoutX(400);
    	txtAnzeige.setLayoutY(90);
     	txtAnzeige.setPrefWidth(270);
    	txtAnzeige.setPrefHeight(185);
       	pane.getChildren().add(txtAnzeige); 
       	
        // Buttons
        btnEingabe.setLayoutX(20);
        btnEingabe.setLayoutY(290);
        btnAnzeige.setLayoutX(400);
        btnAnzeige.setLayoutY(290);
        pane.getChildren().addAll(btnEingabe, btnAnzeige); 
        
 		// Menue
  	    this.mnbrMenuLeiste.getMenus().add(mnDatei);
  	    this.mnDatei.getItems().add(mnItmCsvImport);
  	    this.mnDatei.getItems().add(mnItmTxtImport);
  	    this.mnDatei.getItems().add(new SeparatorMenuItem());
  	    this.mnDatei.getItems().add(mnItmCsvExport);
 	    pane.getChildren().add(mnbrMenuLeiste);
   }
    
    public void initListener() {
	    btnEingabe.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
        	    bahnhofControl.nehmeBahnhofAuf();
            }
	    });
	    btnAnzeige.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	        public void handle(ActionEvent e) {
	            zeigeBahnhofAn();
	        } 
   	    });
	    mnItmCsvImport.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	        public void handle(ActionEvent e) {
	       	 	bahnhofControl.leseAusDatei("csv");
	    	}
	    });
	    mnItmTxtImport.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		     	bahnhofControl.leseAusDatei("txt");
		    }
    	});
	    mnItmCsvExport.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				bahnhofControl.schreibeBahnhofInCsvDatei();
			}	
	    } );
    }
	    public void zeigeBahnhofAn(){
	    	if(bahnhofModel.getBahnhof() != null){
	    		txtAnzeige.setText(
	    			bahnhofModel.getBahnhof().gibBahnhofZurueck(' '));
	    	}
	    	else{
	    		zeigeInformationsfensterAn("Bisher wurde kein Bahnhof aufgenommen!");
	    	}
	    }
	    
	    public void zeigeInformationsfensterAn(String meldung){
	    	new MeldungsfensterAnzeiger(AlertType.INFORMATION,
	    		"Information", meldung).zeigeMeldungsfensterAn();
	    }	
	    
	    void zeigeFehlermeldungsfensterAn(String meldung){
	       	new MeldungsfensterAnzeiger(AlertType.ERROR,
	        	"Fehler", meldung).zeigeMeldungsfensterAn();
	    }
    
}
