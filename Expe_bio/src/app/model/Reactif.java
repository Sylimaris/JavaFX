package app.model;

public class Reactif {
	int id_reactif, cv_rouge, cv_vert, cv_bleu, cm_rouge, cm_vert, cm_bleu, colorimetrique;
	String nom_reactif;
	/**
	 * @param id_reactif
	 * @param cv_rouge
	 * @param cv_vert
	 * @param cv_bleu
	 * @param cm_rouge
	 * @param cm_vert
	 * @param cm_bleu
	 * @param colorimetrique
	 * @param nom_reactif
	 */
	public Reactif(int id_reactif, int cv_rouge, int cv_vert, int cv_bleu, int cm_rouge, int cm_vert, int cm_bleu,
			int colorimetrique, String nom_reactif) {
		super();
		this.id_reactif = id_reactif;
		this.cv_rouge = cv_rouge;
		this.cv_vert = cv_vert;
		this.cv_bleu = cv_bleu;
		this.cm_rouge = cm_rouge;
		this.cm_vert = cm_vert;
		this.cm_bleu = cm_bleu;
		this.colorimetrique = colorimetrique;
		this.nom_reactif = nom_reactif;
	}
	/**
	 * @return the id_reactif
	 */
	public int getId_reactif() {
		return id_reactif;
	}
	/**
	 * @return the cv_rouge
	 */
	public int getCv_rouge() {
		return cv_rouge;
	}
	/**
	 * @return the cv_vert
	 */
	public int getCv_vert() {
		return cv_vert;
	}
	/**
	 * @return the cv_bleu
	 */
	public int getCv_bleu() {
		return cv_bleu;
	}
	/**
	 * @return the cm_rouge
	 */
	public int getCm_rouge() {
		return cm_rouge;
	}
	/**
	 * @return the cm_vert
	 */
	public int getCm_vert() {
		return cm_vert;
	}
	/**
	 * @return the cm_bleu
	 */
	public int getCm_bleu() {
		return cm_bleu;
	}
	/**
	 * @return the colorimetrique
	 */
	public int getColorimetrique() {
		return colorimetrique;
	}
	/**
	 * @return the nom_reactif
	 */
	public String getNom_reactif() {
		return nom_reactif;
	}

}
