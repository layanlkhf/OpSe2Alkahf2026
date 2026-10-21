package cafe;
//import cafe.Cafe;
//import cafe.CafeModel; // Warum Model?
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;	
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//import cafe.MeldungsfensterAnzeiger; //bekommt man diese klasse gegeben?
	
public class CafeView {

	private CafeModel cafeModel; //Attribute der anderen Klassen, Referenzen
	private CafeControl cafeControl;
	
	 //---Anfang Attribute der grafischen Oberflaeche---
    private Pane pane     					= new  Pane();
    private Label lblEingabe    	 		= new Label("Eingabe");
    private Label lblAnzeige   	 	    	= new Label("Anzeige");
    private Label lblName 					= new Label("Name:");
    private Label lblOrt             		= new Label("Ort:");
    private Label lblBeschreibung  	 		= new Label("Beschreibung:");
    private Label lblMitBaeckerei   		= new Label("Mit Bäckerei?");
    private Label lblKaffeProdukte  		= new Label("Kaffeprodukte:");
    private TextField txtName 	 			= new TextField();
    private TextField txtOrt				= new TextField();
    private TextField txtBeschreibung		= new TextField();
    private TextField txtMitBaeckerei		= new TextField();
    private TextField txtKaffeProdukte  	= new TextField();
    private TextArea txtAnzeige  			= new TextArea();
    private Button btnEingabe 		 		= new Button("Eingabe");
    private Button btnAnzeige 		 		= new Button("Anzeige");
    private MenuBar mnbrMenuLeiste  		= new MenuBar();
    private Menu mnDatei             		= new Menu("Datei");
    private MenuItem mnItmCsvImport 		= new MenuItem("csv-Import");
    private MenuItem mnItmTxtImport 		= new MenuItem("txt-Import");
    private MenuItem mnItmCsvExport 		= new MenuItem("csv-Export");    
    //-------Ende Attribute der grafischen Oberflaeche-------
    
    public CafeView(Stage primaryStage, CafeModel cafeModel, CafeControl cafeControl){
    	
    	this.cafeControl = cafeControl;
    	this.cafeModel = cafeModel;
    	
    	Scene scene = new Scene(this.pane, 700, 340);
    	primaryStage.setScene(scene);
    	primaryStage.setTitle("Verwaltung von Cafes");
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
    	lblBeschreibung.setLayoutY(170);
    	lblBeschreibung.setLayoutX(20);
    	lblMitBaeckerei.setLayoutX(20);
    	lblMitBaeckerei.setLayoutY(210);
    	lblKaffeProdukte.setLayoutX(20);
    	lblKaffeProdukte.setLayoutY(250);
    	//lblDienstleistungen.setLayoutX(20);
    	//lblDienstleistungen.setLayoutY(250);    	
       	pane.getChildren().addAll(lblEingabe, lblAnzeige, 
       		lblName, lblOrt, lblBeschreibung,
       		lblMitBaeckerei, lblKaffeProdukte);
    
    	// Textfelder
     	txtName.setLayoutX(170);
    	txtName.setLayoutY(90);
    	txtName.setPrefWidth(200);
    	txtOrt.setLayoutX(170);
    	txtOrt.setLayoutY(130);
    	txtOrt.setPrefWidth(200);
    	txtBeschreibung.setLayoutX(170);
    	txtBeschreibung.setLayoutY(170);
    	txtBeschreibung.setPrefWidth(200); //hier aufpassen das jedes Teilstück 3 mal zugeordnet wird!!
    	txtMitBaeckerei.setLayoutX(170);
    	txtMitBaeckerei.setLayoutY(210);
    	txtMitBaeckerei.setPrefWidth(200);
    	txtKaffeProdukte.setLayoutX(170);
    	txtKaffeProdukte.setLayoutY(250);
    	txtKaffeProdukte.setPrefWidth(200);
      	pane.getChildren().addAll( 
     		txtName, txtOrt, txtBeschreibung,txtMitBaeckerei,txtKaffeProdukte);
     	
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
        	    cafeControl.nehmeCafeAuf(); //Hier wird auf Control referenziert
            }
	    });
    
	    

	    
	    btnAnzeige.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	        public void handle(ActionEvent e) {
	            zeigeCafesAn();//Wird angezeigt -> Aufgabe von View!!
	        } 
   	    });
	    mnItmCsvImport.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	        public void handle(ActionEvent e) {
	       	 	cafeControl.leseAusDatei("csv");  //Hier wird auf Control referenziert
	    	}
	    });
	    mnItmTxtImport.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		     	cafeControl.leseAusDatei("txt");//Hier wird auf Control referenziert
		    }
    	});
	    mnItmCsvExport.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				cafeControl.schreibeCafeInCsvDatei();//Hier wird auf Control referenziert
			}	
	    });
    }
    
    public CafeModel getCafeModel() {
		return cafeModel;
	}

	public void setCafeModel(CafeModel cafeModel) {
		this.cafeModel = cafeModel;
	}

	public CafeControl getCafeControl() {
		return cafeControl;
	}

	public void setCafeControl(CafeControl cafeControl) {
		this.cafeControl = cafeControl;
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

	public Label getLblBeschreibung() {
		return lblBeschreibung;
	}

	public void setLblBeschreibung(Label lblBeschreibung) {
		this.lblBeschreibung = lblBeschreibung;
	}

	public Label getLblMitBaeckerei() {
		return lblMitBaeckerei;
	}

	public void setLblMitBaeckerei(Label lblMitBaeckerei) {
		this.lblMitBaeckerei = lblMitBaeckerei;
	}

	public Label getLblKaffeProdukte() {
		return lblKaffeProdukte;
	}

	public void setLblKaffeProdukte(Label lblKaffeProdukte) {
		this.lblKaffeProdukte = lblKaffeProdukte;
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

	public TextField getTxtBeschreibung() {
		return txtBeschreibung;
	}

	public void setTxtBeschreibung(TextField txtBeschreibung) {
		this.txtBeschreibung = txtBeschreibung;
	}

	public TextField getTxtMitBaeckerei() {
		return txtMitBaeckerei;
	}

	public void setTxtMitBaeckerei(TextField txtMitBaeckerei) {
		this.txtMitBaeckerei = txtMitBaeckerei;
	}

	public TextField getTxtKaffeProdukte() {
		return txtKaffeProdukte;
	}

	public void setTxtKaffeProdukte(TextField txtKaffeProdukte) {
		this.txtKaffeProdukte = txtKaffeProdukte;
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

	public void zeigeCafesAn(){
    	if(cafeModel.getCafe() != null){
    		txtAnzeige.setText(
    			cafeModel.getCafe().gibCafeZurueck(' '));
    	}
    	else{
    		zeigeInformationsfensterAn("Bisher wurde kein Cafe aufgenommen!");
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
