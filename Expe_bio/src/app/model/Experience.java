package app.model;

import java.util.ArrayList;
import java.util.Date;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Experience {

    private int ID_EXPERIENCE;
    private int ID_REACTIF;
    private String TYPE_EXPERIENCE;
    private float DUREE_D;
    private float FREQUENCE_OBS_F;
    private String ETAT_EXPERIENCE;
    //private  ; //Liste des réactifs de l'expérience

    public Experience (int idE, int idR, String type, float duree, float frequence, String etatE) {
    	ID_EXPERIENCE = idE;
    	ID_REACTIF = idR;
        TYPE_EXPERIENCE = type;
        DUREE_D = duree;
        FREQUENCE_OBS_F = frequence;
        ETAT_EXPERIENCE = etatE;
    }


    public int getIdExp()  {
        return ID_EXPERIENCE;
    }

    public int getIdReac() {
        return ID_REACTIF;
    }

    public String getTypeExp() {
        return TYPE_EXPERIENCE;
    }

    public float getDureeExp(){
        return DUREE_D;
    }

    public float getFrequenceObs() {
        return FREQUENCE_OBS_F;
    }

    public String getEtatExp() {
        return ETAT_EXPERIENCE;
    }

    /**
     * Permettent de retourner des types string.
     * @return StringProperty
     */
    public String idExpString() {
        return Integer.toString(ID_EXPERIENCE);
    }
}