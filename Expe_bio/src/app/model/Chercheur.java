
package app.model;

import javafx.scene.control.CheckBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Chercheur{
    private String NOM_CHERCHEUR, PRENOM_CHERCHEUR, motdepasse;
    private int ID_EQUIPE, ID_CHERCHEUR;
    private CheckBox checkboxC;

    /**
     * Le constructeur de la classe Chercheur
     */
    public Chercheur(String nomC, String prenomC, int id_equipeC, int identifiantC, String motdepasseC){
        NOM_CHERCHEUR = nomC;
        PRENOM_CHERCHEUR = prenomC;
        ID_EQUIPE = id_equipeC;
        ID_CHERCHEUR = identifiantC;
        motdepasse = motdepasseC;
        checkboxC = new CheckBox();
    }

    /**
     * retourne le nom du chercheur
     * @return nom
     */
    public String getNom(){
        return NOM_CHERCHEUR;
    }

    /**
     * retourne le prenom du chercheur
     * @return prenom
     */
    public String getPrenom(){
        return PRENOM_CHERCHEUR;
    }

    /**
     * retourne le nom de l'equipe du chercheur
     * @return nom_equipe
     */
    public int getIdEquipe(){
        return ID_EQUIPE;
    }

    /**
     * retourne l'identifiant du chercheur
     * @return identifiant
     */
    public int getIdentifiant(){
        return ID_CHERCHEUR;
    }

    /**
     * retourne le mot de passe du chercheur
     * @return motdepasse
     */
    public String getMotDePasse(){
        return motdepasse;
    }

    /**
     * Permet de modifier le nom du chercheur
     * @param newNom
     */
    public void setNom(String newNom){
    	NOM_CHERCHEUR=newNom;
    }

    /**
     * Permet de modifier le prénom du chercheur
     * @param newPrenom
     */
    public void setPrenom(String newPrenom){
    	PRENOM_CHERCHEUR=newPrenom;
    }

    /**
     * modifie le nom de l'equipe du chercheur
     * @param newIdEquipe
     */
    public void setIDEquipe(int newIdEquipe){
    	ID_EQUIPE = newIdEquipe;
    }

    /**
     * modifie l'identifiant du chercheur
     * @param newIdChercheur
     */
    public void setIdChercheur(int newIdChercheur) {
    	ID_CHERCHEUR = newIdChercheur;
    }

    /**
     * modifie le mot de passe du chercheur
     * @param newMdp
     */
    public void setMdp_chercheur(String newMdp) {
    	motdepasse = newMdp;
    }

    /**
     * Permet de retourner les checkbox
     * @return CheckBox
     */
    public CheckBox getCheckbox() {
            return checkboxC;
        }

    /**
     * Permet d'ajouter une checkbox
     * @param checkbox
     */
    public void setCheckBox(CheckBox checkbox) {
        this.checkboxC = checkbox;
    }

}