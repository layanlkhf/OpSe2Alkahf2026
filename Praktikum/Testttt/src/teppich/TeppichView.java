package teppich;

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
import teppich.TeppichControl;
import teppich.TeppichModel;
import teppich.MeldungsfensterAnzeiger;

public class TeppichView {

	private TeppichControl teppichControl;
	private TeppichModel teppichModel;
	
	
	
	public TeppichControl getTeppichControl() {
		return teppichControl;
	}

	public void setTeppichControl(TeppichControl teppichControl) {
		this.teppichControl = teppichControl;
	}

	public TeppichModel getTeppichModel() {
		return teppichModel;
	}

	public void setTeppichModel(TeppichModel teppichModel) {
		this.teppichModel = teppichModel;
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

	public Label getLblArtikelnummer() {
		return lblArtikelnummer;
	}

	public void setLblArtikelnummer(Label lblArtikelnummer) {
		this.lblArtikelnummer = lblArtikelnummer;
	}

	public Label getLblKategorie() {
		return lblKategorie;
	}

	public void setLblKategorie(Label lblKategorie) {
		this.lblKategorie = lblKategorie;
	}

	public Label getLblBreite() {
		return lblBreite;
	}

	public void setLblBreite(Label lblBreite) {
		this.lblBreite = lblBreite;
	}

	public Label getLblLaenge() {
		return lblLaenge;
	}

	public void setLblLaenge(Label lblLaenge) {
		this.lblLaenge = lblLaenge;
	}

	public Label getLblFarben() {
		return lblFarben;
	}

	public void setLblFarben(Label lblFarben) {
		this.lblFarben = lblFarben;
	}

	public TextField getTxtArtikelnummer() {
		return txtArtikelnummer;
	}

	public void setTxtArtikelnummer(TextField txtArtikelnummer) {
		this.txtArtikelnummer = txtArtikelnummer;
	}

	public TextField getTxtKategorie() {
		return txtKategorie;
	}

	public void setTxtKategorie(TextField txtKategorie) {
		this.txtKategorie = txtKategorie;
	}

	public TextField getTxtBreite() {
		return txtBreite;
	}

	public void setTxtBreite(TextField txtBreite) {
		this.txtBreite = txtBreite;
	}

	public TextField getTxtLaenge() {
		return txtLaenge;
	}

	public void setTxtLaenge(TextField txtLaenge) {
		this.txtLaenge = txtLaenge;
	}

	public TextField getTxtFarben() {
		return txtFarben;
	}

	public void setTxtFarben(TextField txtFarben) {
		this.txtFarben = txtFarben;
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
    private Label lblArtikelnummer 			= new Label("Srtikelnummer:");
    private Label lblKategorie      		= new Label("Kategorie:");
    private Label lblBreite     	 		= new Label("Breite:");
    private Label lblLaenge      			= new Label("Länge:");
    private Label lblFarben         		= new Label("Farben:");
    private TextField txtArtikelnummer 	 	= new TextField();
    private TextField txtKategorie  		= new TextField();
    private TextField txtBreite     		= new TextField();
    private TextField txtLaenge  			= new TextField();
    private TextField txtFarben         	= new TextField();
    private TextArea txtAnzeige  			= new TextArea();
    private Button btnEingabe 		 		= new Button("Eingabe");
    private Button btnAnzeige 		 		= new Button("Anzeige");
    private MenuBar mnbrMenuLeiste  		= new MenuBar();
    private Menu mnDatei             		= new Menu("Datei");
    private MenuItem mnItmCsvImport 		= new MenuItem("csv-Import");
    private MenuItem mnItmTxtImport 		= new MenuItem("txt-Import");
    private MenuItem mnItmCsvExport 		= new MenuItem("csv-Export");    
    //-------Ende Attribute der grafischen Oberflaeche-------
    
    
    public void initKomponenten(){
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
       	lblArtikelnummer.setLayoutX(20);
       	lblArtikelnummer.setLayoutY(90);
    	lblKategorie.setLayoutX(20);
    	lblKategorie.setLayoutY(130);
    	lblBreite.setLayoutX(20);
    	lblBreite.setLayoutY(170);
    	lblLaenge.setLayoutX(20);
    	lblLaenge.setLayoutY(210);
    	lblFarben.setLayoutX(20);
    	lblFarben.setLayoutY(250);    	
       	pane.getChildren().addAll(lblEingabe, lblAnzeige, 
       		lblArtikelnummer, lblKategorie, lblBreite,
       		lblLaenge, lblFarben);
    
    	// Textfelder
     	txtArtikelnummer.setLayoutX(170);
     	txtArtikelnummer.setLayoutY(90);
     	txtArtikelnummer.setPrefWidth(200);
    	txtKategorie.setLayoutX(170);
    	txtKategorie.setLayoutY(130);
    	txtKategorie.setPrefWidth(200);
    	txtBreite.setLayoutX(170);
    	txtBreite.setLayoutY(170);
    	txtBreite.setPrefWidth(200);
      	txtLaenge.setLayoutX(170);
      	txtLaenge.setLayoutY(210);
      	txtLaenge.setPrefWidth(200);
      	txtFarben.setLayoutX(170);
      	txtFarben.setLayoutY(250);
      	txtFarben.setPrefWidth(200);
      	pane.getChildren().addAll( 
      			txtArtikelnummer, txtKategorie, txtBreite,
      			txtLaenge, txtFarben);
     	
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
	
public TeppichView(Stage primaryStage, TeppichControl teppichControl, TeppichModel teppichModel){
    	this.teppichControl = teppichControl;
    	this.teppichModel = teppichModel;
    	
    	Scene scene = new Scene(this.pane, 700, 340);
    	primaryStage.setScene(scene);
    	primaryStage.setTitle("Verwaltung von Teppichen");
    	primaryStage.show();
    	this.initKomponenten();
		this.initListener();
    }

public void initListener() {
    btnEingabe.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
    	    teppichControl.nehmeTeppichAuf();
        }
    });
    btnAnzeige.setOnAction(new EventHandler<ActionEvent>() {
    	@Override
        public void handle(ActionEvent e) {
            zeigeTeppichAn();
        } 
	    });
    mnItmCsvImport.setOnAction(new EventHandler<ActionEvent>() {
    	@Override
        public void handle(ActionEvent e) {
       	 	teppichControl.leseAusDatei("csv");
    	}
    });
    mnItmTxtImport.setOnAction(new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent e) {
	     	teppichControl.leseAusDatei("txt");
	    }
	});
    mnItmCsvExport.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			teppichControl.schreibeTeppichInCsvDatei();
		}	
    });
}

public void zeigeInformationsfensterAn(String meldung){
	new MeldungsfensterAnzeiger(AlertType.INFORMATION,
		"Information", meldung).zeigeMeldungsfensterAn();
}	

void zeigeFehlermeldungsfensterAn(String meldung){
   	new MeldungsfensterAnzeiger(AlertType.ERROR,
    	"Fehler", meldung).zeigeMeldungsfensterAn();
}


public void zeigeTeppichAn(){
	if(teppichModel.getTeppich() != null){
		txtAnzeige.setText(
			teppichModel.getTeppich().gibTeppichZurueck(' '));
	}
	else{
		zeigeInformationsfensterAn("Bisher wurde kein Bürgeramt aufgenommen!");
	}
} 

}
