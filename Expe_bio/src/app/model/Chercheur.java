package app.model;

public class Chercheur{
    private String nom_chercheur, prenom_chercheur, telephone_chercheur, mail_chercheur;
    private int id_equipe, id_chercheur;

    public Chercheur(String nomC, String prenomC, String telephoneC, String mailC, int identifiantC, int equipeC){
    	this.nom_chercheur=nomC;
    	this.prenom_chercheur=prenomC;
    	this.telephone_chercheur=telephoneC;
    	this.mail_chercheur=mailC;
    	this.id_equipe=equipeC;
    	this.id_chercheur=identifiantC;
    }

	public String getNom() {
		return nom_chercheur;
	}

	public String getPrenom() {
		return prenom_chercheur;
	}

	public String getTelephone() {
		return telephone_chercheur;
	}

	public String getMail() {
		return mail_chercheur;
	}

	public int getId_equipe() {
		return id_equipe;
	}

	public int getId() {
		return id_chercheur;
	}

}