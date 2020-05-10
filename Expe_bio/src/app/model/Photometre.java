package app.model;

public class Photometre {
	int id_photometre, en_etat_de_marche;

	/**
	 * @param id_photometre
	 * @param en_etat_de_marche
	 */
	public Photometre(int id_photometre, int en_etat_de_marche) {
		super();
		this.id_photometre = id_photometre;
		this.en_etat_de_marche = en_etat_de_marche;
	}

	/**
	 * @return the id_photometre
	 */
	public int getId_photometre() {
		return id_photometre;
	}

	/**
	 * @return the en_etat_de_marche
	 */
	public int getEn_etat_de_marche() {
		return en_etat_de_marche;
	}


}
