
package app.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ConnexionController implements Initializable {

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    /**
     * Permet d'afficher le message d'aide a coté de l'identifiant
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
     * Permet d'afficher l'option mot de passe oublier
     */
        public void help_mdp(MouseEvent event) throws IOException{
            pop_mdp = new Tooltip();
            pop_mdp.setText("Votre mot de passe est celui généré lors\n"
                + "de votre création de compte utilisateur.\n"
                + "Il est composé uniquement de lettres et de chiffres.");
            info_mdp.setTooltip(pop_mdp);
        }

    /**
     * Permet de se connecter a l'application
     */
    public void login(ActionEvent event) throws IOException{
        err_id.setVisible(false);
        err_id1.setVisible(false);
        String id = field_id.getText();
        String mdp = field_mdp.getText();
        try{
            switch (id) {
                case "chercheur@mail.fr":
                    if (mdp.equals("CHERCHEUR")){
                        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLChercheur.fxml"));
                        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
                        app.setScene(new Scene(home_page));
                        app.show();
                        app.centerOnScreen();
                    } else {err_id1.setText("Erreur de mot de passe ! "); err_id1.setVisible(true); mdp_help.setVisible(true);}  break;
                case "technicien@mail.fr":
                    if (mdp.equals("TECHNICIEN")){
                        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLLaborantin.fxml"));
                        Stage app = (Stage)((Node) event.getSource()).getScene().getWindow();
                        app.setScene(new Scene(home_page));
                        app.show();
                        app.centerOnScreen();
                    } else {err_id1.setText("Erreur de mot de passe !"); err_id1.setVisible(true); mdp_help.setVisible(true);}   break;
                default:
                    err_id.setText("Erreur d'identifiant !");
                    err_id.setVisible(true);
                    break;
            }
        } catch (IOException e) {}
   }
}