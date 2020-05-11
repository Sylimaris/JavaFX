package app.controller;

import app.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ExpDemandeeChercheurController {
	@FXML
	private Button ExpDemandee;
	@FXML
	private Button Deco;

	private MainApp mainApp;

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	public void initialize(){
		ExpDemandee.setDisable(true);
	}
	@FXML
	private void handleDeconnexion() {
		mainApp.showConnexion();
	}
}
