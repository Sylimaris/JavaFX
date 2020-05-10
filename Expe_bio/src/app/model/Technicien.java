package app.model;

public class Technicien{
    private String nom_technicien, prenom_technicien, telephone_technicien, mail_technicien;
    private int id_technicien;

    public Technicien(String nomT, String prenomT, String telephoneT, String mailT, int identifiantT){
    	id_technicien = identifiantT;
        nom_technicien = nomT;
        prenom_technicien = prenomT;
        telephone_technicien = telephoneT;
        mail_technicien = mailT;
    }

	public String getNom() {
		return nom_technicien;
	}

	public String getPrenom() {
		return prenom_technicien;
	}

	public String getTelephone() {
		return telephone_technicien;
	}

	public String getMail() {
		return mail_technicien;
	}

	public int getId() {
		return id_technicien;
	}

}