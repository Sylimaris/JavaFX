package app.model;

import javafx.scene.control.CheckBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Technicien{
    private String NOM_TECHNICIEN, PRENOM_TECHNICIEN, motdepasse;
    private int ID_EQUIPE, ID_TECHNICIEN;
    private CheckBox checkboxT;

    /**
     * Le constructeur de la classe TECHNICIEN
     */
    public Technicien(String nomT, String prenomT, int id_equipeT, int identifiantT, String motdepasseT){
        NOM_TECHNICIEN = nomT;
        PRENOM_TECHNICIEN = prenomT;
        ID_TECHNICIEN = identifiantT;
        motdepasse = motdepasseT;
        checkboxT = new CheckBox();
    }

    /**
     * retourne le nom du TECHNICIEN
     * @return nom
     */
    public String getNom(){
        return NOM_TECHNICIEN;
    }

    /**
     * retourne le prenom du TECHNICIEN
     * @return prenom
     */
    public String getPrenom(){
        return PRENOM_TECHNICIEN;
    }

    /**
     * retourne l'identifiant du TECHNICIEN
     * @return identifiant
     */
    public int getIdentifiant(){
        return ID_TECHNICIEN;
    }

    /**
     * retourne le mot de passe du TECHNICIEN
     * @return motdepasse
     */
    public String getMotDePasse(){
        return motdepasse;
    }

    /**
     * Permet de modifier le nom du TECHNICIEN
     * @param newNom
     */
    public void setNom(String newNom){
    	NOM_TECHNICIEN=newNom;
    }

    /**
     * Permet de modifier le prénom du TECHNICIEN
     * @param newPrenom
     */
    public void setPrenom(String newPrenom){
    	PRENOM_TECHNICIEN=newPrenom;
    }

    /**
     * modifie l'identifiant du TECHNICIEN
     * @param newIdTechnicien
     */
    public void setIdTechnicien(int newIdTechnicien) {
    	ID_TECHNICIEN = newIdTechnicien;
    }

    /**
     * modifie le mot de passe du TECHNICIEN
     * @param newMdp
     */
    public void setMdp_Technicien(String newMdp) {
    	motdepasse = newMdp;
    }

    /**
     * Permet de retourner les checkbox
     * @return CheckBox
     */
    public CheckBox getCheckbox() {
            return checkboxT;
        }

    /**
     * Permet d'ajouter une checkbox
     * @param checkbox
     */
    public void setCheckBox(CheckBox checkbox) {
        this.checkboxT = checkbox;
    }

}