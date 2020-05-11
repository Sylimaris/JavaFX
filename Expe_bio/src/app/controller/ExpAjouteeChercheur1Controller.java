package app.controller;

import app.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class ExpAjouteeChercheur1Controller {
	private int idChercheur;
	@FXML
	private Button ExpAjoutee;

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
		ExpAjoutee.setDisable(true);
	}
	@FXML
	private void handleDeconnexion() {
		mainApp.showConnexion();
	}

	@FXML
	private void demandeExp2() {
		mainApp.showExpAjouteeChercheur2(idChercheur);
	}

	@FXML
	private void retourExpDemandee() {
		mainApp.showChercheurExpDemandeeController(idChercheur);
	}

}
