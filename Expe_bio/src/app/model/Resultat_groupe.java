package app.model;

public class Resultat_groupe {
	String statut_resultat;
	int id_res_groupe, id_groupe, moyenne_r, moyenne_v, moyenne_b, ecart_type_r, ecart_type_v, ecart_type_b, moyenne_transparence, ecart_type_transparence;
	/**
	 * @param statut_resultat
	 * @param id_res_groupe
	 * @param id_groupe
	 * @param moyenne_r
	 * @param moyenne_v
	 * @param moyenne_b
	 * @param ecart_type_r
	 * @param ecart_type_v
	 * @param ecart_type_b
	 * @param moyenne_transparence
	 * @param ecart_type_transparence
	 */
	public Resultat_groupe(String statut_resultat, int id_res_groupe, int id_groupe, int moyenne_r, int moyenne_v,
			int moyenne_b, int ecart_type_r, int ecart_type_v, int ecart_type_b, int moyenne_transparence,
			int ecart_type_transparence) {
		super();
		this.statut_resultat = statut_resultat;
		this.id_res_groupe = id_res_groupe;
		this.id_groupe = id_groupe;
		this.moyenne_r = moyenne_r;
		this.moyenne_v = moyenne_v;
		this.moyenne_b = moyenne_b;
		this.ecart_type_r = ecart_type_r;
		this.ecart_type_v = ecart_type_v;
		this.ecart_type_b = ecart_type_b;
		this.moyenne_transparence = moyenne_transparence;
		this.ecart_type_transparence = ecart_type_transparence;
	}

	/**
	 * @return the statut_resultat
	 */
	public String getStatut_resultat() {
		return statut_resultat;
	}
	/**
	 * @return the id_res_groupe
	 */
	public int getId_res_groupe() {
		return id_res_groupe;
	}
	/**
	 * @return the id_groupe
	 */
	public int getId_groupe() {
		return id_groupe;
	}
	/**
	 * @return the moyenne_r
	 */
	public int getMoyenne_r() {
		return moyenne_r;
	}
	/**
	 * @return the moyenne_v
	 */
	public int getMoyenne_v() {
		return moyenne_v;
	}
	/**
	 * @return the moyenne_b
	 */
	public int getMoyenne_b() {
		return moyenne_b;
	}
	/**
	 * @return the ecart_type_r
	 */
	public int getEcart_type_r() {
		return ecart_type_r;
	}
	/**
	 * @return the ecart_type_v
	 */
	public int getEcart_type_v() {
		return ecart_type_v;
	}
	/**
	 * @return the ecart_type_b
	 */
	public int getEcart_type_b() {
		return ecart_type_b;
	}
	/**
	 * @return the moyenne_transparence
	 */
	public int getMoyenne_transparence() {
		return moyenne_transparence;
	}
	/**
	 * @return the ecart_type_transparence
	 */
	public int getEcart_type_transparence() {
		return ecart_type_transparence;
	}


}
