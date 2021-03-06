package app.controller;

import app.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ExpDemandeeChercheurController {
	private int idChercheur;
	@FXML
	private Button ExpDemandee;
	@FXML
	private Button Deco;

	private MainApp mainApp;

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void initializeAll(int id){
		idChercheur=id;
		initialize();
	}
	@FXML
	public void initialize(){
		ExpDemandee.setDisable(true);
	}
	@FXML
	private void handleDeconnexion() {
		mainApp.showConnexion();
	}
	@FXML
	private void ajoutExp() {
		mainApp.showExpAjouteeChercheur1(idChercheur);
	}
}
