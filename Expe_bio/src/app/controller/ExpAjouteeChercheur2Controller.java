package app.controller;

import app.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ExpAjouteeChercheur2Controller {
	private Stage dialogStage;
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
	private void retourExpDemandee() {
		mainApp.showChercheurExpDemandeeController(idChercheur);
	}

	@FXML
	private void retourDemande1() {
		mainApp.showExpAjouteeChercheur1(idChercheur);
	}

	@FXML
	private void expAjoutee() {
		mainApp.showInfo("Ajout","Expérience Ajoutée à la liste!","Vous allez être redirigé sur la liste de vos expériences",dialogStage);
		mainApp.showChercheurExpDemandeeController(idChercheur);
	}
}
