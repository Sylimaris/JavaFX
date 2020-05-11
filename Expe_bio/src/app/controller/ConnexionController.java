
package app.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import app.MainApp;
import app.model.Chercheur;
import app.model.Technicien;


public class ConnexionController{

    @FXML
    private TextField field_id;
    @FXML
    private TextField field_mdp;
    @FXML
    private Text err_id;
    @FXML
    private Text err_id1;
    @FXML
    private Tooltip pop_id;
    @FXML
    private Tooltip pop_mdp;
    @FXML
    private Label info_id;
    @FXML
    private Label info_mdp;
    @FXML
    private Text mdp_help;
    @FXML
    private RadioButton radioChercheur;
    @FXML
    private RadioButton radioTechnicien;

	private MainApp mainApp;


    /**
     * Permet d'afficher le message d'aide a cote de l'identifiant
     * @param event
     * @throws IOException
     */
    public void help_id(MouseEvent event) throws IOException{
	pop_id = new Tooltip();
	pop_id.setText("L'identifiant correspond à l'adresse mail\n "
	+ "de votre compte utilisateur.");
	info_id.setTooltip(pop_id);
	}

    /**
     * Permet d'afficher l'option mot de passe oublié
     */
	public void help_mdp(MouseEvent event) throws IOException{
	pop_mdp = new Tooltip();
	pop_mdp.setText("Votre mot de passe est celui généré lors\n"
	+ "de votre création de compte utilisateur.\n"
	+ "Il est composé uniquement de lettres et de chiffres.\nCAS TEST : CHERCHEUR pour un chercheur / TECHNICIEN pour un technicien ");
	info_mdp.setTooltip(pop_mdp);
	}

    /**
     * Permet de se connecter a l'application
     */
    public void login(ActionEvent event) throws IOException
    {
      	boolean mdpValide = false;
    	boolean loginValide = false;

        err_id.setVisible(false);
        err_id.setText("Erreur d'identifiant !");
        err_id1.setVisible(false);
        err_id1.setText("Erreur de mot de passe !");

        String id = field_id.getText();
        String mdp = field_mdp.getText();

        if (radioChercheur.isSelected()){
        	if (mdp.equals("CHERCHEUR")){
        		mdpValide = true;
        		for (Chercheur c : mainApp.getChercheurs()){
        			if (c.getMail().equals(id)){
        				loginValide = true;
        				mainApp.showChercheurExpDemandeeController(c.getId());
        			}
        	    }
        	}
        }

    	else if (radioTechnicien.isSelected()){
        	if (mdp.equals("TECHNICIEN")){
        		mdpValide = true;
        		for (Technicien t : mainApp.getTechniciens())
        		{
        			if (t.getMail().equals(id))
        			{
        				loginValide = true;
        				TechnicienGestionExpController controller = mainApp.showTechnicienGestionExp(t.getId());

        			}
        		}
        	}
        }
        if (!mdpValide){
			err_id1.setVisible(true);
		}
		if (!loginValide){
			err_id.setVisible(true);
		}
	}

	/**
	 * Gives access to the main app.
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

}


