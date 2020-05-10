package app.model;

public class Lot {
	int code_barre_lot,id_vendeur,id_fabricant,taille_plaque,stock_lot;
	String date_livraison;

	/**
	 * @param code_barre_lot
	 * @param id_vendeur
	 * @param id_fabricant
	 * @param taille_plaque
	 * @param stock_lot
	 * @param date_livraison
	 */
	public Lot(int code_barre_lot, int id_vendeur, int id_fabricant, int taille_plaque, int stock_lot,
			String date_livraison) {
		super();
		this.code_barre_lot = code_barre_lot;
		this.id_vendeur = id_vendeur;
		this.id_fabricant = id_fabricant;
		this.taille_plaque = taille_plaque;
		this.stock_lot = stock_lot;
		this.date_livraison = date_livraison;
	}

	/**
	 * @return code_barre_lot
	 */
	public int getCode_barre_lot() {
		return code_barre_lot;
	}
	/**
	 * @return id_vendeur
	 */
	public int getId_vendeur() {
		return id_vendeur;
	}
	/**
	 * @return id_fabricant
	 */
	public int getId_fabricant() {
		return id_fabricant;
	}
	/**
	 * @return taille_plaque
	 */
	public int getTaille_plaque() {
		return taille_plaque;
	}
	/**
	 * @return stock_lot
	 */
	public int getStock_lot() {
		return stock_lot;
	}
	/**
	 * @return date_livraison
	 */
	public String getDate_livraison() {
		return date_livraison;
	}

}
